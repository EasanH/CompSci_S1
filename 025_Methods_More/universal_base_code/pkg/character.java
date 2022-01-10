package pkg;
import java.util.Scanner;
import java.util.Random;


public class character {
	Scanner sc = new Scanner(System.in);
	public String name;
	public String title;
	public String role = "No Role";
	public double strength = 0;
	public double dexterity = 0;
	public double intelligence = 0;
	public double constitution = 0;
	public double charisma = 0;
	public double pnts = 25;
	
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

	}
	
	public void setStrength(){
		System.out.print("Strength 0/10: ");
		strength = sc.nextDouble();
		while (strength > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Strength 0/10:");
			strength = sc.nextDouble();
		}
		while (strength < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Strength 0/10:");
			strength = sc.nextDouble();
		}
		pnts = pnts - strength;
		System.out.println("You have " + pnts + " points left");
	}
	
	public void setDexterity(){
		System.out.print("Dexterity 0/10: ");
		dexterity = sc.nextDouble();
		while (dexterity > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Dexterity 0/10:");
			dexterity = sc.nextDouble();
		}
		while (dexterity < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Dexterity 0/10:");
			dexterity = sc.nextDouble();
		}
		pnts = pnts - dexterity;
		System.out.println("You have " + pnts + " points left");
	}
	
	public void setIntelligence(){
		System.out.print("Intelligence 0/10: ");
		intelligence = sc.nextDouble();
		while (intelligence > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Intelligence 0/10:");
			intelligence = sc.nextDouble();
		}
		while (intelligence < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Intelligence 0/10:");
			intelligence = sc.nextDouble();
		}
		while (pnts - intelligence < 0){
			System.out.println("You don't have enough points for that. Please enter a lower value");
			System.out.print("Intelligence 0/10: ");
			intelligence = sc.nextDouble();
		}
		pnts = pnts - intelligence;
		System.out.println("You have " + pnts + " points left");
	}
	
	public void setConstituition(){
		System.out.print("Constitution 0/10: ");
		constitution = sc.nextDouble();
		while (constitution > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Constitution 0/10:");
			constitution = sc.nextDouble();
		}
		while (constitution < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Constitution 0/10:");
			constitution = sc.nextDouble();
		}
		while (pnts - constitution < 0){
			System.out.println("You don't have enough points for that. Please enter a lower value");
			System.out.print("Constitution 0/10: ");
			constitution = sc.nextDouble();
		}
		pnts = pnts - constitution;
		System.out.println("You have " + pnts + " points left");
	}
	
	public void setCharisma(){
		System.out.print("Charisma 0/10: ");
		charisma = sc.nextDouble();
		while (charisma > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Charisma 0/10:");
			charisma = sc.nextDouble();
		}
		while (charisma < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Charisma 0/10:");
			charisma = sc.nextDouble();
		}
		while (pnts - charisma < 0){
			System.out.println("You don't have enough points for that. Please enter a lower value");
			System.out.print("Charisma 0/10: ");
			charisma = sc.nextDouble();
		}
		pnts = pnts - charisma;
		System.out.println("You have " + pnts + " points left");
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
}

