import java.util.*;
public class DiscountCalculator {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please enter bill amount");
    	int amount = sc.nextInt();
    	
    	if(amount<500) {
    		System.out.println("Sorry! No discounts applied, The payable amount is " + amount);
    	}
    	else if(amount>=500 && amount<1000) {
    		System.out.println("Discount applied succesfully!, The payable amount is "+ (amount-((amount/100)*10)) );
    	}
    	else {
    		System.out.println("Discount applied succesfully!, The payable amount is "+ (amount-((amount/100)*20)));
    	}
   
    }
}   
