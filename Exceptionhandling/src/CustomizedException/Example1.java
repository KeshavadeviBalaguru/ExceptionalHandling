package CustomizedException;

public class Example1 {
	import java.util.Scanner;
	//userdefined Exception class
	class BankException extends Exception{
		public BankException(String s) {
			super(s);
		}
	}

	class SBIBank{
		int bankbalance;
		public SBIBank() {
			bankbalance=20000;
		}
		void withDraw(int withdrawamt) {
			try {
				if(withdrawamt>bankbalance) {
					throw new BankException("Insufficient Balance");
				}
				else {
					bankbalance=bankbalance-withdrawamt;
					System.out.println("Balance amount="+bankbalance);
				}
			}catch(BankException e) {
				e.printStackTrace();
			}
		}
	
	


		public static void main(String[] args) {
			SBIBank sob=new SBIBank(); 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter amount to withdraw");
			int amt=sc.nextInt();
			sob.withDraw(amt);
	 

		// TODO Auto-generated method stub

	}

}
