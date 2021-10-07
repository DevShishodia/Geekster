package com.company.geekster;

public class Main {

    public static void main(String[] args) {
	    int arr[]={4,2,6,2,4,5,6};
	    int temp = 0;
	    for (int i =0;i<arr.length;i++){
	             temp = arr[i]^temp;
        }
        if (temp !=0)
        System.out.println(temp +" is the number appearing only one time in the array");
	    else
	        System.out.println("No one is appearing one time only");
    }
}
