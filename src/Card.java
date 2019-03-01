/**
 * 
 * @author schuster
 *
 */
public class Card {
	private int value;
	private String name; //"King of Diamonds" or "kd"
	private boolean isFlipped=false;
	
	public Card(int v, String s) {
		value=v;
		name=s;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		String output;
		if(isFlipped) {
			output="XX";
		} else {
			output=name;
		}
		return output;
	}
	
	public void flip() {
		isFlipped=!isFlipped;
	}
	
	public boolean isFlipped() {
		return isFlipped;
	}
}









