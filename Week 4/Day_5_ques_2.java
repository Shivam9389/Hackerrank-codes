/*
Jasmine and jack created 2 different arrays to store their products which they have purchased from super market. Then they compared their products to identify the count of similar products they have purchased

Input Format

Milk Toy Chair Stool Stool Bag Watch Milk

Constraints

Create two different String array of size 4 Compare and display the result in integers

Output Format

2

Sample Input 0

Milk Toy Chair Stool
Stool Bag Watch Milk
Sample Output 0

2
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a1=input.nextLine();
        String a2=input.nextLine();
        int count=0,i,j;
        String st[] = a1.split(" ");
        String st1[] = a2.split(" ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
            if(st[i].equals(st1[j]))
            {           
                count++;
            }          
            }
        }
        System.out.println(count);
    }
}
