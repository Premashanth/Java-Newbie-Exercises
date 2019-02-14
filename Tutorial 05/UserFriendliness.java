//To get input from user and validate it 

import java.util.*;

public class UserFriendliness{
  
   
	static Scanner sc=new Scanner(System.in);
    
    
	public static void main (String []args){
      

	System.out.print ("Do you want to run this program? (y=yes/n=no)");
    
	String answer=sc.next();
    
    
    
    
      
    

		//validating if answer is eual to n,N,y or Y
		if ((answer.equalsIgnoreCase("n")) || (answer.equalsIgnoreCase("y"))){
      
          
			System.exit(0);
        
		} 
          
           

		//if not getting input again
		while (!(answer == "")){
             
			System.out.println ("Invalid selection"); 
             
			System.out.print ("\nDo you want to run this program? ");
             
             
		
		String ans=sc.next();
             

			if ((ans.equalsIgnoreCase("n")) || (ans.equalsIgnoreCase("y"))){
     
				System.exit(0);
             
             
			}
           
		}
        
  
	}

}