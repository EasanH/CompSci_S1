import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a full name (First Last): ");
		String name = sc.nextLine();
		
		int space = name.indexOf(" ") + 1;
		System.out.println("Your lase name is: " + name.substring(space, name.length()));
	}
}
