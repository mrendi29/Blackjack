public class Hand extends CardCollection{
    public Hand() {
        super(5);
    }

    public int getValue(){
        int sum = 0;

        for(int i = 0;i<cards.size(); ++i){
            //Gets the value of the card that
            // sits in position i using the get value
            // in the Card Class
            if(cards.get(i).isFlipped()==false) {
                sum += cards.get(i).getValue();
            }
        }
        return sum;
    }

    @Override
    public String toString(){
      String output="";
      for (int i=0; i<cards.size();++i){
          //Gets the card in poosition i
          // and set its name to the ouput usng the to string used in card class
          output+= String.format("%s ", cards.get(i));
      }
      output+= String.format("(%d)%n",getValue());

      return  output;
    }
}