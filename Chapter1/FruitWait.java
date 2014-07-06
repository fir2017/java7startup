import java.io.IOException;
public class FruitWait {
	public static void main(String[] args) {
		int numOranges = 5;
		int numApples = 10;
		int numFruit = 0;
		numFruit = numOranges + numApples;
		System.out.println("A totally fruity program");
		System.out.println("Total fruit is " + numFruit);
		System.out.println("(press Enter to exit)");
		try {
			System.in.read();
		} catch(IOException e) {
			return;
		}
	}
}