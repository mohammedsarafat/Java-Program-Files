/*
Write a program in java to merge one sorted array into another sorted array.
Pivot element is the only element in input array which is smaller than it's previous element.
A pivot element divided a sorted rotated array into two monotonically increasing array.

Input Format:
First line: An integer n1, the size of the rotated sorted array.
Next n1 lines: Elements of the rotated sorted array (integers).
Next line: An integer n2, the size of the sorted array to merge.
Next n2 lines: Elements of the sorted array (integers).

Output Format:
Print the merged array in sorted order after combining both arrays.

Method Specifications:

Method Name: mergeArrays
Arguments:
int[] rotatedArray – the rotated sorted array
int[] sortedArray – the sorted array to merge
Return Type: int[] – the merged sorted array
Logic:
Identify the pivot in the rotated array.

Hints for Students:
Use binary search or a simple loop to find the pivot element.
Use merge logic from merge sort to combine arrays efficiently.
Remember that after the pivot, the rotated array continues in ascending order.
Split the rotated array into two increasing subarrays at the pivot.
Merge the two subarrays and the sorted array into a single sorted array.
Examples
Example 1:
Input:
6
14 18 22 2 5 9
3
1 6 10

Output:
Merged array in sorted order: 1 2 5 6 9 10 14 18 22

Example 2:
Input:
4
10 8 6 4
2
1 3

Output:
Cannot merge: first array is not rotated sorted.

*/

import java.util.Scanner;

public class Main {

    public static int[] mergeArrays(int[] rotatedArray, int[] sortedArray) {

        int n1 = rotatedArray.length;
        int n2 = sortedArray.length;

        int pivot = -1;
        int count = 0;

        for (int i = 1; i < n1; i++) {
            if (rotatedArray[i] < rotatedArray[i - 1]) {
                pivot = i;
                count++;
            }
        }

        if (count != 1) {
            return null;
        }

        for (int i = 1; i < pivot; i++) {
            if (rotatedArray[i] < rotatedArray[i - 1])
                return null;
        }

        for (int i = pivot + 1; i < n1; i++) {
            if (rotatedArray[i] < rotatedArray[i - 1])
                return null;
        }

        int[] sortedRotated = new int[n1];
        int k = 0;

        for (int i = pivot; i < n1; i++)
            sortedRotated[k++] = rotatedArray[i];

        for (int i = 0; i < pivot; i++)
            sortedRotated[k++] = rotatedArray[i];

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, m = 0;

        while (i < n1 && j < n2) {
            if (sortedRotated[i] <= sortedArray[j]) {
                merged[m++] = sortedRotated[i++];
            } else {
                merged[m++] = sortedArray[j++];
            }
        }

        while (i < n1)
            merged[m++] = sortedRotated[i++];

        while (j < n2)
            merged[m++] = sortedArray[j++];

        return merged;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] rotatedArray = new int[n1];

        for (int i = 0; i < n1; i++) {
            rotatedArray[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] sortedArray = new int[n2];

        for (int i = 0; i < n2; i++) {
            sortedArray[i] = sc.nextInt();
        }

        int[] result = mergeArrays(rotatedArray, sortedArray);

        if (result == null) {
            System.out.println("Cannot merge: first array is not rotated sorted.");
        } else {
            System.out.print("Merged array in sorted order: ");
            for (int x : result) {
                System.out.print(x + " ");
            }
        }
    }
}
