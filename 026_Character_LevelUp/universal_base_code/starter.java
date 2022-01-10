import pkg.character;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		character c = new character();
		System.out.println("What is your name adventurer?");
		c.name = sc.nextLine();
		
		System.out.println("What do you want to be known by? (Ex: The Destroyer of Worlds)");
		c.title = sc.nextLine();
		
		c.setRole();
		c.levelUp();
		c.levelUp();
		
	}
}
