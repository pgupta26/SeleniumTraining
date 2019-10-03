package day2;

import java.util.Scanner;

public class ConditionDemo {
		
	public static void main(String[] args) {
		
		//If Statemet demo
		int age;
		
		System.out.println("Enter age: ");
		Scanner obj= new Scanner (System.in);
		age=obj.nextInt();
		
		if(age < 18) {
			System.out.println("User is not eligible for voting.");
		} else {
			System.out.println("User is eligible for voting.");
		}
		
		boolean flag;
		System.out.println("Enter boolean value: ");
		flag=obj.nextBoolean();
		
		System.out.println("Flag value: "+flag);
		System.out.println("After If");
		
	}
}
