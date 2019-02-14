import java.util.Scanner;
public class Even{
    
	public static void main(String []args){
     	Scanner sc=new Scanner (System.in);
	System.out.print ("Enter a number: ");
       	int number=sc.nextInt();
           
	
   	if (number%2==0){
            
		System.out.println ("Is " + number + " even? true");}

         
	else{ 
            
		System.out.println ("Is " + number + " even? false");}
      
    
	}

}