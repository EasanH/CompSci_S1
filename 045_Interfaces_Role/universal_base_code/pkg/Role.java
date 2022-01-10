package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Role{
	public void setHealth(int x);
	public int getHealth();
	public String getName();
	public void attack(Role x);
	public void printArt();

}

