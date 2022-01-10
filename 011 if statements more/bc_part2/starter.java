import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input an x value: ");
		double x = sc.nextDouble();
		
		System.out.print("Please input a y value: ");
		double y = sc.nextDouble();
		
		System.out.print("Please input a z value: ");
		double z = sc.nextDouble();
		
		if((x>y) && (x>z)) {
			System.out.println(x + " is the largest value.");
		}
		if((y>x) && (y>z)) {
			System.out.println(y + " is the largest value.");
		}
		if((z>x) && (z>y)) {
			System.out.println(z + " is the largest value.");
		}
		
		if((x<y) && (x<z)) {
			System.out.println(x + " is the smallest value.");
		}
		if((y<x) && (y<z)) {
			System.out.println(y + " is the smallest value.");
		}
		if((z<x) && (z<y)) {
			System.out.println(z + " is the smallest value.");
		}
	}
}
