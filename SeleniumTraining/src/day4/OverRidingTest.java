package day4;

class Bank1 {
	 public int getRateOfInterest() {
		return 5;
	}
}

class HDFCBank1 extends Bank1 {
	@Override
	public int getRateOfInterest() {
		return 7;
	}
}

class ICICIBank extends Bank1 {
	@Override
	public int getRateOfInterest() {
		return 9;
	}
}

public class OverRidingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 obj;
		obj =new HDFCBank1();
		System.out.println("HDFC Rate of Interest: "+obj.getRateOfInterest());
		
		obj = new ICICIBank();
		System.out.println("Icici Rate of Interest: "+obj.getRateOfInterest());
	}
}
