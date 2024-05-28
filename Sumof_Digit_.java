package Practics_Basic_program;

// Write a program in Add the Sum of Digit  take User input ;
import java.util.Scanner;

public class Sumof_Digit_{
    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :  ");
        int a = sc.nextInt();

        while (a>0){

            int r = a%10;
            sum = sum + r;
            a = a/10;
        }
        System.out.println(sum);
    }
}
