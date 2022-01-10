import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y) {
		int z;
		if(y == 0){
			z = 1;
		}else{
			z = x;
			while(y > 1) {
				z = z*x;
				y = y-1;
			}
		}
		return z;
	}
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println(pow(4, 2));


		
	}
}
