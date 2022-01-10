import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Role[] x = new Role[3];
		x[0] = new Warrior();
		x[1] = new Wizard();
		x[2] = new Rogue();
		
		System.out.println("Warrior name: " + x[0].getName());
		System.out.println("Warrior art: ");
		x[0].printArt();
		System.out.println("Wizard name: " + x[1].getName());
		System.out.println("Wizard art: ");
		x[1].printArt();
		System.out.println("Rogue name: " + x[2].getName());
		System.out.println("Rogue art: ");
		x[2].printArt();
	}
}
