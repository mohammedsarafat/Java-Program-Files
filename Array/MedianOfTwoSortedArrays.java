/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000

Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Examples
Example 1:
Input:

Enter the size of first array: 
2 
Enter element 0 of first array: 
1 
Enter element 1 of first array: 
3 
Enter the size of second array: 
1 
Enter element 0 of second array: 
2

Output:
Median of the two sorted arrays: 2.0

Example 2:
Input:

Enter the size of first array: 
2 
Enter element 0 of first array: 
1 
Enter element 1 of first array: 
2 
Enter the size of second array: 
2 
Enter element 0 of second array: 
3 
Enter element 1 of second array: 
4
Output

Median of the two sorted arrays: 2.5
*/

import java.util.Scanner;

public class Main {

    // Method to find median of two sorted arrays
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Merge the two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        int total = m + n;

        if (total % 2 == 1) {
            return merged[total / 2];
        } else {
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums1 = new int[m];

        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] nums2 = new int[n];

        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        double median = findMedianSortedArrays(nums1, nums2);

        System.out.print("Median of the two sorted arrays: ");

        if (median == (int) median) {
            System.out.print((int) median);
        } else {
            System.out.print(median);
        }
    }
}
