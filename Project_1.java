package Loop;

import java.util.Scanner;

public class Project_1 {
    public static void main(String[] args) {
        float Score_Student;
        String Grade;
        Scanner cin = new Scanner(System.in);
        System.out.println("********** Input ***********");
        System.out.print("Input Score Of Student=");
        Score_Student= cin.nextFloat();

        if (Score_Student>95 && Score_Student<=100){
            Grade = "A";
        } else if (Score_Student>90 && Score_Student<=95) {
            Grade = "B";
        } else if (Score_Student>80 && Score_Student<=90) {
            Grade = "C";
        } else if (Score_Student>65 && Score_Student<=80) {
            Grade = "D";
        } else if (Score_Student>50 && Score_Student<=65) {
            Grade = "E";
        }else {
            Grade = "F";
        }
        System.out.println("Grade= "+Grade);
    }
}
