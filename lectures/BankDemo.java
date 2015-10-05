public class BankDemo {
	
   public static void main(String [] args)
   {
	      CheckingAccount acct = new CheckingAccount(101);
	      System.out.println("Depositing $500...\n");
	      acct.deposit(500.00);
	      try
	      {
		 System.out.println("Withdrawing $100...\n");
		 acct.withdraw(100.00);
		 System.out.println("Withdrawing $600...\n");
		 acct.withdraw(600.00);
		      
	      } catch(InsufficientFundsException e) {
		 System.out.println("Sorry, but you are short of $"
						+ e.getAmount());
		 e.printStackTrace();
	      }
	}
}