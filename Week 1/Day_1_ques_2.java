/*
John has got a Mathematical assignment where he has to find mean of a given set of 3 integers. Write a Java program solution to help John .

Input Format

First line will accept 3 positive intergers

Constraints

All positive integers must be > 1 And < 1000

Output Format

mean of 3 integer values

if the Result is an integer ,then write .0 For Examle result is 5 then ans will be 5.0

if the Result is an decimal value,then After point(.) only one digit required for example 6.3 ,2.7 etc

Sample Input 0

5 7 2
Sample Output 0

4.6
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=a+b+c;
        float e=d/3;
        DecimalFormat df_obj = new DecimalFormat("#.#");
        df_obj.setRoundingMode(RoundingMode.FLOOR);
        System.out.println(df_obj.format(e));
    }
}