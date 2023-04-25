/*
Alice got task from his manager to maintain 2 decks of n numbers. As he easily put n numbers in one deck but for second deck he is bit confused so help him by creating one application in which once the n numbers are entered by bob, then parallely application will copy the content in second deck also.

Input Format

First line will contain size In second line , enter the number as per according to size in first deck.

Constraints

Only integer values considered

Output Format

In first line , it will display the contants in actual deck. In second line , display same contents in second deck.

Sample Input 0

3
1 2 3
Sample Output 0

1 2 3
1 2 3
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        int n=kl.nextInt();
        int arrd1[]= new int[n];
        int arrd2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arrd1[i]=kl.nextInt();
            System.out.print(arrd1[i]+" ");
        }
         System.out.println();
        for(int i=0;i<n;i++)
        {
            arrd2[i]=arrd1[i];
            System.out.print(arrd2[i]+" ");
        }
        
    }
}