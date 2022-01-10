import pkg.DwarfClass;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		DwarfClass[] x = new DwarfClass[100];
		int b = -1;
		for(int i = 0; i<100; i++){
			x[i] = new DwarfClass();
			int a = rand.nextInt(7);
			if(a==0)
				x[i].setName("Grumpy");
			else if(a==1)
				x[i].setName("Dopey");
			else if(a==2)
				x[i].setName("Doc");
			else if(a==3)
				x[i].setName("Happy");
			else if(a==4)
				x[i].setName("Bashful");
			else if(a==5)
				x[i].setName("Sneezy");
			else if(a==6)
				x[i].setName("Sleepy"); 
				
			x[i].setAge(rand.nextInt(100) + 1);
			if(x[i].getName() == x[0].getName())
				b++;
		}
		System.out.println("There are " + b + " duplicates of the name " + x[0].getName());
		
	}
}
