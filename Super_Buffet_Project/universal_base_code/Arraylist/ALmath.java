package pkg;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ALmath {
	
	public double abs(double x){//absolute value
		double z;
		if(x >= 0){
			z = x;
		}else{
			z = x * -1;
		}
		return z;
	}
	
	public int abs(int x){
		int z;
		if(x >= 0){
			z = x;
		}else{
			z = x * -1;
		}
		return z;
	}
	
	public double max(double x, double y){//maximum
		if(x<y){
			return y;
		}else{
			return x;
		}
	}
	
	public int max(int x, int y){
		if(x<y){
			return y;
		}else{
			return x;
		}
	}
	
	public double min(double x, double y, double z) {//minimum
		if(x<y && x<z) {
			return x;
		}else if(y<x && y<z){
			return y;
		}else{
			return z;
		}
	}
	
	public double min(double x, double y) {
		if(x<y) {
			return x;
		}else{
			return y;
		}
	}
	
	public double pow(double x, int y) {//power
		double z;
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
	
	public int pow(int x, int y) {
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
	
	public double sqrt(double x) {//square root
		//sqrty = (sqrtn + x/sqrtn)/2 
		double z = x/2;
		double y;
		
		if(x == 0)
		return x;
		
		do{
			y = z;
			z = (y + (x/y))/2;
		}while((y - z) != 0);
		
		return z;
	}
	
	public double avg(int[] array){//average
		double x = 0;
		for(int y = 0; y < array.length; y++){
			x = x + array[y];
		}
		double z = x/array.length;
		return z;
	}
	
	public double avg(ArrayList<Double> array){
		double x = 0;
		for(int y = 0; y < array.length; y++){
			x = x + array[y];
		}
		double z = x/array.length;
		return z;
	}
	
	public int ran(int x) {//idk how to do pick a random value lol
		/*int[] array = new int[x];
		while(x>0){
		 int z = x-1;
		 array[z] = z;
		 x = x-1;
		}
		return array.length;*/
		Random rand = new Random();
		int z = rand.nextInt(x);
		return z;
		
	}
	
	public static void main(String[] args){
		MathClass mc = new MathClass();
		
		
	}	
} 


