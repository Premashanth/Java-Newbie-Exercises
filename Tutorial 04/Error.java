import java.util.Scanner;
public class Error {
	public static void main (String []args) {
		int x;
		Scanner sc= new Scanner (System.in);
		System.out.print ("Enter an integer greater than zero:");
		x = sc.nextInt();
		if (x!=0)
		{
			System.out.print ("Not Zero \n");
		}else{
			System.out.print ("Zero Entered");
		}
	}
}