package tutorial5bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank1 = new BankAccount("John", 200);
		BankAccount bank2 = new BankAccount("Smith", 300);
		BankAccount bank3 = new BankAccount("Jeff Bezos", 1000000000);
		bank1.deposit(300);
		bank2.deposit(50);
		bank3.withdraw(402122.5);
		System.out.println(bank3.toString());
		bank1.fee(200);
		bank1.withdraw(300);
		System.out.println(bank1.toString());
		bank2.fee(300);
		bank2.withdraw(301);
		System.out.println(bank2.toString());
		//varaibles are private since this is a bank account and you dont want people to easily get your bank details
		//bank name is final as the person probably wont change their name, but account balance changes frequently
		//Outside code could access info using getters and setters
		
		
	}

}
