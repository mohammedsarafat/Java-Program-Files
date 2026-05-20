/*
Problem Statement:

Given an integer array, find and print the largest element present in the array.
Examples
Example 1:
Input:
5
10 25 7 89 14

Output:
89

Example 2:
Input:
4
1 2 3 4

Output:
4

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            int size = sc.nextInt();
            int[] arr = new int[size];

            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }

            largestElement(arr);
        }
        
    }

    public static void largestElement(int[] arr){
        int higher = arr[0];
        for(int x : arr){
            if(x>higher){
                higher = x;
            }
        }

        IO.println(higher);
    }
}
