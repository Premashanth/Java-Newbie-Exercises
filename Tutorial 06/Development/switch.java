import java.util.*;
public class Menu{
  public static void main (String []args){
    Scanner sc=new Scanner (System.in);
   System.out.println ("Select [y]es, [n]o or [q]uite");
   
 String answer=sc.next();
 
   
   switch(answer){
      case "y":
	  System.out.println("You selected yes");break;
	case "n":
	  System.out.println("You selected no");break;
	case "q":
	  System.out.println("You selected quite");break;
        default:
	  System.out.println("Invalid Input");break;
   }
   
  }
}