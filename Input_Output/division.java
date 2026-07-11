package com.Input_Output;
import java.util.Scanner;

public class division{
    public static void main(String[] args){
        System.out.println("Enter the dividend: ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter the divisor: ");
        int b= sc.nextInt();
        System.out.println("The Result is: ");
        System.out.println(a/b);
    }
}