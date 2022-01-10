import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Wizard a = new Wizard();
		Warrior b = new Warrior("Stilton");
		Rogue c = new Rogue();

		System.out.println("Warrior name: " + a.getName());
		System.out.println("Wizard name: " + b.getName());
		System.out.println("Rogue name: " + c.getName());
		System.out.println("Rogue art: ");
		Rogue.printArt();
	}
}
