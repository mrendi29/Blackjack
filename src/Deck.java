import java.util.Random;

public class Deck extends CardCollection {
    Random rand = new Random();
    public Deck(){
        //Passes 52 to the super class to set the size of the array 52
        super(52);
        populate();
    }

    public void deal(Hand h) {
        //Get a random number
        int r = rand.nextInt(cards.size());
        //Get that random card
        Card c= cards.get(r);
        //Add it to the hand
        h.addCard(c);
        //Remove from the deck.
        remove(c);
    }

    private void shuffle(){
        cards.clear();
        populate();

    }

    private void populate() {

        int[] value= new int [13];

        String[] name = new String[13];

        String[] suit = new String[4];
        suit[0]="d";
        suit[1]="c";
        suit[2]="h";
        suit[3]="s";

        value[0]=2; name[0]="2";
        value[1]=3; name[1]="3";
        value[2]=4; name[2]="4";
        value[3]=5; name[3]="5";
        value[4]=6; name[4]="6";
        value[5]=7; name[5]="7";
        value[6]=8; name[6]="8";
        value[7]=9; name[7]="9";
        value[8]=10; name[8]="10";
        value[9]=10; name[9]="J";
        value[10]=10; name[10]="Q";
        value[11]=10; name[11]="K";
        value[12]=1; name[12]="1";

        for (int i=0; i <suit.length;++i){
            //value loop
            for (int j=0; j<value.length;++j ){
                //For example we get 2d
                String s = name[j]+suit[i];
                addCard(new Card(value[j],s));
            }
        }


    }


}
