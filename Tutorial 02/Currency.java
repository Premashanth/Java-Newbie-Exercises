//Program to convert USD to LKR


import java.util.Scanner;
public class Currency{
	public static final double LKR =146.53;
	public static void main (String []args){
		
		Scanner Sc= new Scanner(System.in);

		// Enter the USD amount here
		System.out.println ("Enter the amount in USD:");
		double amount= sc.nextDouble();
		
		//Calulation is done here
		double srilankanRupee= amount * LKR;
		System.out.println (srilankanRupee +"LKR"+ "=" + amount + "USD" );
	}
}