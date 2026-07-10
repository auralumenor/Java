package com.Input_Output;
import java.util.Scanner;

public class difference{
    public static void main(String[] args){
        System.out.println("Enter 1st Number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b=sc.nextInt();
        System.out.printf("The Difference is %d",a-b);
    }
}