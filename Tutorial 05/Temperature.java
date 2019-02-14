//To caluclate the temperature in Celcius to Fahrenheit

import java.util.Scanner;

public class Temperature{
    
	public static void main (String []args){
        

	Scanner sc=new Scanner (System.in);
        

	//To prompt and get the Start temperature from user 
	System.out.print ("Enter start: ");
        
	int start=sc.nextInt();
        
        

	//To prompt and get the Finish temperature from user
	System.out.print ("Enter finish: ");
        
	int finish=sc.nextInt();
        
        

	//To prompt and get the incrementfrom user
	System.out.print ("Enter increment: ");
        
	int inc=sc.nextInt();
        
        

	System.out.println("Celsius   Fahrenheit");
        
	System.out.println("--------------------");
        
        

	int fah=0;
        
	int celcius=start;
        

		while (celcius <= finish){
  
			//Calculation         
			fah=(celcius*9/5+32);
            
				System.out.print(celcius);
              
			celcius+=inc;

            
		System.out.print("              ");
            
		System.out.println (fah);

        
		}
        

    
	}

}