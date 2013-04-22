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

public class SavingsAccount extends Account {

	@Override
	double calcInterest(double balance) {
		
		double interest = balance * ((.04));
		//interest = Math.pow(interest,(1)); //a^b
		
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		String dec = twoDForm.format(interest);
		interest = Double.parseDouble(dec);
		
		
		return interest;
	}

}
