/*
Consider that in a plantation activity, the municipality is planting trees in an order such that the smallest tree is planted first and the biggest at the end. While arranging the trees, before planting, to position them at their positions, they are swapped in such a way that a tree can only be swapped with its adjacent trees. wAP to implemennt the same using method which contain the logic of sorting. Consider 10 trees height as input.

Input Format

71 70 69 68 65 71 68 61 63

Constraints

Consider that there are 10 are present in the activity and their lenghts are in integer numbers (between 60 inches to 72 inches).

Output Format

61 63 65 68 68 69 70 71 71

Sample Input 0

71 71 70 69 68 65 78 88 61 63
Sample Output 0

61 63 65 68 69 70 71 71 78 88
*/

import java.util.Scanner;

public class TreeSorting {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] trees = new int[10];

// Input the heights of trees
for (int i = 0; i < 10; i++) {
trees[i] = scanner.nextInt();
}

// Sort the trees using bubble sort algorithm
for (int i = 0; i < 9; i++) {
boolean swapped = false;
for (int j = 0; j < 9 - i; j++) {
if (trees[j] > trees[j + 1]) {
// Swap the adjacent trees
int temp = trees[j];
trees[j] = trees[j + 1];
trees[j + 1] = temp;
swapped = true;
}
}
// If no swaps were made, the array is already sorted
if (!swapped) {
break;
}
}

// Print the sorted trees
for (int i = 0; i < 10; i++) {
System.out.print(trees[i] + " ");
}
}
}