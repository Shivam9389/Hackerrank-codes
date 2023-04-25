/*
Rahul borrowed an amount from his friend and he needs to repay the total amount within a year with additional interest of 10%. Find the total amount and emi that Rahul has to pay.

Input Format

Input Value

Constraints

The borrowed amount should be in lakhs Interest is based on total amount that Rahul has borrowed from his friend Emi value round off to 2 decimal places

Output Format

Total Amount and EMI in teo seperate lines

Sample Input 0

200000
Sample Output 0

220000
18333.33
*/

import java.text.DecimalFormat;
import java.util.*;

public class Solution {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double borrowedAmount = sc.nextDouble();
 double interestRate = 0.10;
 double totalAmount = borrowedAmount * (1 + interestRate);
 double emi = totalAmount / 12;

 DecimalFormat decimalFormat = new DecimalFormat("#.##");

 System.out.println(decimalFormat.format(totalAmount));
 System.out.println(decimalFormat.format(emi));
 }
}