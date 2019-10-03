package day3;

public class SumOfDigitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 234;
		
		int sum=0, remainder;
		
		while ( num > 0 ) {
			remainder = num % 10;
			sum=sum+remainder;
			num= num / 10;
		}
		
		System.out.println("Sum of digits are: "+sum);
		
		
	}

}
