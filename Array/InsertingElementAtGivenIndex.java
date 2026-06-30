/*
write a program to insert the element at given index. write a separate method and call the method from main method.
method : int[] isertAtGivenIndex(int[]a, int element, int index)
Examples
Example 1:
Input:
4
3 4 5 6
100
2

Output:
3 4 100 5 6

Example 2:
Input:
5
1 1 2 2 3 
40
3

Output:
1 1 2 40 2 3
*/

import java.util.Scanner;

public class Main {

    public static int[] insertAtGivenIndex(int[] a, int element, int index) {
        int[] b = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }

        b[index] = element;

        for (int i = index; i < a.length; i++) {
            b[i + 1] = a[i];
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt())
            return;

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n && sc.hasNextInt(); i++) {
            a[i] = sc.nextInt();
        }

        if (!sc.hasNextInt())
            return;
        int element = sc.nextInt();

        if (!sc.hasNextInt())
            return;
        int index = sc.nextInt();

        int[] result = insertAtGivenIndex(a, element, index);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1)
                System.out.print(" ");
        }
    }
}
