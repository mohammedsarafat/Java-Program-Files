/*
Write a program in java to copy the elements of one array into another array.
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 15
element - 1 : 10
element - 2 : 12

Expected Output :
The elements stored in the first array are :
15 10 12

The elements copied into the second array are :
15 10 12

Note: Write a logic to copy the one array into another array in a method and also write the logic of printing the coarray through a method.

Method name:-copyArray
Argument Type:- 2 parameter
i) 1d int array type(source type)
ii)1d int array type(destination type)
Return type:- void
Logic:-Copy the source array into the destination array

Method name:-copyArray
Argument Type:- 1d int array
Return type:-void
Logic:-printing the array element

Take the input from the user inside the main method and also call the method to execute the logic from the main only

Example 1:
Input:
Input the number of elements to be stored in the array: 3
Input 3 elements in the array:
element - 0: 15
element - 1: 10
element - 2: 12

Output:
The elements stored in the first array are:
15 10 12

The elements copied into the second array are:
15 10 12

Example 2:
Input:
Input the number of elements to be stored in the array: 4
Input 4 elements in the array:
element - 0: 5
element - 1: 7
element - 2: 9
element - 3: 11

Output:
The elements stored in the first array are:
5 7 9 11

The elements copied into the second array are:
5 7 9 11

*/

import java.util.*;

public class Main {

    public static void copyArray(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }

    public static void copyArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] copiedArray = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        copyArray(arr, copiedArray);

        IO.println("The elements stored in the first array are : ");
        copyArray(arr);  

        IO.println("The elements copied into the second array are : ");
        copyArray(copiedArray);

        sc.close();
    }
}
