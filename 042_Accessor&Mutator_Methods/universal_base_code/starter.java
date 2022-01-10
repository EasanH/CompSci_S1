import pkg.Dwarf;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Dwarf[] x = new Dwarf[100];
				
		for(int i=0;i<100;i++){
			x[i] = new Dwarf();
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
				
			int b = rand.nextInt(100) + 1;	
			x[i].setAge(b);
		}
		
		for(int i=0;i<100;i++)
			System.out.println(x[i].getName() + " is " + x[i].getAge() + " years old.");
		
	}
}
