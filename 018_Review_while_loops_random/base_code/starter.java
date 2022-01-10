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
	
		while(true){
			int input = sc.nextInt();
			
			if(input == rand2) {
				System.out.println("CONGRATULATIONS!!! YOU WIN!!!");
				break;
			}
			System.out.print("I'm sorry that is not correct. Try again:");
		}
	}
}
