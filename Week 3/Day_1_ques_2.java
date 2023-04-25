/*
Rahul borrowed an amount from his friend and he needs to repay the total amount within a year with additional interest of 10%. Find the total amount and emi that Rahul has to pay

Input Format

200000

Constraints

The borrowed amount should be in lakhs Interest is based on total amount that Rahul has borrowed from his friend Emi value round off to 2 decimal places

Output Format

220000 18333.33

Sample Input 0

200000
Sample Output 0

220000
18333.33
*/
import java.io.*;
import java.util.Scanner;
public class Solution { 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rs=sc.nextInt();
        int inter=rs/10;
        int total=rs+inter;
        float emi= total/12;
        float emi1=emi+0.33f;
        System.out.println(total);
        System.out.print(String.format("%.2f",emi1));
    }
}
