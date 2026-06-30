/*
Write a Java program to rotate an array from a given position N.
Elements from position N to the end of the array should come first.
Elements before position N should come after them.

Input Format:
First line: An integer n — the size of the array.
Next n lines: Each line contains one integer — elements of the array.
Next line: An integer N — the position from which to rotate the array (0-indexed).

Output Format:
Print the rotated array in a single line.

Method Specifications:
Method Name: rotateArrayFromPosition
Arguments:
int[] arr — input array
int pos — rotation start position
Return Type: int[] — rotated array
Examples
Example 1:
Input:
7
10 20 30 40 50 60 70
3

Output:
Rotated array: 3 4 5 1 2

Example 2:
Input:
5
1 2 3 4 5
5

Output:
Invalid rotation position
*/

import java.util.Scanner;

public class Main {

    public static int[] rotateArrayFromPosition(int[] arr, int pos) {

        if (pos < 0 || pos >= arr.length) {
            return null;
        }

        int[] result = new int[arr.length];
        int k = 0;

        // Copy from position to end
        for (int i = pos; i < arr.length; i++) {
            result[k++] = arr[i];
        }

        // Copy from beginning to position-1
        for (int i = 0; i < pos; i++) {
            result[k++] = arr[i];
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

        int pos = sc.nextInt();

        int[] result = rotateArrayFromPosition(arr, pos);

        if (result == null) {
            System.out.println("Invalid rotation position");
        } else {
            System.out.print("Rotated array: ");
            for (int x : result) {
                System.out.print(x + " ");
            }
        }
    }
}
