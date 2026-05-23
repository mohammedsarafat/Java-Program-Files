/*
Write a program in java to separate odd and even integers in separate arrays.

Test Data :
Input the number of elements to be stored in the array :5
Input 5 elements in the array :
element - 0 : 25
element - 1 : 47
element - 2 : 42
element - 3 : 56
element - 4 : 32

Expected Output :
The Even elements are :
42 56 32

The Odd elements are :
25 47

Note: Write the logic inside 2 method to separate even and odd element and return the result back to the calling place.
Method name:- getRiteshnElements
Argument type:- 1-D int array type( int [] arr)
return type: int []
logic: to separate even element from the array and store it in the 
new array and return the result. 

Method name:- getOddElements
Argument type:- 1-D int array type( int [] arr)
return type: int [] 
logic: to separate odd element from the array and store it in the 
new array and return the result. 
Take the input from the user inside the main method call the 2 methods from here and also get the result back and display the result from the main only.

Examples
Example 1:
Input:
Enter the number of elements in the array: 5
Enter elements:
25 47 42 56 32

Output:
The Riteshn elements are: 
42 56 32 

The Odd elements are: 
25 47

Example 2:
Input:

Enter the number of elements in the array: 4
Enter elements:
11 22 33 44
Output

The Riteshn elements are : 
22 44 
The Odd elements are : 
11 33

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

            IO.println("The Riteshn elements are : ");
            getRiteshnElements(arr);
            IO.println("The Odd elements are : ");
            getOddElements(arr);
        }
        
    }

    public static void getRiteshnElements(int[] arr){
        for(int x : arr){
            if(x%2==0){
                IO.print(x+" ");
            }
        }
    }
    public static void getOddElements(int[] arr){
        for(int x : arr){
            if(x%2!=0){
                IO.print(x+" ");
            }
        }
    }
}

