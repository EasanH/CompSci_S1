import pkg.MathClass;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static void main(String args[]) {
		MathClass mc = new MathClass();
		int[] array = new int[1000];
		for(int i = 0; i < 1000; i++){
			array[i] = mc.ran(1001);
		}
		int[] array1 = new int[1000];
		for (int x = 0; x < 1000; x++){
			array1[x] = mc.pow(array[x], 2); 
		}
		double[] array2 = new double[1000];
		for (int y = 0; y < 1000; y++){
			array2[y] = mc.sqrt(array[y]);
		}
		double d = array2[0];
		for(int e = 0; e < 1000; e++){
			if(array2[e] < d)
			d = array2[e];
		}
		double b = array1[0];
		for(int c = 0; c < 1000; c++){
			if(array1[c] > b)
			b = array1[c];
		}
		double f = mc.avg(array);
		double g = mc.avg(array1);
		double h = mc.avg(array2);
		System.out.println("The average is " + (f+g+h)/3);
		System.out.println("The minimum is " + d);
		System.out.println("The maximum is " + b);
	}
}
