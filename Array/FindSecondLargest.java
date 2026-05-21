/*
Write a program in java to find the second largest element in an array. 

Test Data :
Input the size of array : 5
Input 5 elements in the array :
element - 0 : 2
element - 1 : 9
element - 2 : 1
element - 3 : 4
element - 4 : 6

Expected Output :
The Second largest element in the array is : 6

Note: Write a logic to find the second largest element inside a method and also return the second largest element
Method name:-findSecondLargest
Argument Type:-1d int array type
Return type:- int

Take the input from the user inside the main method and also call the method from the main only and get the result back and print the output through main only.

Example:
Input:

Input the size of array: 5 
Input 5 elements in the array: 
element - 0: 2 
element - 1: 9 
element - 2: 1 
element - 3: 4 
element - 4: 6

Output:
The Second largest element in the array is : 6
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            int size = sc.nextInt();
            int[] arr = new int[size];

            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }

            findSecondLargest(arr);
        }
        
    }

    public static void findSecondLargest(int[] arr){
        int higher = arr[0];
        int secondHigher = arr[0];
        for(int x : arr){
            if(x>higher){
                secondHigher = higher;
                higher = x;
            }else if(x>secondHigher){
                secondHigher = x;
            }
        }

        IO.println("The Second largest element in the array is : "+secondHigher);
    }
}
