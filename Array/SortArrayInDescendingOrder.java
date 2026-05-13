/*
Write a program in java to sort elements of the array in descending order. 

Test Data :
Input the size of array : 3
Input 3 elements in the array :
element - 0 : 5
element - 1 : 9
element - 2 : 1

Expected Output :
Elements of the array in sorted descending order:
9 5 1

Note: Write the logic to sort the array element in descending order inside
a method and also print the array through method only.

Method name:-SortDescending
argument :- 1 int array type
logic: For sorting the array element in descending order

Method name:- printArray
argument :- 1 int array type
logic: For printing the sorted array element

Example:
Input:
Input the size of array: 3 
Input 3 elements in the array: 
element - 0: 5 
element - 1: 9 
element - 2: 1

Output:
Elements of the array in sorted descending order: 
9 5 1

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            int size = sc.nextInt();
            int[] arr = new int[size];

            for(int i=0;i<size;i++){
                if(sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                }
            }

            SortDescending(arr);
            printArray(arr);

        }        
    }

    public static void SortDescending(int[] arr){
        int temp=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr){
        IO.println("Elements of the array in sorted descending order: ");
        for(int x : arr){
            IO.print(x+" ");
        }
    }
}

