package Loop;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Project_5 {
    public static void main(String[] args) {
        String Name;
        String input;
        Scanner cin=new Scanner(System.in);
        System.out.print("Input Your Name=");
        Name =cin.nextLine();
        System.out.print("Input Your Date Of Birth In YYYY-MM-DD Format=");
        input=cin.nextLine();
        cin.close();
        LocalDate dob = LocalDate.parse(input);

        System.out.println("**********************************************************");
        System.out.println("Hello and Welcome to "+Name+" You are "+calculateAge(dob)+" year old.");
    }
        public static int calculateAge(LocalDate dob){
            LocalDate curDate = LocalDate.now();
            if (dob != null)
            {
                return Period.between(dob, curDate).getYears();
            }
            else {
                return 0;
            }
        }
}
