package Loop;

import java.util.Scanner;

public class Project_3 {
    public static void main(String[] args) {
        float x,y,Number;

        Scanner cin=new Scanner(System.in);
        System.out.print("Input X=");
        x=cin.nextFloat();
        System.out.print("Input Y=");
        y= cin.nextFloat();

        System.out.println("Number="+"("+x+","+y+")");
        if(x == 30 || y == 30 || (x + y == 30))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
