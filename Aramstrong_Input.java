package Practics_Basic_program;

// Write a program Factorial1 number in java take input;
/* input  153 --> (1*1*1 + 5*5*5 + 3*3*3  = 153 ) */

import java.util.Scanner;

public class   Aramstrong_Input{
    public static void main(String[] args){

           int i,c,s=0, r;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Number : ");
        int a = sc.nextInt();

        c=a;

        while (a>0){

            r = a%10;
            s=(r*r*r)+s;
            a = a/10;
        }
        if(c==s){
            System.out.println("Aramstrong Number : ");
        }
        else{
            System.out.println("Aramstrong Number : ");
        }

    }
}
