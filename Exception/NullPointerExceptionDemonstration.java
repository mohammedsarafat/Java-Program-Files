/*
You are developing a Java program that works with String objects.
The program accepts a string input from the user and attempts to perform an operation on it, such as finding its length.

If the string reference is null, calling any method on it (for example, length()) should result in a NullPointerException.
The program must demonstrate this behavior and handle or identify the exception properly.
If the string is valid (not null), the program should display the length of the string.
This program demonstrates how Java handles NullPointerException when methods are invoked on null references and how to manage such cases using try-catch blocks.
Read a string value from user input
• Convert input "null" into a null reference
• Call length() on the string
• Handle NullPointerException if the string is null
• Display string length for valid input

Input Format
--------------------
Single line containing the string value

Output Format
-----------------------
If input is null:
NullPointerException
If input is valid:
Length: X

Examples
Example 1:
Output:
NullPointerException

Example 2:
Input:
Hello
Outpu:
Length: 5

*/

import java.util.Scanner;

public class StringNullCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if (input.length() == 0 || input.equals("null")) {
            input = null;
        }

        try {
            int length = input.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        sc.close();
    }
}
