import pkg.character;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		character c = new character();
		
		c.setRole();
		c.setConstituition();
		c.setMaxHealth();
		c.setHealth(2);
	}
}
