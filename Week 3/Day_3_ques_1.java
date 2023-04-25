/*
Sameer wants to develop a program for ATM. Help him by constructing the program for the same. In the program if user withdraws amount upto 1000 then machine will dispence Rs. 100 notes only. Minimum number of notes should be dispenced by the machine. Notes of denomination of 100,200,500 and 2000 are available in machine.

Input Format

One integer value between 100-20000.

Constraints

Maximum withdrawl amount should be 20000, Minimum should be 100 and amount should be in the multiple of 100 only.

Output Format

Print the number of notes dispenced and their denomination.

Sample Input 0

1100
Sample Output 0

1 100 Notes
2 500 Notes
Sample Input 1

1550
Sample Output 1

Invalid Input
*/
import java.util.*;
public class dsa{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        String tw = "2000 Notes";
        String fi = "500 Notes";
        String on = "100 Notes";
        String[] arr = new String[3];
        if(n>0&&n<20000){
            int two =0;
            int five=0;
            int one=0;
            int twoh=0;
            int note =0;
            if(n%100==0){
                note =(int)n/2000;
                if(note>0){
                    two =note;
                }
                n=n-note*2000;
                note=(int)n/500;
                if(note>0){
                    five=note;
                }
                n=n-500*note;
                note=(int)n/200;
                if(note>0){
                    twoh=note;
                }
                n=n-200*note;
                note=(int)n/100;
                if(note>0){
                    one=note;
                }
                if(one>=1){
                    System.out.println(one+" "+on);
                }
                if(twoh>=1){
                    System.out.println(twoh+" 200 Notes");
                }
                if(five>=1){
                    System.out.println(five+" "+fi);
                }
                if(two>=1){
                    System.out.println(two+" "+tw);
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    }
