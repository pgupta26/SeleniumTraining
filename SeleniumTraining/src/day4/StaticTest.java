package day4;

public class StaticTest {
	
	String name;
	int rollNo;
	static String collegeName = "SD";
	
	StaticTest(String n, int r) {
		name =n;
		rollNo = r;
	}
	
	public void display() {
		System.out.println("Name: "+name+ " Roll No."+rollNo+ "collegeName: "+collegeName);
	}
	
	static public void test() {
		System.out.println("Static Method Test");
		collegeName ="DAV Senior Secondary";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest.test();
		
		StaticTest obj =  new StaticTest("Ram", 101);
		StaticTest obj1 =  new StaticTest("Sham", 102);
		
		obj.display();
		obj1.display();			
	}

}
