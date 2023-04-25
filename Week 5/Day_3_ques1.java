/*
Create a class Student with attributes name(String) and registrationNo(int) and a method show to display the attributes of the Student. Write a menu driven program with 2 choices to take the input of the student attributes and display the attributes.

Input Format

Your program should take the 2 choice as input. • If the first input will be 1 then also ask to user to enter the details of the student. If the entered registrationNo is negative, do not accept the input and prompt again to take new input until user will not entered the positive registrationNo. • If the first input will be 2 then display the default values of Student attributes separated by comma in the same line. • If the first input will be any other int value, display the message “Wrong Choice”.

Constraints

Student registrationNo should be positive value(excluding 0).

Output Format

Your program should display the attributes of Student or the message “Wrong Choice” as the User choice at the runtime.

Sample Input 0

1
John
10
Sample Output 0

John,10
Sample Input 1

2
Sample Output 1

null,0
*/

import java.util.Scanner;

class Student {

    private String name;

    private int registrationNo;

    public Student() {

        name = null;

        registrationNo = 0;

    }

    public void show() {

        System.out.println(name + "," + registrationNo);

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setRegistrationNo(int registrationNo) {

        this.registrationNo = registrationNo;

    }

}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1) {

            Student s = new Student();

            String name = sc.next();

            int regNo = sc.nextInt();

            while (regNo < 1) {

                System.out.println("Invalid registration number, please enter a positive value");

                regNo = sc.nextInt();

            }

            s.setName(name);

            s.setRegistrationNo(regNo);

            s.show();

        } else if (choice == 2) {

            Student s = new Student();

            s.show();

        } else {

            System.out.println("Wrong Choice");

        }

        sc.close();

    }

}