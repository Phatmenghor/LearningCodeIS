package Loop;

import java.util.Scanner;

public class Project_2 {
    public static void main(String[] args) {
        float Area,Perimeter,A,B;
        Scanner cin=new Scanner(System.in);
        System.out.println("************** Please Input **************");
        System.out.print("Input Length of Rectangle = ");

        A = cin.nextFloat();
        System.out.print("Input Width of Rectangle = ");
        B = cin.nextFloat();

        System.out.println("**************** Output ******************");

        Area = A * B;
        System.out.println("The area of rectangle = "+Area);
        Perimeter = (A+B)*2;
        System.out.println("The Perimeter of rectangle = "+Perimeter);
        System.out.println("************ Thank For Run my Code ***********");
    }
}
