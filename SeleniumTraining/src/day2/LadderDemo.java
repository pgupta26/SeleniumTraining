package day2;

import java.util.Scanner;

public class LadderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks;
		
		System.out.println("Enter marks: ");
		Scanner obj= new Scanner (System.in);
		marks=obj.nextInt();

		
		if(marks < 33 ) {
			System.out.println("Student Fail");
		} else if (marks >=33 && marks < 60) {
			System.out.println("Pass");
		} else if( marks >=60) {
			System.out.println("First Division");
		} else {
			System.out.println("Invalid");
		}
		
		
		System.out.println("After if");
		
		
	
	}

}
