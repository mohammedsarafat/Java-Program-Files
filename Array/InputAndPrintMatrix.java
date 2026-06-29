/*

Write a Java program to input a 2D array (3x3 matrix) from the user and display it in matrix form.
This program helps understand the basics of 2D array input and output.

Input:
- 9 integer elements representing a 3x3 matrix

Output:
- Print the matrix in 3 rows and 3 columns

Example:
Input:
1 2 3
4 5 6
7 8 9

Output:
Matrix:
1 2 3
4 5 6
7 8 9
Examples
Example 1:

Input

1 
2 
3 
4 
5 
6 
7 
8 
9
Output

Matrix: 
1 2 3 
4 5 6 
7 8 9
Example 2:

Input

10
20
30
40
50
60
70
80
90
Output

Matrix: 
10 20 30 
40 50 60 
70 80 90
Explanation

Uses nested loops to read and print a 2D array row by row.

*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
