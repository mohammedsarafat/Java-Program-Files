/*
Problem Statement

Given an integer array, rotate the array to the right by K positions.

Input Format
First line: integer N (size)
Second line: N integers
Third line: integer K

Output Format
Rotated array

Examples
Example 1:
Input:
5
1 2 3 4 5
2

Output:
4 5 1 2 3

Example 2:
Input:
4
10 20 30 40
1

Output:
40 10 20 30

*/

import java.util.Scanner;

public class Main {

    public static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];

        // Handle cases where k > n
        k = k % n;

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] result = rotateRight(arr, k);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
