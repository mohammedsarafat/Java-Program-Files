/*
You are developing a simple calculator program that performs integer division.
The program should accept two integers from the user: a numerator and a denominator, and then perform division of the numerator by the denominator.
If the user enters 0 as the denominator, the program must handle this situation gracefully by throwing and catching an ArithmeticException.
For valid inputs, the program should display the result of the division.
This program demonstrates how Java handles runtime exceptions and how to use try-catch blocks to manage divide-by-zero errors safely.
Read numerator and denominator from user input
• Perform integer division
• Handle ArithmeticException when denominator is zero
• Display appropriate result or exception message

Input Format
----------------------
First line: Numerator
Second line: Denominator
Output Format
-----------------------
If denominator is zero:
ArithmeticException: / by zero
If denominator is non-zero:
Result: numerator / denominator = result

Examples
Example 1:
Input:
10
0

Output:
ArithmeticException: / by zero

Example 2:
Input:
20
4

Output:
Result: 20 / 4 = 5

*/

import java.util.Scanner;

public class DivisionCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator;
            IO.println("Result: " + numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            IO.println("ArithmeticException: " + e.getMessage());
        }

        sc.close();
    }
}
