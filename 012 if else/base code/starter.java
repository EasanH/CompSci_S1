import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rand1 = rand.nextInt(1000);
		int rand2 = rand1 + 1;
		
		System.out.println("Welcome to Easan's Random Number Guessing Game");
		System.out.print("Guess which number between 1 and 1000 was drawn: ");
		int input = sc.nextInt();
		
		if(input == rand2) {
		System.out.println("CONGRATULATIONS!!! YOU WIN!!!");	
		}else{
			System.out.println("Tough Luck... The correct answer was " + rand2 + ". Feel free to try again!");
		}
	}
		
}

