import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input your name below.");
		String name = sc.nextLine();
		
		System.out.println("Please input your age below.");
		int age = sc.nextInt();
		
		System.out.println("Please input your birthday month below.");
		int month = sc.nextInt();
		
		System.out.println("Please input the day you were born on below.");
		int day = sc.nextInt();
		
		System.out.println("Please input the year you were born below.");
		int year = sc.nextInt();
		
		System.out.println("How much is a buck fifty?");
		double answer = sc.nextDouble();
		
		System.out.println("Hello " + name + "!");
		System.out.println(name + " is " + age + " years old and was born on " + month + "/" + day + "/" + year);
		System.out.println("A buck fifty is $" + answer);
	}
}
