//Program to find the square and cube of the number entered by the user 

import java.util.Scanner;
public class SquareAndCubeNum {

    public static void main(String [] args) {
        
        int number;
        Scanner sc = new Scanner(System.in);

	//Enter a number
        System.out.println("Enter a  Number: ");
	number=sc.nextInt();

	//Square of the entered number
	System.out.println("Square of" + number + "is:" = Math.pow(number, 2));
	
	//Cube of the entered number
	System.out.println("Cube of" + number + "is:" = Math.pow(number, 3));
	}
}

