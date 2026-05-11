Description
Write a program in java to sort elements of array in ascending order.
Test Data :
Input the size of array : 5
Input 5 elements in the array :
element - 0 : 2
element - 1 : 7
element - 2 : 4
element - 3 : 5
element - 4 : 9

Expected Output :
Elements of array in sorted ascending order:
2 4 5 7 9

Note: Write the logic to sort the array element in ascending order inside a method and also print the array through method only.

Method name:-arrSort
argument :- 1 int array type
logic: For sorting the array element in acending order

Method name:-printArray
argument :- 1 int array type
logic: For printing the sorted array element

Example 1:
Input:
Input the size of array: 5 
Input 5 elements in the array: 
element - 0: 2 
element - 1: 7 
element - 2: 4 
element - 3: 5 
element - 4: 9

Output :
Elements of array in sorted ascending order:
2 4 5 7 9

  
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        if(sc.hasNextInt()){
            int size = sc.nextInt();
            int arr[] = new int[size];


            for(int i=0;i<size;i++){
                if(sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                }
            }
            
            arrSort(arr);
            printArray(arr);
        }
        sc.close();
    }

    public static void arrSort(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr){
        IO.println("Elements of array in sorted ascending order: ");
        for(int x : arr){
            IO.println(x+" ");
        }
    }
}
