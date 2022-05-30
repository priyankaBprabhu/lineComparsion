package com.bridgelabs.linecomparsion;

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
    }

}
