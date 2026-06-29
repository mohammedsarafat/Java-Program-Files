/*
write a program to insert an element at last. write  separate method for it and call the method from main method. 
method : int[] insertAtLast(int[] a, int element)

Examples
Example 1:

Input:
5
1 2 3 4 5
100

Output:
1 2 3 4 5 100

Example 2:
Input:
4
2 3 4 5
78

Output:
2 3 4 5 78
*/

import java.util.Scanner;

public class Main {

    public static int[] insertAtLast(int[] a, int element) {
        int[] result = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        result[a.length] = element;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int element = sc.nextInt();

        int[] result = insertAtLast(a, element);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
