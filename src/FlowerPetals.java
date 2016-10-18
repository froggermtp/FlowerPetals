import java.util.Random;
import java.util.Scanner;

/**
 * The FlowerPetals program generates a flower with a random number of petals.
 * The user can then use the enter key to pick the petals.
 * 
 * @author Matthew Parris
 * @version 1.0
 */
public class FlowerPetals {
	/**
	 * Runs the main program.
	 * 
	 * @param args Not used.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// Flower has a random number of petals between 1 and 10.
		int numberOfPetals = randInt(1, 10);
		// Start off sprung.
		boolean love = true;
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("You find a flower...");
		
		do {
			System.out.println("Picking a petal...");
			
			console.nextLine();
			
			numberOfPetals--;
			love = !love;
			
			if (love)
				System.out.println("She loves you...");
			else
				System.out.println("She loves you not...");
		} while (numberOfPetals > 0);
		
		System.out.println("All the petals are gone...");
		
		console.close();
	}
	
	/**
	 * Returns a psuedo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>
	 * 
	 * @param min Minimum value.
	 * @param max Maximum value. Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public static int randInt(int min, int max) {
		Random rand = new Random();
		
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;
		
		return randomNum;
	}
}
