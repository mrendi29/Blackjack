import java.util.Scanner;

public class House extends GenericPlayer {

    public House(String name){
        super(name);
    }

    @Override
    public boolean isHitting(Scanner input) {
        //Getvalue is inherited method from hand.
        int value= getValue();
        if (value> 16 || isBusted()==true) {
            return  false;
        }else{
            return true;
        }
    }

    public void flipFirstCard(){
        cards.get(0).flip();
    }




}
