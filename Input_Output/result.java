package com.Input_Output;
import java.util.Scanner;

public class result{
    public static void main(String[] args){
        System.out.println("Result Calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 1st Subject: ");
        int a=sc.nextInt();
        System.out.println("Enter the marks of 2nd Subject: ");
        int b=sc.nextInt();
        System.out.println("Enter the marks of 3rd Subject: ");
        int c=sc.nextInt();
        System.out.println("Enter the marks of 4th Subject: ");
        int d=sc.nextInt();
        System.out.println("Enter the marks of 5th Subject: ");
        int e=sc.nextInt();
        int sum=a+b+c+d+e;
        double avg= (double) sum /5;
        double perc= (double) (sum*100)/500;
        System.out.println("The Average is: "+avg);
        System.out.println("The Percentage is: "+perc);
        IO.println("Test");
    }
}