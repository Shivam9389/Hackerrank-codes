/*
Peter has been given an assignment to implement the code to convert the temprature from FORENHITE to CELCIUS and vice versa. Kindly help him to implement the code such that user can choose the conversion type

FORENHITE to CELCIUS CELCIUS to FORENHITE and then enter the value of temperature to be converted and display the temptrature in the appropriate format.

If user enters the choice any thing else then print INVALID CHOICE

Input Format

First line will take the choice N (integer) as input i.e. 1 or 2 Second line will take the temperature (double) T as input

Constraints

N >0 and N < 3

Output Format

Prints the double value i.e. the temperature

Sample Input 0

1
40.0
Sample Output 0

4.44
Sample Input 1

2
15.5
Sample Output 1

59.9
*/

import java.io.*;
import java.util.*;

public class tempconverter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double fahrenhiet,celsius;
        
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        switch (temp)
        {
             case 1:
            fahrenhiet = sc.nextDouble();
            celsius=((fahrenhiet-32)*5/9);
            System.out.printf("%.2f" , celsius);
            break;
            
            case 2:
            celsius = sc.nextDouble();
            fahrenhiet = ((celsius*9/5)+32);
            System.out.println(fahrenhiet);
           
        } 
    }
}