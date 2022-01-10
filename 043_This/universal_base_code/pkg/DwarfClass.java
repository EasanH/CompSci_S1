package pkg;
import java.util.Scanner;
import java.util.Random;


public class DwarfClass {
	String name;
	int age;
	
	public DwarfClass(){
		name = ("");
		age = 0;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public DwarfClass(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean isSameName(String name){
		if(this.name == name)
			return true;
		else
			return false;
	}

}

