package Practics_Basic_program;

// Write a program in radius of circle Area_Diameter_Circumference of circle
import java.util.Scanner;
public class Area_Diameter_Circumference_circle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double radius,diameter,Circumference,area;

        System.out.println("Enter the radius of circle :  ");
         radius = sc.nextInt();

         diameter = 2*radius;
         Circumference = 2*3.14*radius;
         area = 3.14*(radius*radius);

        System.out.println( diameter );
        System.out.println(Circumference);
        System.out.println(area);

    }
}
