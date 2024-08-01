package newprgms;

import java.util.*;

public class BankAccount {
	     
	    //variable for initial amount
	    double presentamount=10000;
	    
	    //method to check the initial amt
		void checkBalance() {
			System.out.println("Balance Prsent :"+presentamount);
		}
		
		//method for deposit
		void deposit(double depositAmt) {
			presentamount=presentamount+depositAmt;
			
			System.out.println("After deposit "+presentamount);
		}
		
		//method for withdraw
		void withdraw(double withdrawAmt) {
			presentamount=presentamount-withdrawAmt;
			System.out.println("After withdrawing "+presentamount);
		}


			public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				
				//object creation
				BankAccount ba=new BankAccount();
				
				System.out.println("Enter deposit amt: ");
				double depositAmt=sc.nextInt();
				
				System.out.println("Enter withdraw amt: ");
				double withdrawAmt=sc.nextInt();
				
				//calling methods
				ba.checkBalance();
				ba.deposit(depositAmt);
				ba.withdraw(withdrawAmt);
			
		}
	}


