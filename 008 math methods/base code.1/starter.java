import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an x value");
		double xval = sc.nextDouble();
		
		System.out.println("Please input a y value");
		double yval = sc.nextDouble();
		
		System.out.println(Math.max(xval, yval) + " is the greater value");
		System.out.println(Math.sqrt(yval) + " is the sqare root of y");
		System.out.println(Math.pow(xval, yval) + " is x^y");
		
	}
}
