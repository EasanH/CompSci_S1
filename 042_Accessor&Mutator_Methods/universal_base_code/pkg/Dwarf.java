package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	String name;
	int age;
	
	public Dwarf(){
		name = ("");
		age = 0;
	}
	public void setName(String x){
		name = x;
	}
	public void setAge(int x){
		age = x;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

