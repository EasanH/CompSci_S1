import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int i = 0;
		while(i<100){
			System.out.println(rand.nextInt(100) + 1);
			i++;
		}


		
	}
}
