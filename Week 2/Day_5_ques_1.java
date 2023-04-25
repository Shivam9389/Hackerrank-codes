/*
Liz built up a software code taking number of 3 different color blocks as input. Considering the end users can enter floating point numbers too as at least 1 block of a color is broken. Design the code converting the not-full numbers to full numbers.

Input Format

Number of balls for three different colors.

Constraints

3 inputs separated with space can be floating points or integers.

Output Format

3 integer numbers

Sample Input 0

2.2 2 2
Sample Output 0

3 2 2
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double g = scan.nextDouble();
        double b = scan.nextDouble();
        int rInt = (int) Math.ceil(r);
        int gInt = (int) Math.ceil(g);
        int bInt = (int) Math.ceil(b);
        System.out.println(rInt + " " + gInt + " " + bInt);
    }
}-