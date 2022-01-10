import pkg.character;
import java.util.Scanner;
import java.util.Random;


class starter {
	public String role;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		character c = new character();
		System.out.println("What is your name adventurer?");
		c.name = sc.nextLine();
		
		System.out.println("What do you want to be known by? (Ex: The Destroyer of Worlds)");
		c.title = sc.nextLine();
		
		c.setRole();
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("You have 25 trait points that you can spend on: Strength, Dexterity, Intelligence, Constitution, Charisma");
		System.out.println("");
		
		c.setStrength();
		
		c.setDexterity();
		
		c.setIntelligence();
		
		c.setConstituition();
		
		c.setCharisma();

		c.printall();
		
		c.setAll("Wizard", 5, 5, 5, 5, 5);
		
		c.printall();
	}
}
