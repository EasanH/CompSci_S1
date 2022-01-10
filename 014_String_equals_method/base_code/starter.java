import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a class. Warrior, Wizard, Rouge: ");
		String type = sc.nextLine();
		
		if(type.equals("Warrior")) {
			System.out.println("You are a Warrior.");
		}else if(type.equals("Wizard")) {
			System.out.println("You are a Wizard.");
		}else if(type.equals("Rouge")) {
			System.out.println("You are a Rouge.");
		}else{
			System.out.println("Your input does not correlate with any class, please re-enter it.");
		}
	}
}
