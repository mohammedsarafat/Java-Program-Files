/*
Write a program in java to merge two arrays of same size sorted in descending order.

Test Data :
Input the number of elements to be stored in the first array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3


Input the number of elements to be stored in the second array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3

Expected Output :
The merged array in descending order is :
3 3 2 2 1 1

Note: Write the logic of merging two array element inside the method and also return the merge array elements through that method to the calling place.

Method name:- mergeArrays
Argument:- 2 array type
i) 1st 1-D array (int [] arr1)
ii)2nd 1-D array (itn [] arr2)

Return type:- int [] array
Logic :-Merge two array element and return the merge array 

Take the input from the user in main method for two different array
call the method from the main and get the result back and display 
it from main.

Example:
Input:
Enter the number of elements for first array: 3
Enter 3 elements:
1
2
3

Enter the number of elements for second array: 3
Enter 3 elements:
1
2
3

Output:
The merged array in descending order is: 
3 3 2 2 1 1
*/

import java.util.*;

public class Main {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
        }

        for (int i = 0; i < merged.length; i++) {

            for (int j = i + 1; j < merged.length; j++) {

                if (merged[i] < merged[j]) {

                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        return merged;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];


        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        if (n1 != n2) {

            System.out.println("Both array size must be same.");
            return;
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = mergeArrays(arr1, arr2);

        IO.print("The merged array in descending order is : ");

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
