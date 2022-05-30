package com.bridgelabs.linecomparsion;

import java.util.Objects;
import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of line1");
        System.out.println("enter co-ordinates of x1 and y1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("enter co-ordinates of x2 and y2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int lengthOfLine1 = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("length of line1 is" + " " + lengthOfLine1);
        System.out.println("Enter the co-ordinates of line2");
        System.out.println("enter co-ordinates of x3 and y3");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("enter co-ordinates of x4 and y4");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int lengthOfLine2 = (int) Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        System.out.println("length of line2 is" + " " + lengthOfLine2);
        System.out.println();
        boolean isLinesEqual = Objects.equals(lengthOfLine1, lengthOfLine2);
        if (isLinesEqual)
            System.out.println("Lines are Equal");
        else
            System.out.println("Lines are not Equal");
        Integer line1 = lengthOfLine1;
        Integer line2 = lengthOfLine2;
        int result = line1.compareTo(line2);
        if (result == 1)
            System.out.println("line1 is greater than line2");
        else if (result < 0)
            System.out.println("line1 is smaller than line2");
        else
            System.out.println("line1 and line2 are equal");
    }

}
