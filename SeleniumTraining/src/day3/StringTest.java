package day3;

public class StringTest {

	public static void main(String[] args) {
		
		FunctionsTest obj=new FunctionsTest();
		obj.print();
		obj.test();
		
		// By Using String Literal
		String name="Parshant is automation testing";
		String employeeName="Parshan1t";
		
		if(name==employeeName) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
		
		
		String name1=new String("Parshant");
		String employeeName1=new String("Parshant");
		if(name1 == employeeName1) {
			System.out.println("pass");
		}else{
			System.out.println("Fail");
		}
		
		
		System.out.println("character at postion 0 "+name.charAt(0));
		System.out.println(name.equals(employeeName));
		System.out.println(name.length());
		System.out.println(name.replace("testing", "tester"));
		
		
		

	}

}
