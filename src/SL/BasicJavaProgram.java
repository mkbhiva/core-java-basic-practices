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
		
		System.out.println("Arthmatic operations on the two numbers are : ");
		System.out.println("Addition of the numbers is : "+ (num1 + num2) );
		System.out.println("Substraction of the numbers is : " + (num2 - num1));
		System.out.println("Multiplication of the numbers is : " + (num1 * num2));
		System.out.println("Division of the numbers is : " + (num2 / num1));
		System.out.println("Modulo of the numbers is : " + (num2 % num1));
	}

}
