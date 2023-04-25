/*
Karan has been given a task by Head of Librarian to implement the enumeration of the Library working Day and timing. Which have the 3 attributes i.e. day and open timing and close timing of the library working hours. Details of the working hours are:

Day, open Timing, closed timing

Monday, 8.30, 5.30 Tuesday, 8.30, 5.30 . . Friday, 8.30, 5.30 Saturdays, 9.30, 4.30

Karan is supposed to write a main class in which the name of working days of library is taken as input as a day and timing of library should be displayed using switch statement. If the input given is not matching with the listed day, display Library is closed

Input Format

First line of the input reads the day

Constraints

NA

Output Format

if working day than Prints the open time and closed seperated by SPACE. else Prints Library is closed

Sample Input 0

Monday
Sample Output 0

8:30 5:30
*/

import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Sol {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String day = s.nextLine();

        s.close();

        String openTime, closeTime;

        

        switch(day) {

            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":

                openTime = "8:30";

                closeTime = "5:30";

                break;

            case "Saturday":

                openTime = "9:30";

                closeTime = "4:30";

                break;

            default:

                System.out.println("Library is closed");

                return;

        }

        

        System.out.println(openTime + " " + closeTime);

    }

}