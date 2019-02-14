//Program to find the sum, product, difference, Quotient of two number

import java.util.Scanner;
public class TwoNumber {

    public static void main(String []args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
	//Addition of the entered two numbers
        sum = num1 + num2;
       	System.out.println("Sum of these numbers: "+sum);
        
	//Multiplication of the entered two numbers
	sum = num1 * num2;
	System.out.println("Product of these numbers: "+sum);
        
	
	//Subtraction of the entered two numbers
	sum = num1 - num2;
        System.out.println("Difference of these numbers: "+sum);

	
	//Division of the entered two numbers        
	sum = num1 / num2;
        System.out.println("Quotient of these numbers: "+sum);
    }
}   