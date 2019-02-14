//To print stars satisfing the number of lines input by user
import java.util.*;
public class Pattern2{
	public static void main(String[] args){

		Scanner sc=new Scanner (System.in);
			System.out.print ("How many lines? ");
		int line=sc.nextInt();
			System.out.println( );
   
		for(int a=line;a>=1;a--){
			for(int b=line;b>a;b--){
				System.out.print(" ");
			}

			for(int c=1;c<(a*2);c++){
				System.out.print("*");
			}
			System.out.println();
	}
  
}
