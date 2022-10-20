package com.bridgelabz;
import java.util.*;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparision program");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x1 co-ordinate: ");
        int x1= sc.nextInt();

        System.out.println("Enter y1 co-ordinate: ");
        int y1=sc.nextInt();

        System.out.println("Enter x2 co-ordinate: ");
        int x2=sc.nextInt();

        System.out.println("Enter y2 co-ordinate: ");
        int y2=sc.nextInt();

        System.out.print("Enter the p1 co-ordinate : ");
        int p1 = sc.nextInt();
        System.out.print("Enter the q1 co-ordinates : ");
        int q1 = sc.nextInt();
        System.out.print("Enter the p2 co-ordinates : ");
        int p2 = sc.nextInt();
        System.out.print("Enter the q2 co-ordinates : ");
        int q2 = sc.nextInt();

        double length=Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of a line is: "+length);

        double length2 = Math.sqrt((p2 - p1)^2 + (q2 - q1)^2);
        System.out.println("Length of the line2 is :: "+length2);

        if (length == length2)
            System.out.println("length and lenght2 lines are having same length");
        else if(length > length2)
            System.out.println("Length "+length+" is greater than Length2 "+length2);
        else
            System.out.println("Length2 "+length2+" is greater than Length "+length);
    }
}
