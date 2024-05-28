package Practics_Basic_program;

 // Write a program in java Third_Angle_of_Tringle
import java.util.Scanner;
public class Third_Angle_of_Tringle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st Angle of Tringle : ");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd Angle of Tringle : ");
        int b = sc.nextInt();

        int c = 180 -(a+b);

        System.out.println("3rd Angle of Tringle :"+c);

    }
}
