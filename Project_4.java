package Loop;

import java.util.Objects;
import java.util.Scanner;

public class Project_4 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a,b;
        double result = 0;
        String ss;
        System.out.print("Input Number Of Input1=");
        a = cin.nextInt();
        System.out.print("Input Number Of Input2=");
        b = cin.nextInt();
        System.out.print("Input ss=");
        ss=cin.next();
        if(Objects.equals(ss, "+"))
        {
            result = a+b;
        } else if (ss.equals("-")) {
            result = a-b;
        } else if (ss.equals("*")) {
            result = a*b;
        } else if (ss.equals("/")) {
            result = a/b;
        } else if (ss.equals("%")) {
            result = a%b;
        }
        System.out.println("Result = "+result);
    }
}
