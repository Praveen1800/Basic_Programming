package Practics_Basic_program;

// Java Program to Check nth Prime Number By User Input Value
import java.util.Scanner;
public class check_Nth_Prime_Number {
    public static void main(String[] args) {

        int count = 0, number = 1, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int a = sc.nextInt();

        while (count < a) {
            number = number + 1;
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    break;
                }
            }
                if (i == number) {
                    //incrementing count value
                    count = count + 1;
                }
            }
            //prints the nth prime number
            System.out.println(a + "th prime numberb : " + number);
        }
    }
