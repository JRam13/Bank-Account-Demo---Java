package account;

import java.text.DecimalFormat;

/*Annual Compound Interest Rate Formula:
 * 
 * A = P ( 1 + r/n ) ^ nt
 * 
 * A = amount of money accumulated after n years, including interest.
 * P = principal amount (the initial amount you borrow or deposit)
 * r = annual rate of interest (as a decimal)
 * n = number of times the interest is compounded per year 
 * t = number of years the amount is deposited or borrowed for.
 * 
 * 
 */

//Abstract class. 
public abstract class Account { 
	double balance; //starting balance
	double balanceBeforeInterest;
	double balanceAfterInterest;
	int accYear;


	final void getAccountSumary(double balanceI, int years){
		
		accYear = 2008;
		balanceBeforeInterest = balance;
		int year = years - 2008;
		for (int i = 0; i < year; i++) {
			double interest = calcInterest(balanceBeforeInterest);
			updateBalance(interest);
			printSummary(interest);
		}
		
	}
	
	abstract double calcInterest(double balanceI); //method overridden in subclasses checkings/savingsAccount
	
	void updateBalance(double interest){
		balanceAfterInterest = interest + balanceBeforeInterest;
	}
	
	void printSummary(double interest){
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		String dec = twoDForm.format(balanceAfterInterest);
		balanceAfterInterest = Double.parseDouble(dec);
		System.err.println("The interest accrued on "+ accYear + " at 4% is $" + interest + " for a total of $"
				+ balanceAfterInterest);
		balanceBeforeInterest = balanceAfterInterest;
		accYear++;
	}
	
	public double getBalance() { //getter method, returns balance
		System.err.println("Blance is: $" + balance);
		return balance;
	}
	
	public void deposit(double amount){ 
		balance = balance + amount;
		
	}
	
}
