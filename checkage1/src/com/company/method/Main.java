package com.company.method;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Age of person = ");
        int age = s.nextInt();
        boolean flag = validateage(age);
        if (flag==true)
            System.out.println("Person can vote");
        else
            System.out.println("Person cannot vote");
    }
    static boolean validateage(int age){
        if (age >= 18)
            return true;
        else
            return false;
    }
}
