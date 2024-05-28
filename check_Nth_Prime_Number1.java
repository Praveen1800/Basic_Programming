package Practics_Basic_program;


// Java Program to Check nth Prime Number By User Input Value
import java.util.Scanner;
public class check_Nth_Prime_Number1 {
    public static void main(String[] args) {

        int number = 1, count = 1, i;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (count > a) {

            number = number + 1;
            for (i = 2; i < number; i++) {

                if (number % i == 0) {
                    break;
                }

            }

            if (i == number) {
                count = count + 1;
            }

            System.out.println(a + " th prime Number : " + number);


        }
    }
}
