import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int[] x){
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);
	}
	
	public static int getArrayAverage(int[] x){
		int z = 0;
		for(int i=0;i<x.length;i++){
			z = z + x[i];
		}
		int y = z/x.length;
		return y;
	}
	
	public static int getArrayMax(int [] x){
		int y = 0;
		for(int i=0;i<x.length;i++){
			if(x[i]>y)
				y = x[i];
		}
		return y;
	}
	
	public static int getArrayMin(int [] x){
		int y = 101;
		for(int i=0;i<x.length;i++){
			if(x[i]<y)
				y = x[i];
		}
		return y;
	}
	
	public static void main(String args[]) {
		Random rand = new Random();
		starter a = new starter();
		int[] array = new int[100];
		for(int i=0;i<array.length;i++){
			array[i] = rand.nextInt(100) + 1;
		}
		toStringArray(array);
		System.out.println("Avg: " + getArrayAverage(array));
		System.out.println("Max: " + getArrayMax(array));
		System.out.println("Min: " + getArrayMin(array));
	}
}
