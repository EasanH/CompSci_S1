import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input any phrase and I will return it in backwards order: ");
		String phrase = sc.nextLine();
		String backwards = "";
		while(phrase.indexOf(" ") != -1){
			int x = phrase.indexOf(" ");
			backwards = phrase.substring(0, x) + " " + backwards;
			phrase = phrase.substring((x+1), phrase.length());
		}
		System.out.println(phrase + " " + backwards);
	}
}
