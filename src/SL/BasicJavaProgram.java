package SL;

import java.util.Scanner;

public class BasicJavaProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Enter First number : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second number : ");
		num2 = sc.nextInt();
		
		sc.close();
		
		System.out.println("Arthmatic operations on the two numbers are : ");
		System.out.println("Addition of the numbers is : "+ (num1 + num2) );
//		System.out.println("Subtraction of the numbers is : " + (num2 - num1));
//		System.out.println("Multiplication of the numbers is : " + (num1 * num2));
//		System.out.println("Division of the numbers is : " + (num2 / num1));
//		System.out.println("Modulo of the numbers is : " + (num2 % num1));
		
		int fact_var1 = 1;
		
		// For loop
		for(int i = 1; i <= num1; i++ ) {
			fact_var1 = fact_var1 * i;
		}
		
		System.out.println("Factorial of the num1 is : " + fact_var1);
		
		int j = 1;
		int fact_var2 = 1;
		// While loop
		while( j <= num2) {
			fact_var2 *= j;
			j++;
		}
		
		System.out.println("Factorial of the num2 is : " + fact_var2);
	}
}
