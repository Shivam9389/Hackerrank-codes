/*
Mrs. Jhunjhunwala has taught Programming in Java to the second-year students in ICE college and conducted 3 academic tasks for all the (N) students. Marks are store in a 2-D array but now Mrs. Jhunjhunwala is willing to implement a java program which can accept the 2-D array of marks and return the average marks of Best 2 Academic Tasks of each student. Help her to implement a method public double[] average_marks(double [][] marks)

Input Format

First line reads the number of students N Next N lines read the marks of each student seperated by space

Constraints

n>0

Output Format

Prints the Avaerage marks of best 2 Academic tasks of N students separated by space

Sample Input 0

2
10.5 2.5 15
5.25 6.75 11.25
Sample Output 0

12.75 9.0
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
    static double[] average_marks(double[][] arr1,int n2)
    {
        double a1,b1,c1,temp=0;
        double arr3[] = new double[n2];
        for(int i=0;i<n2;i++)
        {
            a1 = arr1[i][0];
            b1 = arr1[i][1];
            c1 = arr1[i][2];
            if(a1>b1 && a1>c1)
            {
                temp = temp + a1;
                if(b1>c1)
                {
                    temp = temp + b1;
                    temp = temp/2;
                    arr3[i] = temp;
                }
                else
                {
                    temp = temp + c1;
                    temp = temp/2;
                    arr3[i] = temp;
                }
            }
            else if(b1>a1 && b1>c1)
            {
                temp = temp + b1;
                if(a1>c1)
                {
                    temp = temp + a1;
                    temp = temp/2;
                    arr3[i] = temp;
                }
                else
                {
                    temp = temp + c1;
                    temp = temp/2;
                    arr3[i] = temp;
                }
            }
            else if(c1>a1 && c1>b1)
            {
                temp = temp + c1;
                if(a1>b1)
                {
                    temp = temp + a1;
                    temp = temp/2;
                    arr3[i] = temp;
                }
                else
                {
                    temp = temp + b1;
                    temp = temp/2;
                    arr3[i] = temp;
                }
            }
            temp = 0;
        }
        return arr3;
    }
    static void print_arr(double[] arr2, int n)
    {
        for(int i=0;i<arr2.length;i++)
        {
            if(n == 1) System.out.print((int) arr2[i]+" ");
            else System.out.print(arr2[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>0)
        {
            double[][] arr = new double[n][3];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<3;j++)
                {
                    arr[i][j] = in.nextDouble();
                }
            }
            double[] result = average_marks(arr,n);
            print_arr(result, n);
        }
    }
}