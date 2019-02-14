import java.util.Scanner;

public class UpperLowerCase{
    
	public static void main (String []args){
    
   
	
	Scanner sc=new Scanner (System.in);
    
   
	
	System.out.print ("Enter character in Upper Case: ");
    
	String upperCase=sc.next();
    
    
	
	String lowerCase=upperCase.toLowerCase();
    
	System.out.println ("To Lower Case: " + lowerCase);
    
	}

}