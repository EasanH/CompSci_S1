import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
			Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("How many time do you want it to be repeated?");
		int repeat = sc.nextInt();
		
		while(true) {
			System.out.println(name);
			if(repeat == 1) {
				break;
			}
			repeat = repeat - 1;
		}



		
	}
}
