package Exceptionalhandling;

import java.util.Scanner;

public class NullPointerException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=null;
		try {
			System.out.println("Enter the name: ");
			a=s.nextLine();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
       System.out.println("valid Input");
	}

}
