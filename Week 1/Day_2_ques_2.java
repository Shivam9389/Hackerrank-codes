/*
Peter asked his friend Max to implement a Java program in which 3 integers X, Y and N are given as a runtime input and all the numbers between X and Y which are divisible by N must be displayed on console. If no such number is possible for the given input then, print NO OUTPUT.

Input Format

3 space separated integers X, Y and N

Constraints

X, Y and N are less than 1000

X and Y are positive integers and X < Y

Output Format

All the integers between X and Y separated by space which are divisible by N

Sample Input 0

6 11 3
Sample Output 0

6 9
Sample Input 1

2 6 2
Sample Output 1

2 4 6
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int j,k,l;
       j= sc.nextInt();
      k= sc.nextInt();
     l= sc.nextInt();
        int i;
        for(i=j;i<=k;i++)
        {
            if(i%l==0){
            System.out.print(i+" ");
            }
            
        }
    }
}