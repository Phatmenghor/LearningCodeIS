package Loop;

import java.util.Scanner;

public class Project_6 {
    public static void main(String[] args) {
        String line;
        StringBuilder upper_case_line= new StringBuilder();
        String work;
        Scanner cin=new Scanner(System.in);
        System.out.print("Input Your Sentence=");
        line=cin.nextLine();
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext())
        {
            work = lineScan.next();
            upper_case_line.append(Character.toUpperCase(work.charAt(0))).append(work.substring(1)).append(" ");

        }
        System.out.println(upper_case_line.toString().trim());
    }
}
