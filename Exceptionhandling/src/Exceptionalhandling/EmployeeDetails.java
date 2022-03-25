package Exceptionalhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeDetails {

	public static void main(String[] args) throws  IOException {
		String name="";
		int age=0;
		double salary;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter the name:");
		name=br.readLine();
		System.out.println("Enter your age:");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter you salary");
		salary=Double.parseDouble(br.readLine());
		
		System.out.println("Employee Details");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+salary);

	}

}
