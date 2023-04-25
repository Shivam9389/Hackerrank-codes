/*
write a program that creates integer array of n elements, accepts the values of arrays and find sum of elements as an integer.

Input Format

Accepts n values from the user.

Constraints

All number should be integer values (Positive, negative and zero)

Output Format

diplays the sum of the array's elements as a single integer.

Sample Input 0

5
3 4 10 11 20
Sample Output 0

48
*/

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Sol {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        sc.close();

        

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

        }

        

        System.out.println(sum);

    }

}