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

        double length=Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of a line is: "+length);

    }
}
