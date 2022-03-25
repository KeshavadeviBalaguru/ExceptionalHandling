package Exceptionalhandling;

import java.util.Scanner;

public class CheckAge extends Exception {
	public CheckAge(String s)
	{
		super(s);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age;
		System.out.println("Enter Age:");
		age=s.nextInt();
		try {
			if(age<18)
			{
				throw new CheckAge("Not elligible for voting");
			}
			else
			{
				System.out.println("You can vote");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
