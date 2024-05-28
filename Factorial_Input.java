package Practics_Basic_program;

// Write a Program in Factorial in take input ;
import java.util.Scanner;
public class Factorial_Input{
    public static void main(String[] args){

        int Fact = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){

            Fact = Fact*i;
        }

        System.out.println(Fact);

        // without take input
       /* int Fact = 1;

        for(int i=1; i<=10; i++){
            Fact = Fact*i;
        }
        System.out.println( Fact );*/
    }
}
