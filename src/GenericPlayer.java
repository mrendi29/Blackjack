import java.util.Scanner;

public abstract class GenericPlayer extends  Hand{

    protected String name;
    protected boolean isBusted;

    public GenericPlayer(String name) {
        this.name = name;
        isBusted=false;
    }

    public boolean isBusted() {
        return isBusted;
    }

    //Since this method will be repeated many times we dcan just put that here.
    public void busted(){
        isBusted = true;
        System.out.printf("%s: Busted!%n", name);
    }

    public void wins() {
        System.out.printf("%s: WINS!", name);
    }

    public void pushed() {
        System.out.printf("%s: Pushed!", name);
    }

    public void lose() {
        System.out.printf("%s: LOST!", name);
    }

    abstract public boolean isHitting(Scanner input);

    public String toString(){
        return String.format("%s: %s%n", name,super.toString());
    }
}
