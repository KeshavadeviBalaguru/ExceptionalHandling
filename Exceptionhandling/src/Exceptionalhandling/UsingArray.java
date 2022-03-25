package Exceptionalhandling;

import java.util.Scanner;

public class UsingArray {

	public static void main(String[] args) {
	int a[]=new int[5];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the array elements:");
	for(int i=0;i<a.length;i++)
	{
       a[i]=s.nextInt();
	}
	System.out.println("Array elements are:");
	for(int i=0;i<a.length+1;i++)
     try {
		System.out.println(a[i]);
     }
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	
	System.out.println("Statements after loop");
	}
}
