Bank-Account-Demo---Java
========================

Template Model demo for java

There are 4 classes associated with this demo. 

1- NewBank.java - this is the main method class. It provides code for the menu navigation system I developed for this demo.

2- Account.java - This is an abstract class for Accounts. This provides 6 methods in total. 
    -getAccountSummary : This calls calcInterest, updateBalance and printSummary
    -calcInterest : This is a method that will be overridden by subclasses
    -updateBalance : This method is called everytime the interest is calculated (for each year).
    -printSummary : This method prints out a summary of the changes in the account. i.e. The interest accrued on 2010 at 4% is $139.92 for a total of $3637.81
    -
