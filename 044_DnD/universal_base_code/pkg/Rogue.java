package pkg;
import java.util.Scanner;
import java.util.Random;


public class Rogue{
	Random rand = new Random();
	String name;
	int attack;
	int health;
		
	public Rogue(){
		name = "Geronimo";
		health = rand.nextInt(15) + 1;
		attack = rand.nextInt(15) + 1;
	}
	public Rogue(String x){
		name = x;
		health = rand.nextInt(15) + 1;
		attack = rand.nextInt(15) + 1;
	}
	
	public void setHealth(int x){
		health = x;
	}
	
	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
	public void attack(Warrior x){
		setHealth(getHealth() - (rand.nextInt(attack) + 1));
	}
	
	public void attack(Wizard x){
		setHealth(getHealth() - (rand.nextInt(attack) + 1));
	}
	
	public static void printArt(){
		System.out.println("           /^\\/^\\										");
		System.out.println("         _|__|  O|										");
		System.out.println("\\/     /~     \\_/ \\										");
		System.out.println(" \\____|__________/  \\									");
		System.out.println("        \\_______      \\									");
		System.out.println("                `\\     \\                 \\				");
		System.out.println("                  |     |                  \\			");
		System.out.println("                 /      /                    \\			");
		System.out.println("                /     /                       \\\\		");
		System.out.println("              /      /                         \\ \\		");
		System.out.println("             /     /                            \\  \\	");
		System.out.println("           /     /             _----_            \\   \\	");
		System.out.println("          /     /           _-~      ~-_         |   |	");
		System.out.println("         (      (        _-~    _--_    ~-_     _/   |	");
		System.out.println("          \\      ~-____-~    _-~    ~-_    ~-_-~    /	");
		System.out.println("            ~-_           _-~          ~-_       _-~	");
		System.out.println("               ~--______-~                ~-___-~		");
	}
}

