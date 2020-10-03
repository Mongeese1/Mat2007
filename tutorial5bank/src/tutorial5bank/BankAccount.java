package tutorial5bank;

public class BankAccount {
	 private final String name; // Name of bank account holder  
	 private double balance; // Balance of the account  
	 public double fee= 0 ;
	 // Add constructor(s) here       
	 public BankAccount(String person, double money){
		 this.name = person;
		 this.balance = money;
		 
	 }
	 public void fee(double transfee) {
		 fee = transfee;
		 
	 }
	 // ... 
	 // This is a method to deposit money  
	 public void deposit(final double amount)       
	 {    balance = balance + amount;  }   
	 // This is a method to withdraw money  
	 public void withdraw(final double amount)      
	 {    
		 
		 if((balance - amount-fee)<0) {
			; 
		 }
		 else {
			 balance = balance -amount - fee;
		 }
			 } 
	 public String toString() {
		 return(name + ", "+ balance);}

	 } 


