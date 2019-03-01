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
			System.out.printf("Enter player #%d name: ",i);
			String name=input.next();
			Player p = new Player(name);
			players.add(p);
		}

		//Add the house to the arraylist.
		House h = new House("House");
		players.add(h);

		//debug printing
		System.out.printf("%d%n", players.size());
		System.out.printf("%s%n",players.get(0));





		
	}



}
