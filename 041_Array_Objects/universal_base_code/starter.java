import pkg.Warrior;
import pkg.Wizard;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Warrior[] x = new Warrior[100];
		for(int i = 0; i<100;i++)
			x[i] = new Warrior();
		
		Wizard[] y = new Wizard[100];
		for(int i = 0; i<100;i++)
			y[i] = new Wizard();
		int a = 0;
		int b = 0;
		
		while(true){
			y[a].attack(x[b]);
			if(x[b].isDead())
				b++;
			if(b == 100){
				System.out.println("The wizard army won the war with " + (100-a) + " troops left");
				break;
			}
			x[b].attack(y[a]);
			if(y[a].isDead())
				a++;
			if(a == 100){
				System.out.println("The warrior army won the war with " + (100-b) + " troops left");
				break;
			}
		}
	}
}
