/*
Write a program to print the names of students by creating a Student class. If instead of name some other data type is passed then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.

Input Format

Rahul 33

Constraints

Use constructor with argument to initialize the name Create an object with name to print the name of the student Pass Two inputs such as one is name and the other with different data type

Output Format

Rahul Unknown

Sample Input 0

Rahul
33
Sample Output 0

Rahul
Unknown
Sample Input 1

Rahul
&
Sample Output 1

Rahul
Unknown
*/

class Student {
String name;

public Student(Object name) {
if (name instanceof String) {
this.name = (String) name;
} else {
this.name = "Unknown";
}
}

public void printName() {
System.out.println(this.name);
}
}

public class Main {
public static void main(String[] args) {
Student student1 = new Student("Rahul");
student1.printName();

Student student2 = new Student(33);
student2.printName();


}
}