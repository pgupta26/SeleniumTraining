package day2;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 70, b = 300, c =300;
		
		if( a  > b) {
			if (a > c) {
				System.out.println("A is biggest.");
			}
		} else {
			if( b == c) {
				System.out.println("B and C is equal and biggest");
			} else {
				if (b > c) {
					System.out.println("B is biggest");
				} else {
					System.out.println("C is biggest");
				}
			}
		}
	}
}
