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
        System.out.printf("%s: Busted!%n", name);
    }

    abstract public boolean isHitting(Scanner input);

    public String toString(){
        return String.format("%s: %s%n", name,super.toString());
    }
}
