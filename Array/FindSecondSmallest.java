/*
Write a program in java to find the second smallest element in an array.

Test Data :
Input the size of array : 5

Input 5 elements in the array (value must be <9999) :
element - 0 : 0
element - 1 : 9
element - 2 : 4
element - 3 : 6
element - 4 : 5

Expected Output :
The Second smallest element in the array is : 4

Note: Write a logic to find the second smallest element inside a method and also return the second smallest element

Method name:-findSecondSmallest
Argument Type:-1d int array type
Return type:- int

Take the input from the user inside the main method and also call the method from the main only and get the result back and print the output through main only.

Examples
Example 1:
Input:
Enter the size of the array: 5 
Enter 5 elements (value must be <9999): 
0 
9 
4 
6 
5

Output:
The Second smallest element in the array is : 4

Example 2:
Input:
Enter the size of the array: 4 
Enter 4 elements (value must be <9999): 
10 
2 
8 
6

Output:
The Second smallest element in the array is : 6
  */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            findSecondSmallest(arr);
        }
    }

    public static void findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < smallest) {
                secondSmallest = smallest;
                smallest = x;
            } else if (x > smallest && x < secondSmallest) {
                secondSmallest = x;
            }
        }

        IO.println("The Second smallest element in the array is : " + secondSmallest);
    }
}
