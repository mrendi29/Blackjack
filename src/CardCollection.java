import java.util.ArrayList;

abstract public class CardCollection {
    protected ArrayList<Card> cards;

    protected CardCollection(int num) {
        //IF you put a value into the constructor for the array list
        // it sets the initial capacity to that number
        this.cards = new ArrayList<>(num);
    }

    //Add the card to the arraylist
    public void addCard(Card card) {
        cards.add(card);
    }

    //Remove card from the arraylist
    public void remove(Card card) {
        //This finds the exact value in the arraylist and removes it (same as ==)
        cards.remove(card);
    }
}
