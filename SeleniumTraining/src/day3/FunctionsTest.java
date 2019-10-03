package day3;

public class FunctionsTest {

	public static void print() {
		System.out.println("hello");
	}
	
	public static void test() {
		print();
		System.out.println("Test funtion");
	}
	
	public int sum(int a, int b) {
		int c=a+b;
		return c;
	}
	
	
	public static void main(String[] args) {
		 test();
		//FunctionsTest obj=new FunctionsTest();
	//	obj.print();
		//obj.test();
	//	int sum=obj.sum(5, 6);
		//System.out.println(obj.sum(5, 6));
		

	}

}
