package day3;

import java.util.Scanner;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int employee1_salary=10000;
		//int employee2_salary =100000;
		
		
		//Arrray - it allows us to store mulitple values in variable.
		//Restriction 1 - values should be off same type.
		//Limit - it required for us to declare its size.
		//Remove collections - will discuss latter
		
		//declarattion and creation of array
		/*int[] employee_salary = new int[5];
		
		//initiaization of array
		employee_salary[0]=10;
		employee_salary[1]=20;
		employee_salary[2]=30;
		employee_salary[3]=40;
		employee_salary[4]=50;
		
		System.out.println("Lenght of array: " +employee_salary.length);
		
		for(int i=0; i<employee_salary.length; i++) {
			System.out.println("Array Element: "+employee_salary[i]);
		}*/
		
		
		//How to take values from user
		//One Dimensional array
		int size;
		
		System.out.println("Enter size of array: ");
		Scanner obj= new Scanner (System.in);
		size=obj.nextInt();
		
		int[] employee_salary1 = new int[size];		
		
		System.out.println("Enter Array Elements ");
		for(int i=0; i<size; i++) {
			employee_salary1[i]=obj.nextInt();
		}
		
		for(int i=0; i<employee_salary1.length; i++) {
			System.out.println("Array Element: "+employee_salary1[i]);
		}
		
		System.out.println("3rd employee salary: "+employee_salary1[2]);
		
		
		
		
	}

}
