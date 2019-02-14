import java.util.Scanner;

public class ASCII{
    
	public static void main (String []args){
        

	Scanner sc=new Scanner (System.in);
        
	
	System.out.print ("Enter an ASCII code between 1 and 128: ");
        
	int ascii=sc.nextInt();
        
    
    
    
	
	if (ascii<1 || ascii>128){
        
		System.out.print ("Please enter within the range of 1 and 128");
    
	}
    
	else{
    
		char asciiLetter =(char) ascii;
    
		System.out.println (+ ascii + " ---> " + asciiLetter);
    
		}
    
	}

}