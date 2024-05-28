package Practics_Basic_program;

// Write a Program in java Print the Perfect Number :
import java.util.Scanner;

public class Perfect_Input{
    public static void main(String[] args){

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int a = sc.nextInt();

        for(int i=1; i<a; i++){

            if(a%i == 0){

                sum = sum + i;
            }
        }

        if(a==0){
            System.out.println("Perfect Number : ");
        }
        else {
            System.out.println("Not Perfect : ");
        }
    }
}
