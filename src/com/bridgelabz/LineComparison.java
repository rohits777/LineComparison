package com.bridgelabz;
import java.util.Scanner;

class LineComparision{
    static double length(int x1,int y1, int x2, int y2){
        double length = Math.sqrt((double)((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("The length 1 is :" + length);
        return length;
    }
}
 class Compare extends LineComparision  {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        // input coordinates of line 1
        System.out.println("Enter the value of X1 ");
        int x1 = Sc.nextInt();
        System.out.println("Enter the value of Y1 ");
        int y1 = Sc.nextInt();
        System.out.println("Enter the value of X2 ");
        int x2 = Sc.nextInt();
        System.out.println("Enter the value of Y2 ");
        int y2 = Sc.nextInt();

        // input of line 2
        System.out.println("Enter the value of a1 ");
        int a1 = Sc.nextInt();
        System.out.println("Enter the value of b1 ");
        int b1 = Sc.nextInt();
        System.out.println("Enter the value of a2 ");
        int a2 = Sc.nextInt();
        System.out.println("Enter the value of b2 ");
        int b2 = Sc.nextInt();

        LineComparision obj = new LineComparision();
        double l1 = obj.length(x1,y1,x2,y2);
        double l2 = obj.length(a1, b1,a2,b2);

        String line1 = Double.toString(l1);
        String line2 = Double.toString(l2);

        if (line1.compareTo(line2) < 0) {
            System.out.println(" Line 1 is greater than line 2");
        } else if (line1.compareTo(line2) > 0) {
            System.out.println("Line 1 is shorter than line 2");
        } else if(line1.compareTo(line2) == 0) {
            System.out.println("Both line are equal ");
        }
    }
}