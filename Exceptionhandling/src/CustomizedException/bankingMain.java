package CustomizedException;

import java.util.Scanner;


	class BankException extends Exception
	{
		public BankException(String s)
		{
			super(s);
		}
	}
		class IndianBank
		{
			double balance;

			public  IndianBank()
			{
				balance=25000.00;
			}
			void withdraw(int withdraw)
			{ 
				try {

					if(withdraw>balance)
					{
						throw new BankException("Insufficient Balance");
					}
					else
					{
						balance=balance-withdraw;
						System.out.println("Balance = "+balance);
					}
				}
				catch(BankException e)
				{
					e.printStackTrace();
				}

			}
		}
	
     public class bankingMain{
	public static void main(String[] args) {
		IndianBank iob=new IndianBank();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Amount:");
		int amt=s.nextInt();
		iob.withdraw(amt);

	}

	}
