/*
Write a program in java to store elements in an array and print it.
Input 10 elements in the array :
element - 0 : 1
element - 1 : 1
element - 2 : 2

.......

and so on.
Expected Output :
Elements in array are: 1 1 2 3 4 5 6 7 8 9

Note: Take the input from the user and read and print the element inside the main method only.

Example :
Input:
Input 10 elements in the array: 
element - 0: 1 
element - 1: 1 
element - 2: 2 
element - 3: 3 
element - 4: 4 
element - 5: 5 
element - 6: 6 
element - 7: 7 
element - 8: 8 
element - 9: 9

Output:
Elements in array are: 1 1 2 3 4 5 6 7 8 9

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            int size = sc.nextInt();
            int[] arr = new int[size];

            for(int i=0;i<size;i++){
                if(sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                }
            }
            
            IO.println("Elements in array are: ");

            for(int x : arr){
                IO.print(x+" ");
            }
        }        
    }
}
