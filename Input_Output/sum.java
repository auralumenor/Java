package com.Input_Output;
import java.util.Scanner;

public class sum{
    public static void main(String []args){
        System.out.println("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The Sum is:");
        System.out.println(sum);
    }
}