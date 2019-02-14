//Program to calculate the total time spend by the workers in office

import java.util.Scanner;
	public class ClockInAndOut{
  		public static final int MINUTES=60; 
	 	public static void main(String[] args) {
     			Scanner sc=new Scanner (System.in);
   			
			//Getting the clock in and clock out time from the workers 
   			System.out.print ("Enter Data: ");
     			
			int clockInHour = sc.nextInt();
    			int clockInMin =sc.nextInt();
   			int clockOutHour=sc.nextInt();
   			int clockOutMin =sc.nextInt();
			
     			//Calculating the time spent
    			long totalClockInInMinutes = clockInHour *MINUTES + clockInMin;
      			long totalClockOutInMinutes = clockOutHour *MINUTES + clockOutMin; 
     			long totalTime = totalClockOutInMinutes - totalClockInInMinutes;
       			long inHour = totalTime / MINUTES; 
			long  inMin = totalTime% MINUTES;
       			
			//Displaying the time spent in hours and minutes
			System.out.println (inHour+"h"+inMin);
   
     	}
}