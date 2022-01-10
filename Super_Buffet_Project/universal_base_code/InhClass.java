import pkg.MathClass;
import java.util.Scanner;
import java.util.Random;


public class InhClass extends MathClass {
	MathClass mc = new MathClass();
	public double absTS(double x){//absolute value
		double y = mc.abs(x);
		System.out.println(y);
		return y;
	}
	
	public int absTS(int x){
		int z = mc.abs(x);
		System.out.println(z);
		return z;
	}
	
	public double maxTS(double x, double y){//maximum
		double z = mc.max(x, y);
		System.out.println(z);
		return z;
	}
	
	public double minTS(double x, double y, double z) {//minimum
		double a = mc.min(x, y, z);
		System.out.println(a);
		return a;
	}
	
	public double minTS(double x, double y) {
		double z = mc.min(x, y);
		System.out.println(z);
		return z;
	}
	
	public double powTS(double x, int y) {//power
		double z = mc.pow(x, y);
		System.out.println(z);
		return z;
	}
	
	public int powTS(int x, int y) {
		int z = mc.pow(x, y);
		System.out.println(z);
		return z;
	}
	
	public double sqrtTS(double x) {//square root
		double z = mc.sqrt(x);
		System.out.println(z);
		return z;
	}
	
	public double avgTS(int[] array){//average
		double z = mc.avg(array);
		System.out.println(z);
		return z;
	}
	
	public double avgTS(double[] array){
		double z = mc.avg(array);
		System.out.println(z);
		return z;
	}
	
	public int ranTS(int x) {
		int z = mc.ran(x);
		System.out.println(z);
		return z;
	}
	
	public static void main(String[] args){
		InhClass ic = new InhClass();
		double[] array1 = {1,3,5};
		ic.avgTS(array1);
		
	}	
} 


