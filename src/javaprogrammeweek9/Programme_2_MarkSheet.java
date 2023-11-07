package javaprogrammeweek9;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Programme_2_MarkSheet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = input.nextLine();

        System.out.println("Enter roll number: ");
        int rollNo = input.nextInt();

        int mathMarks = -1;
        while (mathMarks < 0 || mathMarks > 100){
            System.out.println("Enter math marks (between 0-100)");
            mathMarks = input.nextInt();
            if (mathMarks < 0 || mathMarks > 100){
                System.out.println("Invalid input, Marks should be between  to 100");
            }
        }

        int scienceMarks = -1;
        while (scienceMarks < 0 || scienceMarks > 100){
            System.out.println("Enter science marks (between 0-100): ");
            scienceMarks = input.nextInt();
            if (scienceMarks < 0 || scienceMarks > 100){
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        }

        int englishMarks = -1;
        while (englishMarks < 0 || englishMarks > 100){
            System.out.println("Enter english marks (between 0-100");
            englishMarks = input.nextInt();
            if (englishMarks < 0 || englishMarks > 100){
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        }

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage =(double) totalMarks / 3;

        String result, grade;
        if (percentage >= 35){
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            }else {
                grade = "C";           }
        }else {
            result = "Fail";
            grade = "";
        }

        //print mark sheet

        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No: + rollNum +                 |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math: + mathsMarks +                    |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + "total"+ "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");

    }
}
