import java.util.Scanner;

public class Interest{
    
	public static void main(String []args){
        

		System.out.println ("First Post Plus");
        
		System.out.println (" ");
        
		
		Scanner sc=new Scanner (System.in);
        
		System.out.print ("Deposit : ");
        
		double deposit=sc.nextDouble();
         
       
        

		if (deposit<10000){
            
			System.err.println ("Error: Minimum deposit 10,000");
        
			System.exit(1);
 
		}
         
        
		sc.close();
        
		      
		
		if (deposit>250000){
            
			System.err.println ("Error: Maximum deposit is 250,000");
        
			System.exit(1);
		}
       
		sc.close(); 
		
		if (deposit>=50000 && deposit<=250000){
            
			double interest=deposit*3.20/100;
            
			System.out.print ("Rate= 3.20   Interest= " + String.format("%.2f",interest));
            
        
		}
        

		if (deposit>=25000 && deposit<=49999.99){
            
			double interest=deposit*3.16/100;
            
			System.out.print ("Rate= 3.16   Interest= "+ String.format("%.2f",interest));
        
		}
        

		if (deposit>=10000 && deposit<=24999.99){
            
			double interest=deposit*2.76/100;
            
			System.out.print ("Rate= 2.76   Interest= " + String.format("%.2f",interest));
        
		}
         
         
    
	}

}