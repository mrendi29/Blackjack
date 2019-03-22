import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class for Blackjack Game
 * @author schuster
 *
 */
public class Game {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Deck d= new Deck();

		System.out.printf("Welcome to Blackjack!%n%n");

		System.out.printf("How many players?%n");
		int numPlayers=input.nextInt();

		//The array list is going to include both players and house
		// (initia capacity should be numplayers+1 because we are also adding the house
		ArrayList<GenericPlayer> players= new ArrayList<>(numPlayers+1);

		//add each player
		for (int i =0; i<numPlayers; i++){
			System.out.printf("Enter player #%d name: ", i + 1);
			String name=input.next();
			Player p = new Player(name);
			players.add(p);
		}

		//Add the house to the arraylist.
		House h = new House("House");
		players.add(h);

		//debug printing
		System.out.printf("%d%n", players.size());
		System.out.printf("%s%n", players.get(1));

		//deal two cards to every player.
		for (int i = 0; i < players.size(); i++) {
			GenericPlayer p = players.get(i);
			d.deal(p);
			d.deal(p);

			if (p instanceof House) {
				House house = (House) p;
				house.flipFirstCard();
			}
			System.out.printf("%s", p);
		}


		//do the players want to hit?
		for (int i = 0; i < players.size(); ++i) {
			GenericPlayer p = players.get(i);

			if (p instanceof House) {
				House house = (House) p;
				house.flipFirstCard();
			}


			while (!p.isBusted()) {

				if (p.isHitting(input)) {
					d.deal(p);
					//if hte player hits we want to know what card did he get
					System.out.printf("%s", p);
				} else {
					break;
				}
				//If the player busts.
				if (p.getValue() > 21) {
					p.busted();
				}

			}

		}//end of previous loop

		//Get house hand value.
		int houseValue = h.getValue();

		for (int i = 0; i < players.size(); ++i) {
			GenericPlayer p = players.get(i);
			if (p instanceof House) {
				continue;
			}
			//Win condition check
			if (!p.isBusted() && houseValue > 21) {
				//Player wins
				p.wins();
			} else if (p.getValue() == houseValue && !p.isBusted()) {
				//Player pushed
				p.pushed();
			} else if (!p.isBusted() && p.getValue() > houseValue) {
				//Player wins
				p.wins();
			} else {
				//Player looses
				p.lose();
			}
		}




		
	}



}
