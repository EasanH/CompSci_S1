import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name adventurer?");
		String name = sc.nextLine();
		
		System.out.println("What do you want to be known by? (Ex: The Destroyer of Worlds)");
		String title = sc.nextLine();
		
		System.out.println("Select a class type: Brute, Warrior, Wizard, Assassin, Healer");
		String classtype = sc.nextLine();
		
		if(classtype.equals("Brute")) {
			System.out.println("You are a Brute! Your mighty strength will crush your opponents!");
		}else if(classtype.equals("Warrior")) {
			System.out.println("You are a Warrior! Your flashy sword skills will surely earn you glory!");
		}else if(classtype.equals("Wizard")) {
			System.out.println("You are a Wizard! You strike your enemies down from afar using your mastery of spells!");
		}else if(classtype.equals("Assassin")) {
			System.out.println("You are an Assassin! You move through the shadows noticed by none!");
		}else if(classtype.equals("Healer")) {
			System.out.println("You are a Healer! You support your teamates using your fantastic healing capabilities! (Why...Just why would you ever choose this class?)");
		}else{
			System.out.println("Your input does not correlate with any classtype, so I guess you will just be a Healer!(Hehe...Loser)");
		}
		
		System.out.println("");
		System.out.println("You have 25 trait points that you can spend on: Strength, Dexterity, Intelligence, Constitution, Charisma");
		double pnts = 25;
		System.out.println("");
		
		System.out.print("Strength 0/10: ");
		double strg = sc.nextDouble();
		if(strg > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Strength 0/10:");
			strg = sc.nextDouble();
		}else if(strg < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Strength 0/10:");
			strg = sc.nextDouble();
		}else{}
		pnts = pnts - strg;
		System.out.println("You have " + pnts + " points left");
		
		System.out.println("");
		System.out.print("Dexterity 0/10: ");
		double dext = sc.nextDouble();
		if(dext > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Dexterity 0/10:");
			dext = sc.nextDouble();
		}else if(dext < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Dexterity 0/10:");
			dext = sc.nextDouble();
		}else{}
		pnts = pnts - dext;
		System.out.println("You have " + pnts + " points left");
		
		System.out.println("");
		System.out.print("Intelligence 0/10: ");
		double intl = sc.nextDouble();
		if(intl > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Intelligence 0/10:");
			intl = sc.nextDouble();
		}else if(intl < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Intelligence 0/10:");
			intl = sc.nextDouble();
		}else if(pnts - intl < 0){
			System.out.println("You don't have enough points to do that. Please enter a lower value.");
			System.out.println("Intelligence 0/10: ");
			intl = sc.nextDouble();
		}else{}
		pnts = pnts - intl;
		System.out.println("You have " + pnts + " points left");
		
		System.out.println("");
		System.out.print("Constitution 0/10: ");
		double hlth = sc.nextDouble();
		if(hlth > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Constitution 0/10:");
			hlth = sc.nextDouble();
		}else if(hlth < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Constitution 0/10:");
			hlth = sc.nextDouble();
		}else if(pnts - hlth < 0){
			System.out.println("You don't have enough points to do that. Please enter a lower value.");
			System.out.println("Constitution 0/10: ");
			hlth = sc.nextDouble();
		}else{}
		pnts = pnts - hlth;
		System.out.println("You have " + pnts + " points left");
		
		System.out.println("");
		System.out.print("Charisma 0/10: ");
		double crsm = sc.nextDouble();
		if(crsm > 10) {
			System.out.println("The limit for each trait is 10. Please try again.");
			System.out.println("Charisma 0/10:");
			crsm = sc.nextDouble();
		}else if(crsm < 0) {
			System.out.println("You can not have negetive trait points. Please try again.");
			System.out.println("Charisma 0/10:");
			crsm = sc.nextDouble();
		}else if(pnts - crsm < 0){
			System.out.println("You don't have enough points to do that. Please enter a lower value.");
			System.out.println("Charisma 0/10: ");
			crsm = sc.nextDouble();
		}else{}
		pnts = pnts - crsm;
		System.out.println("You have " + pnts + " points left");
		System.out.println("");
		
		System.out.println("__________________________________________");
		
		System.out.println("");
		System.out.println("You are " + name + " " + title + "!");
		if(classtype.equals("Assassin")) {
			System.out.println("You are an Assassin with these traits:");
		}else{
			System.out.println("You are a " + classtype + " with these traits:");
		}
		System.out.println("");
		System.out.println("Strength: " + strg + "/10");
		System.out.println("Dexterity: " + dext + "/10");
		System.out.println("Intelligence: " + intl + "/10");
		System.out.println("Constitution: " + hlth + "/10");
		System.out.println("Charisma: " + crsm + "/10");
		System.out.println("");
		System.out.println("Explore, fight, and conquer all of CVHS!");
		System.out.println("__________________________________________");
	}
}
