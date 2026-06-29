/*
Write a program in java to read n number of values in an array and display it in reverse order.
Input the number of elements to store in the array :3
Input 3 number of elements in the array :
element - 0 : 2
element - 1 : 5
element - 2 : 7

Expected Output :
The values store into the array are :
2 5 7

The values store into the array in reverse are :
7 5 2

Note:
Write the logic of printing the element and reverse printing the element
in 2 different method.

Method name:-printArray
argument :- 1 int array type
logic: For printing the array element

Method name:- reverseArray
argument :- 1 int array type
logic: For reverse printing the array element

Call all the Methods from main method.
Examples
Example 1:
Input:
Input the number of elements to store in the array: 3 
Input 3 number of elements in the array: 
element - 0: 2 
element - 1: 5 
element - 2: 7

Output:
The values stored into the array are: 
2 5 7 

The values stored into the array in reverse are: 
7 5 2

Example 2:
Input:
Input the number of elements to store in the array: 4 
Input 4 number of elements in the array: 
element - 0: 10 
element - 1: 20 
element - 2: 30 
element - 3: 40

Output:
The values stored into the array are: 
10 20 30 40 

The values stored into the array in reverse are: 
40 30 20 10

*/

import java.util.Scanner;

public class Main {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The values store into the array are :");
        printArray(arr);

        System.out.println("The values store into the array in reverse are :");
        reverseArray(arr);
    }
}
