import java.util.Scanner;

public class Player  extends GenericPlayer {

    public Player(String name) {
        super(name);
    }

    /**
     * Method responsible for the player hitting.
     * @param input
     * @return true or false depending on the answer.
     */
    @Override
    public boolean isHitting(Scanner input) {
        do {
            System.out.printf("%s do you want to hit (y/n)",name);
            String response = input.next();
            char first= response.toLowerCase().charAt(0);
            if (first =='y'){
                return true;
            }
            else if (first=='n'){
                return false;
            }
            else {
                System.out.println("Please type y or n.");
            }


            }while(true);
    }
}
