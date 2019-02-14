import java.util.Scanner;
public class FutureInvestment {
    public static void main(String args[]){
        
        Scanner sc=new Scanner (System.in);
        
        System.out.print ("Enter the Investment Amount: ");
        double investment_amount=sc.nextDouble();
        
        System.out.print ("Enter the Annual Interest Rate: ");
        double annual_interest_rate=sc.nextDouble();
        
        System.out.print ("Enter the Number of Years: ");
        double years=sc.nextDouble();
 
        double future_investment_value = investment_amount*Math.pow((1 + (annual_interest_rate / 12)), (years * 12)); 
            
        System.out.println ("Future Invested Amount: " + String.format("%.3f",future_investment_value));
    }
}
   	



