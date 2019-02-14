package WorkShop4;

import java.util.*;
public class Search {
    public static void main (String []args){

                int arr[];
                        arr =new int[10];
int arrIndex=0;
                Scanner sc=new Scanner(System.in);
        System.out.print ("> Java Search ");

                for(int i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();


                    if(arr[i]>arr[arrIndex])
                        arrIndex = i;

                }

                System.out.print ("Enter the number to be found: ");
               int searchKey =sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[arrIndex])
                arrIndex = i;

        }



                boolean result = findValue(arr,searchKey);

                if(result)
                    System.out.println("Value found " + arrIndex );
                else
                    System.out.println("Value not found");

            }

            //Linear search
            public static boolean findValue(int a[],int key){
                for(int i=0;i<a.length;i++){
                    if(a[i]==key){
                        return true;
                    }

                }

                return false;
            }
        }

