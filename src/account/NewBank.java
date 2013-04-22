package account;

import java.util.Scanner;

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

public class NewBank {
	static double balance = 1000.0;
	static int option = 0;
	static int optionb = 0;
	static CheckingsAccount chk;
	static SavingsAccount svg;


	public static void main(String[] args) {
		//instantiates an instance of checkings and savings accounts. For demo purposes,
		//it automatically deposits $1000, $2000 into checking/savings accounts.
		chk = new CheckingsAccount();
		chk.deposit(1000.0);
		svg = new SavingsAccount();
		svg.deposit(2000.0);
		
		System.out.println("===========================================");
		System.out.println("Bank Accounts");
	    System.out.println("===========================================\n");
	    
	    //Creates user menu. Choose between checking/savings accounts.
	    while (option != 3) {
		    System.out.println("Current Date: January 1 2008 ");
		    System.out.println("Select an account: ");
		    System.out.println("1) Checking Account");
	        System.out.println("2) Savings Account");
	        System.out.println("3) Exit");
	        
	        Scanner scn = new Scanner(System.in); 
			System.out.println("Choose a number: ");
			try {
				option = scn.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		
			if(option == 1){
				System.out.println();
				showChecking();
			}
			else if(option == 2){
				System.out.println();
				showSavings();
			}
			else if(option == 3){
				System.out.println("Goodbye.");
				System.exit(1);
			}
			else{
				System.err.println("Please select a valid option");
			}
	    }
		
		

	}
	
	private static void showChecking(){
		
		//creates a menu for checkings account. Here, you can view balance,
		//and deposit money
		System.out.println();
        System.out.println("Checking Account:");
        System.out.println("--------------------------");
        
        System.out.println("1) Get Balance");
        System.out.println("2) Deposit");
        System.out.println("3) Main Menu");
        
        Scanner scn = new Scanner(System.in); 
		System.out.println("Choose a number: ");
		try {
			optionb = scn.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
		if(optionb == 1){
			chk.getBalance();
			System.out.println();
			showChecking();
		}
		else if(optionb == 2){
			double amount = 0.0;
			scn = new Scanner(System.in); 
			System.out.println("Enter amount to deposit: ");
			amount = scn.nextDouble();
			
			chk.deposit(amount);
			chk.getBalance();
			showChecking();
		}
		else if(optionb == 3){
			System.out.println();
		}
		else{
			System.err.println("Please select a valid option");
		}
	}
	
	private static void showSavings(){
		
		//creates a menu for savings account. Here, you can view balance,
		//deposit money, and view how much interest may accrue given a time frame.
		//PLEASE NOTICE FOR DEMO PURPOSES THE DATE ON THIS ACCOUNT IS 
		//JANUARY 1, 2008
		System.out.println();
        System.out.println("Savings Account:");
        System.out.println("--------------------------");
        
        System.out.println("1) Get Balance");
        System.out.println("2) Deposit");
        System.out.println("3) Calculate Interest");
        System.out.println("4) Main Menu");
        
        Scanner scn = new Scanner(System.in); 
		System.out.println("Choose a number: ");
		try {
			optionb = scn.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
		if(optionb == 1){
			svg.getBalance();
			System.out.println();
			showSavings();
		}
		else if(optionb == 2){
			double amount = 0.0;
			scn = new Scanner(System.in); 
			System.out.println("Enter amount to deposit: ");
			amount = scn.nextDouble();
			
			svg.deposit(amount);
			svg.getBalance();
			showSavings();
		}
		else if(optionb == 3){
			System.out.println();
			int year = 2008;
			scn = new Scanner(System.in); 
			System.out.println("Enter year you wish to calculate interest: ");
			System.out.println("FOR EXAMPLE: 2014");
			year = scn.nextInt();
			svg.getAccountSumary(svg.getBalance() , year);
			showSavings();
		}
		else if(optionb == 4){
			System.out.println();
		}
		else{
			System.err.println("Please select a valid option");
		}
	}
}
