package day4;

public class SumTest {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public float sum(float f1, float f2) {
		return f1+f2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumTest obj = new SumTest();
		System.out.println(obj.sum(10, 29));
		obj.sum(23.5f, 56.7f);
	}
}
