import java.util.Scanner;

public class Letter{
    
		public static void main(String []args){
         
        
		
		Scanner sc=new Scanner(System.in);
         
		System.out.print ("Enter a specific Character");
         
		
		String letter=sc.next();
        
		
		if (letter.matches("[A-Za-z] {1}"))
        
		{
            
		System.out.print ("Correct!");
        
		}
        
		else{
            
		System.out.print ("Incorrect!");
        
		}
     
	}

}