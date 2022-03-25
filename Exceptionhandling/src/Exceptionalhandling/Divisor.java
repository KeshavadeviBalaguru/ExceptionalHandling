package Exceptionalhandling;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st Number:");
		a=s.nextInt();
		System.out.println("Enter the 2nd Number:");
		b=s.nextInt();
		System.out.println("Before division");
		try
		{
		c=a/b;
		} 
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Finally block executed always");
		}
		System.out.println("After division");
		

	}

}
