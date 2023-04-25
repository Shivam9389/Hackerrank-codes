/*
n some organization, January is the month of giving appraisal to employees, so HR department of that organization decided to give appraisal to only those employees whose employee id is more than 201. In that organization every employee is getting basic salary is 20,000INR and when employee id is greater than 201 then company decides to give appraisal of 1000INR to every employee. So as a programmer help that company to check who is eligible for getting incentive.

Input Format

In First Line, enter employee ID

In Second Line, enter employee name

In third Line, enter employee designation

Constraints

Check is on employee ID, and employee id must be of integer type.

Output Format

If employee id is greater than 201, only then salary is increased by 1000 INR and display name, employee id and increased salary of employee, if employee id is less than 201 then print “No Appraisal”

Sample Input 0

200
shruti
manager
Sample Output 0

No Appraisal
*/

import java.util.Scanner;

public class EmployeeAppraisal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employeeId = sc.nextInt();

        String employeeName = sc.next();

        String employeeDesignation = sc.next();

        int basicSalary = 20000;

        

        if (employeeId > 201) {

            basicSalary += 1000;

            System.out.println("Name: " + employeeName);

            System.out.println("Employee ID: " + employeeId);

            System.out.println("Increased Salary: " + basicSalary + " INR");

        } else {

            System.out.println("No Appraisal");

        }

        sc.close();

    }

}