/*
You are required to validate the length of a password entered by the user.
- A password must have a minimum length of 6 characters to be considered valid.
- If the password length is less than 6 characters, t
he program should throw an exception indicating that the password is too short.
- If the password length is 6 or more characters, the program should display a validation success message.
This problem helps students understand basic input validation and how to use exceptions in programming.

Input Format
---------------------
- A single string representing the password entered by the user.
Example:
mypwd123

Output Format
-----------------------
- If the password length is valid (≥ 6 characters):
Password is valid
- If the password length is invalid (< 6 characters):
Exception: Password length must be at least 6 characters
Examples
Example 1:
Input:
secure123

Output:
Password accepted

Example 2:
Input:
abc

Output:
Password length must be at least 6 characters

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        String password = IO.readln();

        try{
           validatePassword(password);
        }
        catch(PasswordTooShortException e){
            IO.println(e.getMessage());
        }        
    }

    public static void validatePassword(String password) throws PasswordTooShortException{
        if(password.length()<6){
            throw new PasswordTooShortException("Password length must be at least 6 characters");
        }
        else{
            IO.println("Password accepted");
        }
    }
}

class PasswordTooShortException extends RuntimeException{
    PasswordTooShortException(String message){
        super(message);
    }
}

