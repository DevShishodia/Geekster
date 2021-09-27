package com.company.geekster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of circle = ");
        float radius = s.nextFloat();
        float result = area(radius);
        System.out.println("Area of circle is = " + result);
        float result1 =  circumference(radius);
        System.out.println("Circuference of circle is = " + result1);
    }
    static float area(float radius) {
        float r = radius*radius;
        return r*3.14f;
    }
    static float circumference(float radius) {
        float s = radius+radius;
        return s*3.14f;
    }
}