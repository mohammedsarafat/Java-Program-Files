/*
Write a program in java to print all unique elements in an array. 

Test Data :
Input the number of elements to be stored in the array: 4
Input 4 elements in the array :

element - 0 : 3
element - 1 : 2
element - 2 : 2
element - 3 : 5

Expected Output :
The unique elements found in the array are: 3 5

Note : Write the logic to find all the unique element through the method and also return back the result from the method and also write a method to print the array element.

Method Name:- getUniqueElements
Argument Type:- 1-D array (int [] array)
Return type:- return the array element( int [])
Logic : To find the unique element from the given array elements.


Method Name:-printArray
Argument Type:- 1-D array (int [] array)
Return type:- void 
Logic : To print the array element 

Take the input from the user inside the main method and call the method from the main and print the result.
Examples
Example 1::
Input:
Enter the size of the array: 4 
Enter 4 elements: 
3 
2 
2 
5

Output:
The unique elements found in the array are: 3 5

Example 2:
Input:
Enter the size of the array: 5 
Enter 5 elements: 
1 
1 
2 
3 
3

Output:
The unique elements found in the array are: 2
*/

import java.util.Scanner;

public class Main {

    public static int[] getUniqueElements(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int freq = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            if (freq == 1) {
                count++;
            }
        }

        int[] unique = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int freq = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            if (freq == 1) {
                unique[index++] = arr[i];
            }
        }

        return unique;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] unique = getUniqueElements(arr);

        System.out.print("The unique elements found in the array are: ");
        printArray(unique);

        sc.close();
    }
}
