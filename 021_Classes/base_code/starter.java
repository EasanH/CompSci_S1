import java.util.Scanner;
import java.util.Random;

class character{
		String role = "Wizard";
		int strength = 4;
		int dexterity = 5;
		int intelligence = 3;
		int constitution = 7;
		int charisma = 4;
	}
	
class starter {

	public static void main(String args[]) {
		// Your code goes below here
		character c = new character();
		System.out.println(c.role);
		System.out.println("Strength is: " + c.strength);
		System.out.println("Dexterity is: " + c.dexterity);
		System.out.println("Intelligence is: " + c.intelligence);
		System.out.println("Constitution is: " + c.constitution);
		System.out.println("Charisma is: " + c.charisma);
		
	}
}
