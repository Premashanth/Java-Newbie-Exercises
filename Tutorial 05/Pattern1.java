//To print right angel triangle stars satisfing the number of lines input but user 

import java.util.*;
public class Pattern1{
	public static void main(String[] args){
	
		Scanner sc=new Scanner (System.in);
			System.out.print ("How many lines? ");
		int line=sc.nextInt();
			System.out.println( );
		
		for (int a = 0; a < line; a++) { 
			for (int b = 0; b < line - a; b++) {
			} 
				for (int c = 0; c <= a; c++) { 
			System.out.print("* "); 
				}            
			System.out.println();
			} 
	}
}