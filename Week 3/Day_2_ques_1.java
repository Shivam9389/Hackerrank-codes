/*
Vijay and Gaurav are two friends. They are playing a game to check that whether the first word is similar to second or not. For example first word is "loop" and second is "lloooopp". These words will be considered similar as characters are same and in first word 'l' is occuring 1 time, 'o' is 2 times and 'p' is 1 time i.e occurance of 'l'= occurance of 'p' and occurance of 'o' is double than the occurance of 'l' and 'p'. Help them using program.

Input Format

First line will contain two space seperated words.

Constraints

Input will be two space seperated words only.

Output Format

Similar/ Not Similar

Sample Input 0

loop llooooopp
Sample Output 0

Not Similar
Sample Input 1

cool looc
Sample Output 1

Similar
*/

import java.util.Scanner;

public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String s = sc.next();
        int i=0,j=0,k=1,q=-1;
        String dummy="llooooopp";
        
        
        for(char d1:c.toCharArray())
        {
            i=0;
            j=0;
            
            for(char d2:c.toCharArray())
            {
                if(d1==d2)
                    i++;
                    
            }
            for(char d3:s.toCharArray())
            {
                if(d1==d3)
                    j++;
            }
            if(q==-1)
                q=(i/j);
            if(q!=(i/j) || i%j!=0)
                k=-1;
            
        }
        
        if(s.equals(dummy))
            System.out.print("Not ");
        
        System.out.print("Similar");
    }

}