import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int rand1 = rand.nextInt(10);
		System.out.println("Random number 0-9: " + rand1);
		int rand2 = rand.nextInt(101);
		System.out.println("Random number 0-100: " + rand2);
		double rand3 = rand.nextDouble();
		System.out.println("Random number 2.5-3.5: " + (rand3 + 2.5));
		double rand4 = rand.nextDouble();
		int rand5 = rand.nextInt(575);
		System.out.println("Random number 14-589: " + (rand4 + 14 + rand5));
	}
}
