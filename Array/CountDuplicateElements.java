/*
Write a program in java to count a total number of duplicate elements in an array.

Input the number of elements to be stored in the array :3
Input 3 elements in the array :

element - 0 : 5
element - 1 : 1
element - 2 : 1
element - 3 : 6
..........

and so on

Expected Output :
Total number of duplicate elements found in the array is : 1

Note: Write the logic inside the method to count the duplicate and return 
the result back to the calling place.

Method Name:- countDuplicates
Argument Type:- 1-D array( int [] arr)
Return Type:- int type
Logic : To Find the logic to count the duplicate and return the 
result;

Take the input from the user inside the main method and also call the method from the main and also print the result from the main.

Examples:
Example 1:
Input:
Enter number of elements: 4
Enter elements:
5 1 1 6

Output:
Total number of duplicate elements found in the array is : 1

Example 2:
Input:
Enter number of elements: 8
Enter elements:
1 2 2 3 4 4 5 6

Output:
Total number of duplicate elements found in the array is : 2

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Total number of duplicate elements found in the array is : " + countDuplicates(arr));
        }
    }

    public static int countDuplicates(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
