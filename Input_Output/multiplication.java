package com.Input_Output;
import java.util.Scanner;

public class multiplication{
    public static void main(String[] args){
        System.out.println("Enter The initial number: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        int b= sc.nextInt();
        System.out.println("The Result is: ");
        System.out.println(a*b);
    }
}