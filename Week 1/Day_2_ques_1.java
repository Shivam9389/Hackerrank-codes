/*
Jeevan got an assignment where he need to determine whether a given integer is prime number or not. Write a java programming solution to help Amit.

Input Format

First Line contain one integer number N

Constraints

N should be positive

Output Format

Return "Prime Number" incase integer is a prime number or return "Not Prime Number" incase it is not.

Sample Input 0

3
Sample Output 0

Prime Number
Sample Input 1

4
Sample Output 1

Not Prime Number
*/

import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
 int num =obj.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println("Prime Number");
    else
      System.out.println("Not Prime Number");
        
    }
}