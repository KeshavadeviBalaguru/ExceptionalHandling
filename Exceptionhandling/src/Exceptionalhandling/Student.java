package Exceptionalhandling;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		String name;
		int age;
		double fees;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the age:");
		age=scanner.nextInt();
		System.out.println("Enter the Name:");
		scanner.nextLine();
		name=scanner.nextLine();
		System.out.println("Enter the course fee:");
		fees=scanner.nextDouble();
		System.out.println("Student Details");
		System.out.println("Name=  "+name);
		System.out.println("Age=  "+age);
		System.out.println("Fee=   "+fees);

	}

}
