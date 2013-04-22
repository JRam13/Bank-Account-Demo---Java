Bank-Account-Demo---Java
========================

Template Model demo for java
__________________


There are 4 classes associated with this demo. 

1- NewBank.java - this is the main method class. It provides code for the menu navigation system I developed for this demo.

2- Account.java - This is an abstract class for Accounts. This provides 6 methods in total. 

    -getAccountSummary : This calls calcInterest, updateBalance and printSummary
    
    -calcInterest : This is a method that will be implemented by its subclasses
    
    -updateBalance : This method is called everytime the interest is calculated (for each year).
    
    -printSummary : This method prints out a summary of the changes in the account. 
    i.e. The interest accrued on 2010 at 4% is $139.92 for a total of $3637.81
    
    -getBalance : getter method - returns balance
    
    -deposit : Deposits money in account.
    
3- CheckingsAccount.java - Overrides the calcInterest (in this case, nothing is done since the interest on a checkings account is 0%)

4- SavingsAccount.java - Overrides calcInterest. Returns a value that is (balance X interestRate).

SAMPLE OUTPUT
--------------------------

Enter year you wish to calculate interest: 

FOR EXAMPLE: 2014

2014

Savings Account:

1) Get Balance

2) Deposit

3) Calculate Interest

4) Main Menu

Choose a number: 

Blance is: $3234.0

The interest accrued on 2008 at 4% is $129.36 for a total of $3363.36

The interest accrued on 2009 at 4% is $134.53 for a total of $3497.89

The interest accrued on 2010 at 4% is $139.92 for a total of $3637.81

The interest accrued on 2011 at 4% is $145.51 for a total of $3783.32

The interest accrued on 2012 at 4% is $151.33 for a total of $3934.65

The interest accrued on 2013 at 4% is $157.39 for a total of $4092.04
