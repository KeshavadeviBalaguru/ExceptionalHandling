package Exceptionalhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StudentDetails {

	public static void main(String[] args)throws  IOException {
	String name;
	int age;
	double fees;	 
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(is);
	
	System.out.println("Enter the Name:");
	name=br.readLine();
	System.out.println("Enter the age:");
	age=Integer.parseInt(br.readLine());
	System.out.println("Enter the course fee:");
	fees=Double.parseDouble(br.readLine());
	System.out.println("Student Details");
	System.out.println("Name=  "+name);
	System.out.println("Age=  "+age);
	System.out.println("Fee=   "+fees);
	}

}
