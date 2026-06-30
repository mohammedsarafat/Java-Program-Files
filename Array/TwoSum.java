/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6

Output: [0,1]
Examples
Example 1:
Input:
Enter array size: 
4 
Enter array elements: 
2 7 11 15 
Enter target value: 
9

Output:
Indices are: [0, 1]

Example 2:
Input:
Enter array size: 
3 
Enter array elements: 
3 2 4 
Enter target value: 
6
Output

Indices are: [1, 2]
*/

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.print(result[0] + " " + result[1]);
    }
}
