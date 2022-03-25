package Exceptionalhandling;

public class ArrayError {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]=new int[5];
		System.out.println("Before Exception");
		try
		{
			c=a/b;
        }
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
			e.printStackTrace();
		}
		try {
			ar[6]=8;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOfBoundsException");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block");
		}

	}

}
