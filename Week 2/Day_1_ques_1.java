/*Prof. Decosta has designed multiple sets of the question paper of CSE310: Programming in Java subject. He has assigned a separate character code (A-Z) to each set of question paper but mentioned the paper codes using binary numbers. He needs a program which can accept the binary paper code and convert it in to character code so that he can easily identify the paper code during evaluation. If the paper code entered is not having 8 bits (0 or 1) or does not corresponds to A-Z then INVALID PAPER CODE must be printed.

Input Format

First line of input is a Binary Number representing the Paper Code

Constraints

Paper code is a 8 bit binary code

Output Format

Print the Paper Code (Character) and INVALID PAPER CODE if the input is not correct.

Sample Input 0

1000101
Sample Output 0

E
Explanation 0

1000101 represents 69 which corresponds to 'E'.

Sample Input 1

1111000
Sample Output 1

INVALID PAPER CODE
Explanation 1

1111000 is having inly 7 bits
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int code;
        Scanner input=new Scanner(System.in);
        code=input.nextInt();
        int sum=0;
        int n=0;
        while(code>0){
            int temp=code%10;
            sum+= temp*Math.pow(2, n);
            code=code/10;
            n++;
        }
        if(sum>=65 && sum<=90){
            System.out.println((char)sum);
        }
        else{
            System.out.println("INVALID PAPER CODE");
        }
        
    }
}