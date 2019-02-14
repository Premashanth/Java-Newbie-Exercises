public class Exe3 {
    public static void main (String []args){
     System.out.println("Degree    Radian");

     System.out.println("0 \t \t" +angleToRadian(0));
        System.out.println("15 \t \t" +angleToRadian(15));
        System.out.println("30 \t \t" +angleToRadian(30));
        System.out.println("45 \t \t" +angleToRadian(45));
        System.out.println("60 \t \t" +angleToRadian(60));
        System.out.println("75 \t \t" +angleToRadian(75));
        System.out.println("80 \t \t" +angleToRadian(80));
    }

    public static double angleToRadian(double deg){
        double rad=deg/180*Math.PI;
        return rad;
    }
}
