import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int c = rand.nextInt(149) + 51;
		int[] array = new int[c];
		int min = 101;
		int max = 0;
		int sum = 0;
		int avg = 0;
		for(int i=0;i<array.length;i++){
			array[i] = rand.nextInt(100) + 1;
		}
			
		for(int y=0;y<array.length;y++){
			if(array[y]<min)
				min = array[y];
			if(array[y]>max)
				max = array[y];
			sum = sum + array[y];
			avg = sum/array.length;
		}
		System.out.println("Number of elements: " + array.length);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + avg);
	}
}
