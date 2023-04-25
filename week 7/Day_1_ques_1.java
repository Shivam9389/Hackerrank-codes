/*
Dr. Max has conducted the academic task in his class with 5 Multiple Choice Questions each having 4 options A/B/C/D. He wanted to write a program which can evaluate the test papers of all the N students such that each correct answer is awarded 1 mark and for incorrect answer penalty is 0.25 marks.

The program must read the number of students N and the the answers of all the N students in the form of a String. If any question is not attempted by any student, then X should be given as input corresponding to that question e.g. ABAXD

It is expected that the marks of all the N students are displayed separated by SPACE.

Input Format

First Line of the input reads the String of CORRECT ANSWERS

Second Line of the input reads the number of students N

Next N lines read the answer Strings of the N students respectively.

Constraints

N > 0

Input characters can be either in Upper Case or Lower Case

Else "Incorrect Input"

Output Format

Print the marks of all the N students separated by SPACE

Sample Input 0

ACBDC
2
BCXDX
AXXDC
Sample Output 0

1.75 3.0
*/
import java.util.Scanner;

public class EvaluateTestPapers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the correct answers
        String correctAnswers = scanner.nextLine().toUpperCase();

        // Read the number of students
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Evaluate the test papers of all the N students
        for (int i = 0; i < n; i++) {
            String answers = scanner.nextLine().toUpperCase();
            if (answers.length() != correctAnswers.length()) {
                System.out.println("Incorrect Input");
                return;
            }

            double marks = 0;
            for (int j = 0; j < answers.length(); j++) {
                char answer = answers.charAt(j);
                if (answer == 'X') {
                    continue; // question not attempted, no marks added or deducted
                }
                char correctAnswer = correctAnswers.charAt(j);
                if (answer == correctAnswer) {
                    marks += 1;
                } else {
                    marks -= 0.25;
                }
            }
            System.out.print(marks + " ");
        }
    }
}
