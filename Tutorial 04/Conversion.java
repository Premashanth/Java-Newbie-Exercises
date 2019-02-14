import java.util.Scanner;

public class Conversion{
    
	public static void main (String []args){
        
        

	System.out.print ("Enter number in pounds: ");
        
	Scanner sc=new Scanner(System.in);
    
	double pound=sc.nextDouble();
    
    
	
	double kg= pound*0.454;
    
	System.out.println ( + pound + " pound is " + kg + " kilogram ");
    
    
	}

}