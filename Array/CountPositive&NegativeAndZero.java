/*
Count positive, negative, and zero values.

Example
int[] arr = {5,-2,0,7,-1};

Output:

Positive = 2
Negative = 2
Zero = 1
Examples
Example 1::
Input:
3
10 20 30 

Output:
P=3
N=0
Z=0

Example 2:
Input:
3
-1 2 -3
Outpu:
P=1
N=2
Z=0
*/

import java.util.Scanner;

public class Main {

    public static void countElements(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("P=" + positive);
        System.out.println("N=" + negative);
        System.out.println("Z=" + zero);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countElements(arr);

        sc.close();
    }
}
