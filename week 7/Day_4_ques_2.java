/* Ques:-Mr. Ultalal is very intelligent person and He has a habit to read every word in reverse order. One day he went to book store the buy a book But in book all the paragraphs / sentences were written in regular word. So help Mr. Ultalal to read a book using java code in reverse order. The code accepts a string and display the new string after reversing each character of the word in lower case. If the string contains number or string is null then display the massage “Invalid input”

Input Format

Enter the String :Lovely Professional University ylevol lanoisseforp ytisrevinu First line read the input as String

Constraints

numbers of word in string > 1 numbers of word in string > 1

Output Format

Display the string in reverse order in lowercase

Sample Input 0

Lovely Professional University
Sample Output 0

ylevol lanoisseforp ytisrevinu */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyClass {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        str = str.toLowerCase();
        boolean numFound = false;
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println("Invalid input");
                numFound = true;
                break;
            }
        }
        
        if(!numFound){
        
        Stack<Character> st = new Stack<>();
        int i=0;
        String ans = "";
        
        
        while(i<str.length()){
            char ch = str.charAt(i);
            
            if(ch == ' '){
                while(st.isEmpty() == false){
                    ans += st.pop();
                   // System.out.println(ans);
                }
                ans += ' ';
            }
            else{
                st.push(ch);
            }
        
           
            i++;
            
            //System.out.println(st);
        }
        while(st.isEmpty() == false){
                    ans += st.pop();
                   // System.out.println(ans);
                }
            System.out.println(ans);
        }
       
            
    }
}