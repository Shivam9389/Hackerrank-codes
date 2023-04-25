/*
Write a program to take one input of double type from the user. If the value is positive convert it into int and display it, otherwise display the message “Invalid Input”.

Input Format

Your program should take one input of double type

Constraints

Input should be positive double number

Output Format

If the input value is positive number (including 0) display the value in int type otherwise display the message “Invalid Input”.

Sample Input 0

5.0
Sample Output 0

5
Sample Input 1

-5.0
Sample Output 1

Invalid Input
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        if (input >= 0) {
            int output = (int) input;
            System.out.println(output);
        } else {
            System.out.println("Invalid Input");
        }
    }
}