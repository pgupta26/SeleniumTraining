package day4;

public class Account {
	
	 private int number;
	 private int balance;
	
	 //Non - Parameterized constructor
	public Account() {
		number=101;
		balance=4567;
	}
	
	// Parameterized Constructor
	public Account( int n, int b) {
		number = n;
		balance = b;
	}
	
	public int getBalance() {
		
		//After Authentication and Authorization
		return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();		
		System.out.println("Account Number: "+obj.number+ " Balance: "+obj.balance);
		
		Account obj1 = new Account();
		System.out.println("Account Number: "+obj1.number+ " Balance: "+obj1.balance);
		
		Account obj2 = new Account(202, 567);
		System.out.println("Account Number: "+obj2.number+ " Balance: "+obj2.balance);

	}

}
