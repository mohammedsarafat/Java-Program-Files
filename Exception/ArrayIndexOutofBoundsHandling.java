/*
You are developing a Java program that works with a fixed-size integer array.
The program allows the user to access an element of the array using a given index.

If the user enters an index that is less than 0 or greater than or equal to the array length, the program should handle this situation gracefully by catching an ArrayIndexOutOfBoundsException and displaying an appropriate message.
For valid indices, the program should display the value stored at that index.

This program demonstrates how Java handles runtime exceptions related to invalid array access and how to manage them using try-catch blocks
Index must be within 0 to array length - 1
• Array size is fixed
int[] arr = {1, 2, 3};
Use a predefined integer array
• Read index value from user input
• Access array element using the index
• Handle ArrayIndexOutOfBoundsException
• Display either the value or exception message

Input Format
---------------------
Single integer representing the index to access
Output Format
----------------------
If index is invalid:
ArrayIndexOutOfBoundsException: Index X out of bounds for length N
If index is valid:
Value: element

Examples
Example 1:
Input:
5
Output:
ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

Example 2:
Input:
2

Output:
Value: 3

*/

import java.util.Scanner;

public class ArrayAccessExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3};

        int index = sc.nextInt();

        try {
            System.out.println("Value: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        sc.close();
    }
}
