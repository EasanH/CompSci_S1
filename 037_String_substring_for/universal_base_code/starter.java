import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a word: ");
		String x = sc.nextLine();
		for(int i=0;i<x.length();i++)
			System.out.println(x.substring(i,(i+1)));
	}
}
