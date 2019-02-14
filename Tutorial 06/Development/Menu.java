import java.util.*;
public class Menu{
  public static void main (String []args){
    Scanner sc=new Scanner (System.in);
   System.out.println ("Select [y]es, [n]o or [q]uite");
   
 String answer=sc.next();
 
   
   if (answer.equalsIgnoreCase("y")) {
	  System.out.println("You selected yes");
}
else if (answer.equalsIgnoreCase("n")){
	  System.out.println("You selected no");
}
else if (answer.equalsIgnoreCase("q")){
	  System.out.println("You selected quite");
}
else if (!(answer==" ")){
	  System.out.println("Invalid Input");
   }
   
  }
}