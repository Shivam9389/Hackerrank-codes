/*
Jeevan has been given a task by his Java professor Mrs. Shruti to create an enum of the subjects which he is studying in current semester. It is also instructed that there must be 2 attributes of each Subject i.e. Faculty Name and credits(int) of the subject. Details of the subjects are:

**Subject, Credits, Faculty Name **

Java, 4, Shruti OS, 3, Puneet Kumar AI, 2, James William Android, 3, Md. Adil Khan

Jethalal is supposed to write a main class in which the name of subject is taken as input and the faculty name and credits of that subject should be displayed using switch statement. If the input given is not matching with the listed subjects, display This subject is not running in this semester.

Input Format

First line of the input reads the subject name

Constraints

NA

Output Format

Prints the name of the Faculty and credits seperated by SPACE.

Prints This subject is not running in this semester. if input does not match with the subjects of enum.

Sample Input 0

Android
Sample Output 0

Md. Adil Khan 3
*/

import java.io.*;
import java.util.*;

public class p {
    enum Subject {
        Java,
        OS,
        AI,
        Android,
        Default;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Subject s;
        if (str.equals("Java") || str.equals("OS") || str.equals("AI") || str.equals("Android")) {
            s = Subject.valueOf(str);
        } else {
            str = "Default";
            s = Subject.valueOf(str);
        }

        switch (s) {
            case Java: {
                System.out.println("Shruti " + 4);
                break;
            }
            case OS: {
                System.out.println("Puneet Kumar " + 3);
                break;
            }
            case AI: {
                System.out.println("James William " + 2);
                break;
            }
            case Android: {
                System.out.println("Md. Adil Khan " + 3);
                break;
            }
            case Default: {
                System.out.println("This subject is not running in this semester.");
            }
        }

    }
}