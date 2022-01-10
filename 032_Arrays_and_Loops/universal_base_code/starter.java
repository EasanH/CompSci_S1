import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] array = new int[1000];
		for(int i=0;i<array.length;i++){
			array[i] = rand.nextInt(100) + 1;
			System.out.println(array[i]);
		}

		
	}
}
