//Program to print full name

import java.util.Scanner;

	public class Name {
     
	public static void main (String []args){
        
		Scanner s=new Scanner (System.in);
  

		//To enter First name 
 		System.out.print("Enter first Name:");
    
		String firstName = s.nextString();

    
		//To enter Second name	
		System.out.print("Enter Second Name");
    
		String secondName = s.nextString();
    

		//To display the full name by combining First and second name 		
		System.out.print ("Full name is:");
		String sum = firstName + secondName;
  	  
		System.out.println (firstName + " " + secondName);
    
	}
}