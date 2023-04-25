/*
Richa and her daughter Ahaana are playing a game. Richa is going to tell one number and Ahaana need to tell the prime factors of the number. Help Ahaana by completing the code to find prime factor of the number. Write a method which calculate prime factors and print and call the method in main.

Input Format

An integer value

Constraints

N will lie between 10-50 else "Invalid"

Output Format

All the prime factors will be printed exactly once with space in increasing order.

Sample Input 0

8
Sample Output 0

Invalid
Sample Input 1

30
Sample Output 1

2 3 5
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int a=sc.nextInt();
        int x = 2;
        if(a>=10 && a<=50){
            for(int i=2;i<=a;i++){
                if(a%i == 0){
                    x = i;
                    break;
                }
            }
            while(a != 1){
            while(a%x == 0){
                al.add(x);
                a/=x;
                
            }
                x++;
            }
            for(int r : al){
                System.out.print(r+" ");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}