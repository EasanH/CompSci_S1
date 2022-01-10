package pkg;
import java.util.Scanner;
import java.util.Random;


public class character {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	public String name;
	public String title;
	String role = "No Role";
	int strength = 0;
	int dexterity = 0;
	int intelligence = 0;
	int constitution = 0;
	int charisma = 0;
	int level = 0;
	int points = 0;
	boolean flag4 = true;
	int maxHealth = 0;
	int currentHealth = 0;
	
	public void intro(){
		System.out.println("What is your name adventurer?");
		name = sc.nextLine();
		System.out.println("What do you want to be known by? (Ex: The Destroyer of Worlds)");
		title = sc.nextLine();
	}
	
	public boolean checkPoints(int x){
		if((x>10) || (x<0) || (x>points))
			return false;
		else 
			return true;
	}
	
	public void limit(){
		if(points == 0){
			 flag4 = false;
		}
	}
	
	public void setRole(){
		boolean flag = false;
		
		while(flag == false){
			System.out.println("Select a class type: Warrior, Wizard, Rogue");
			role = sc.nextLine();
			if(role.equals("Warrior")) {
				System.out.println("You are a Warrior! Your flashy sword skills will surely earn you glory!");
				flag = true;
			}else if(role.equals("Wizard")) {
				System.out.println("You are a Wizard! You strike your enemies down from afar using your mastery of spells!");
				flag = true;
			}else if(role.equals("Rogue")){
				System.out.println("Your are a Rogue! Your terrifying speed and quick combat style strikes down all!");
				flag = true;
			}else{
				System.out.println("Your input does not correlate with any classtype, please re-enter your desired role.");
				flag = false;
			}
		}
	}
	
	 
	
	public void printall(){
		System.out.println("---------------------------------------------------------");
		System.out.println("You are " + name + " " + title);
		System.out.println("Your role is " + role);
		System.out.println("Strength is: " + strength);
		System.out.println("Dexterity is: " + dexterity);
		System.out.println("Intelligence is: " + intelligence);
		System.out.println("Constitution is: " + constitution);
		System.out.println("Charisma is: " + charisma);
		System.out.println("---------------------------------------------------------");
	}
	
	public void printStats(){
		System.out.println("-----------------------------------------");
		System.out.println("Level: " + level);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Constitution: " + constitution);
		System.out.println("Charisma: " + charisma);
		System.out.println("-----------------------------------------");
	}
	
	public void setStrength(){
		if(flag4 == true){
			System.out.print("Strength 0/10: ");
			int strength1 = sc.nextInt();
			while (checkPoints(strength1) == false) {
				System.out.println("Please re-enter your input to make sure it is positive, smaller than 10, and isn't more than your available points.");
				System.out.print("Strength: ");
				strength1 = sc.nextInt();
			}
			strength = strength + strength1;
			points = points - strength1;
			System.out.println("You have " + points + " points left");
		}
	}
	public void setDexterity(){
		if(flag4 == true){
			System.out.print("Dexterity 0/10: ");
			int dexterity1 = sc.nextInt();
			while (checkPoints(dexterity1) == false) {
				System.out.println("Please re-enter your input to make sure it is positive, smaller than 10, and isn't more than your available points.");
				System.out.print("Dexterity 0/10: ");
				dexterity = sc.nextInt();
			}
			dexterity = dexterity + dexterity1;
			points = points - dexterity1;
			System.out.println("You have " + points + " points left");
		}
	}
	public void setIntelligence(){
		if(flag4 == true){
			System.out.print("Intelligence 0/10: ");
			int intelligence1 = sc.nextInt();
			while (checkPoints(intelligence1) == false) {
				System.out.println("Please re-enter your input to make sure it is positive, smaller than 10, and isn't more than your available points.");
				System.out.print("Intelligence: ");
				intelligence1 = sc.nextInt();
			}
			intelligence = intelligence + intelligence1;
			points = points - intelligence1;
			System.out.println("You have " + points + " points left");
		}
	}
	public void setConstituition(){
		if(flag4 == true){
			System.out.print("Constitution 0/10: ");
			int constitution1 = sc.nextInt();
			while (checkPoints(constitution1) == false) {
				System.out.println("Please re-enter your input to make sure it is positive, smaller than 10, and isn't more than your available points.");
				System.out.print("Constitution: ");
				constitution1 = sc.nextInt();
			}
			constitution = constitution + constitution1;
			points = points - constitution1;
			System.out.println("You have " + points + " points left");
		}
	}
	public void setCharisma(){
		if(flag4 == true){
			System.out.print("Charisma 0/10: ");
			int charisma1 = sc.nextInt();
			while (checkPoints(charisma1) == false) {
				System.out.println("Please re-enter your input to make sure it is positive, smaller than 10, and isn't more than your available points.");
				System.out.print("Charisma: ");
				charisma1 = sc.nextInt();
			}
			charisma = charisma + charisma1;
			points = points - charisma1;
		}
	}
	public void setAll(String x, int y, int z, int a, int b, int c){
		role = x;
		strength = y;
		dexterity = z;
		intelligence = a;
		constitution = b;
		charisma = c;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		
		if((role.equals("Wizard")) || (role.equals("Warrior")) || (role.equals("Rogue")))
			flag1 = true;
		
		if((strength > 10) || (strength < 0) || (dexterity>10) || (dexterity<0) || (intelligence>10) || (intelligence<0) || (constitution>10) || (constitution<0) || (charisma>10) || (charisma<0)){
			flag2 = false;
		}else{
			flag2 = true;
		}
			
		if(y+z+a+b+c<=25)
			flag3 = true;
			
		System.out.println("----------------------------------------------------------------");	
			
		if((flag1 == true) && (flag2 == true) && (flag3 == true)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
	
	public void levelUp(){
		if(level == 0){
			level = level + 1;
			System.out.println("-----------------------------------------");
			System.out.println("You have leveled up to level 1!");
			System.out.println("-----------------------------------------");
			points = points + 25;
			flag4 = true;
		}else if(level > 0){
			level = level +1;
			System.out.println("-----------------------------------------");
			System.out.println("You leveled up to level " + level + "!");
			System.out.println("-----------------------------------------");
			points = points + 10;
			flag4 = true;
		}
		System.out.println("You have " + points + " points to spend.");
		setStrength();
		limit();
		setDexterity();
		limit();
		setIntelligence();
		limit();
		setConstituition();
		limit();
		setCharisma();
		setMaxHealth();
		setHealth(maxHealth);
		System.out.println("You have succefully completed the leveling up process!");
		System.out.println("You have " + points + " left to spend next time.");
		printStats();
	}
	public void getHealth(){
		System.out.println("Health: " + currentHealth);
	}
	
	public void setHealth(int x){
		if((x<=maxHealth) && (x>=0)){
			currentHealth = x;
			System.out.println("Health: "+x+"/"+maxHealth);
		}else{
			System.out.println("Your set Health has to be less than your max health of " + maxHealth);
		}
	}
	
	public void setMaxHealth(){
		if(role.equals("Warrior"))
			maxHealth = maxHealth + constitution + (rand.nextInt(6) + 1);
		else if(role.equals("Wizard"))
			maxHealth = maxHealth + constitution + (rand.nextInt(3) + 1);
		else if(role.equals("Rogue"))
			maxHealth = maxHealth + constitution + (rand.nextInt(4) + 1);
		else
			maxHealth = maxHealth + constitution;
		System.out.println("Max Health: " + maxHealth);
	}
}

