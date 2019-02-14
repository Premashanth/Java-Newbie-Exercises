import java.util.Scanner;

public class True_False{
    
	public static void main(String []args){
        
	
	Scanner sc=new Scanner (System.in);

	System.out.print ("Enter a double number: ");
        
	double number=sc.nextDouble();
        
        
	
	if ((number>=1) && (number<=1000)){
            
		System.out.println ("The number " + number + " between 1 and 1000 is true");}

         
	else{ 
            
		System.out.println ("The number " + number + " between 1 and 1000 is false");
}
      
    
	}

}