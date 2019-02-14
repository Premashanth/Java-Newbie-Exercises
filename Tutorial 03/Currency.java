//Program to convert Euros to Pounds Sterling 

import java.util.Scanner;
	public class Currency {
    		public static final double POUND= 0.89;
		public static void main(String[] args) {
  			Scanner sc=new Scanner (System.in);
				
				//getting the euro input from the user  
				System.out.print ("Enter the amount in euros: ");
  				int euro=sc.nextInt();
				//Calculation 
  				double converted= euro * POUND;

				//Displaying the annswer when it is converted  
				System.out.println (" ");
  				System.out.println (euro + " Euros"+ " = " + converted + " Pounds Sterling");
  	}
}
