package day2;

import java.sql.ResultSet;
import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter Number: ");
		Scanner obj= new Scanner (System.in);
		num=obj.nextInt();
		
		while (num < 100) {
			System.out.println("Number is less than 100");
			System.out.println("Enter Number: ");
			obj= new Scanner (System.in);
			num=obj.nextInt();
		}
		
		System.out.println("Outside Loop");
	}

}
