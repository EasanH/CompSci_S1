import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] array = new int[10];
		int x = 9;
		for(int i = 0; i < 10; i++){
			array[i] = x;
			x--;
			System.out.println(array[i]);
		}

		
	}
}
