package Practics_Basic_program;

// Write a program in palidrom Number in java take input
/* Right to left ya left to right  number same hona chaiye
*  ex -> 121 ---> 121      */
import java.util.Scanner;

public class Palidrom_Input{
    public static void main(String[] args) {

        int c,r,s=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :  ");
        int a = sc.nextInt();

        c=a;
        while (a>0){

            r = a%10;
            s = (s*10)+r;
            a = a/10;
        }
        if(c==s){
            System.out.println("palidrom");
        }
        else {
            System.out.println(" Not palidrom");
        }
    }
}
