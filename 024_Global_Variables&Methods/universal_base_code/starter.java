import pkg.myCharacter;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myCharacter mc = new myCharacter();
		mc.myToString();
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Which class do you choose? Wizard, Warrior, Rogue");
		String x = sc.nextLine();
		
		myCharacter c = new myCharacter(x);
		c.myToString();
		
	}
}