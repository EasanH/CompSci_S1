package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public String role = "No Role";
	public int strength = 4;
	public int dexterity = 5;
	public int intelligence = 3;
	public int constitution = 7;
	public int charisma = 4;

	public myCharacter(){}

	public myCharacter(String x) {
			if(x.equals("Warrior")) {
			System.out.println("You are a Warrior. Your strength is unparalleled!");
		}else if(x.equals("Wizard")) {
			System.out.println("You are a Wizard. Your knowledge is vast!");
		}else if(x.equals("Rogue")) {
			System.out.println("You are a Rogue. Your speed is terrifying!");
		}else{
			x = "No Role";
			System.out.println("Your input does not correlate with any class, please re-run program.");
		}
		role = x;
	}
	
}


