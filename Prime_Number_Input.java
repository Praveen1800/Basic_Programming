package Practics_Basic_program;

// Write a program in Check prime Number take User input :
import java.util.Scanner;
public class Prime_Number_Input{
    public static void main(String[] args){

        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            if(a%i==0)
            {
                count++;
            }

        }

        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Non prime number");
        }


    }

    }
