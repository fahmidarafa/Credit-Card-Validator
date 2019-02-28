import java.util.Arrays;
import java.util.Scanner;
public class CreditCard {
	public static String number;
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter credit card number:");
	    Long cardNumber = input.nextLong();
	    
	    number = Long.toString(cardNumber);
		int[] digits = new int[number.length()];
		for(int i= 0; i< number.length(); i++) {
			digits[i]= number.charAt(i)-'0';
		}
		
	    int[]revDigit = new int[digits.length];
		int x = digits.length;
		for(int j=0; j< digits.length; j++) {
			revDigit[x-1] = digits[j];
			x= x-1;	
		}
		
		for(int m=1; m< revDigit.length; m+=2){
			revDigit[m]= revDigit[m]*2;
			if(revDigit[m]>= 10) {
				revDigit[m]= revDigit[m]-9;
			}
		}
		printValidity(revDigit);
		
	}
	public static void printValidity(int[]digits){
		int sum = 0;
		for(int n= 0; n< digits.length; n++) {
			sum = sum + digits[n];
		}
		if(sum % 10 == 0) {
			System.out.println("Card number is valid");
			String [] database = new String[200];
			database[0]= number;

		}
		else {
			System.out.println("Card number is invalid");
			
		}


		
		
	}

}
