package Exceptionalhandling;

import java.util.Scanner;

public class ValidInputNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num;
		while(true) {
		System.out.println("Enter the number:");
		try {
			num=Integer.parseInt(s.next());
			break;
			}
        catch(Exception e)
		{
        	e.printStackTrace();
		}
		System.out.println("please Enter the valid number");
		}
		
	   System.out.println("Input is valid");

	}

}
