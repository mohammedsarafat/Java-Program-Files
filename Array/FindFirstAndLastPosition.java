/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Method Specification:
Method Name: findFirstAndLastPosition
Arguments:
int[] nums — sorted array
int target — target value
Return Type: int[] — an array of size 2 containing [start_index, end_index]
Examples
Example 1:
Input:
Enter the number of elements in the array: 
6 
Enter element 0: 
5 
Enter element 1: 
7 
Enter element 2: 
7 
Enter element 3: 
8 
Enter element 4: 
8 
Enter element 5: 
10 
Enter the target value: 
8

Output:
Target found at positions: [3, 4]

Example 2:
Input:
Enter the number of elements in the array: 
5 
Enter element 0: 
1 
Enter element 1: 
3 
Enter element 2: 
5 
Enter element 3: 
7 
Enter element 4: 
9 
Enter the target value: 
5

Output:
Target found at positions: [2, 2]
*/

import java.util.Scanner;

public class Main {

    public static int[] findFirstAndLastPosition(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find first occurrence
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result[0] = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result[1] = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] ans = findFirstAndLastPosition(nums, target);

        System.out.print("[" + ans[0] + "," + ans[1] + "]");
    }
}
