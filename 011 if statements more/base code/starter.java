import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input an x value: ");
		 int x = sc.nextInt();
		 
		System.out.print("Please input a y value: ");
		int y = sc.nextInt();
		
		if(x != y) {
			System.out.println(x + " and " + y + " are differnt values");
		}
		if(x == y) {
			System.out.println(x + " and " + y + " are the same value");
		}
	}
}
