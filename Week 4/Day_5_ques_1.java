/*
Prof. Joe has asked his student Pappu Singh to implement a Java program which can calculate the average CA marks of all the subjects that Pappu is studying in this semester using 2-D Array/ Jagged Array.

There are N number of subjects and different subjects may have different number of Academic Tasks (each with maximum marks 10)

Prof. Joe is expecting that all the CA marks are stored in the array and average marks of any subject can be checked randomly.

Input Format

First line reads the number of subjects N Next N lines read the number of CAs in the subject and marks of the CAs separated by SPACE Last line reads the subject number for which the average marks to be displayed.

Constraints

N>0 Marks >= 0

Output Format

Prints the average marks in the subject

Sample Input 0

3
2 9.25 6.5
4 2.5 4.25 6.0 1.25
3 7.25 3.75 6.5
2
Sample Output 0

Average in Subject-2 is 3.5
*/

import java.util.Scanner;

public class SubjectMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSubjects = scanner.nextInt();

        double[][] marks = new double[numSubjects][];
        for (int i = 0; i < numSubjects; i++) {
            int numTasks = scanner.nextInt();

            marks[i] = new double[numTasks];
            for (int j = 0; j < numTasks; j++) {
                marks[i][j] = scanner.nextDouble();
            }
        }

        int subjectNum = scanner.nextInt();

        double sum = 0.0;
        int numTasks = marks[subjectNum-1].length;
        for (int i = 0; i < numTasks; i++) {
            sum += marks[subjectNum-1][i];
        }
        double avg = sum / numTasks;

        System.out.println("Average in Subject-" + subjectNum + " is " +avg);
    }
}