/*
Chacha Chaudhary has asked Sheena to find out the Nth occurence of any Word in the Paragraph. Sheena finds it a tedious task to find Nth occurence so she wants you to write a small java program which can solve her problem and she will give you a gift for helping her. Let us write a code.

Input Format

First line reads the paragraph contents

Second line reads the word to be found and N separated by Space

Constraints

N>0 Else "Incorrect Input"

Output Format

Prints the starting index of the Nth occurence of the word in the paragraph

Prints Not Present if not occuring even a single time and prints the last occurence if occuring less than N times.

Sample Input 0

Aana bought banana.
ana 1
Sample Output 0

1
Sample Input 1

Aana bought banana
baa 3
Sample Output 1

Not Present
*/

import java.util.Scanner;

public class WordOccurrence {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String paragraph = st.nextLine().toLowerCase();
        String word = st.next().toLowerCase();
        int n = st.nextInt();

        if (n <= 0) {
            System.out.println("Incorrect Input");
            return;
        }
        int count = 0;
        int index = -1;
        int lastOccurrenceIndex = -1;

        while (true) {
            index = paragraph.indexOf(word, index + 1);
            if (index == -1) {
                break; 
            }
            count++;
            if (count == n) {
                System.out.println(index);
                return;
            }
            lastOccurrenceIndex = index;
        }
        if (count == 0) {
            System.out.println("Not Present");
            return;
        }
        System.out.println(lastOccurrenceIndex);
    }
}