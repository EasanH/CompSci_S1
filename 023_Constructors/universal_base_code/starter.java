import pkg.myCharacter;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myCharacter mc = new myCharacter();
		
		System.out.println("Your role is " + mc.role);
		System.out.println("Strength is: " + mc.strength);
		System.out.println("Dexterity is: " + mc.dexterity);
		System.out.println("Intelligence is: " + mc.intelligence);
		System.out.println("Constitution is: " + mc.constitution);
		System.out.println("Charisma is: " + mc.charisma);
		System.out.println("----------------------------------------------------");
		
		System.out.println("Which class do you choose? Wizard, Warrior, Rogue");
		String x = sc.nextLine();
		
		myCharacter c = new myCharacter(x);
		
		System.out.println("Your role is " + c.role);
		System.out.println("Strength is: " + c.strength);
		System.out.println("Dexterity is: " + c.dexterity);
		System.out.println("Intelligence is: " + c.intelligence);
		System.out.println("Constitution is: " + c.constitution);
		System.out.println("Charisma is: " + c.charisma);
		
	}
}
