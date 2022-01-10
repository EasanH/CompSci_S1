import pkg.character;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		character c = new character("Warrior");
		
		c.intro();
		c.setRole();
		c.levelUp();
		c.printStats();
		c.takeDamage(5);
		c.setHealth(maxHealth);
		c.levelUp();
		c.takeDamage(20);
		c.isDead();
		c.printStats();
	}
}
