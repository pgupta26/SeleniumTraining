package day4;


abstract class Bank {
	//A class which contains atleast one abstract method is know as known abstract.
	//abstract methods is a method which only declere method (no method body)
	//We can not create object of abstract class
	//It needs to be extended and its methods implemented.
	//Purpose of abstract class is to achieve abstraction.
	//But it provides only 50% abstraction.
	
	abstract public int getRateOfInterest();
	public void displayBalance() {
		System.out.println("Show Balance");
	}
}

class HDFCBank extends Bank {

	@Override
	public int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 5;
	}
}

class ICICI extends Bank {

	@Override
	public int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
}


public class AbstractTest  {
	
	public static void main(String[] args) {
		Bank obj;
		obj =  new HDFCBank();
		System.out.println("HDFC Rate of Interest: "+obj.getRateOfInterest());
		obj.displayBalance();
	}
	

}
