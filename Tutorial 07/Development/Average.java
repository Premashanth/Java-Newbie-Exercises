package WorkShop4;
import java.util.*;

public class Average {
    public static void main(String[] args) {

        int marks[] = new int[6];
        int max=marks[0];
        int min=marks[0];
        int avg=0;
        Scanner sc = new Scanner(System.in);
        //initializing an array with 10 for all elements
        System.out.println ("> java Average : ");

        for (int i = 0; i < marks.length; i++) {
            //Assign values with user input
            marks[i]=sc.nextInt();

        }

        for (int i = 0; i < marks.length; i++) {
                if (marks[i] > max)
                    max = marks[i];
            }

        System.out.println ("Largest :" + max);

        for (int i=1 ; i < marks.length; i++) {
            if (marks[i] < min)
                min = marks[i];
        }

        System.out.println ("Smallest :" + min);

        for (int i=1 ; i < marks.length; i++) {
            avg /=marks[i];
        }
        System.out.println ("Average :" + avg);

    }
}
