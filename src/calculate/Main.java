package calculate;

import java.util.Scanner;

public class Main {

    //create main method
    public static void main(String[] args) {
        char choice = 'Y';

        // create while loop
        while(choice == 'Y'){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter second number");
            int b = input.nextInt();
            System.out.println("Please enter one of the folliwing symbols +,-,/,* ");
            char symbol = input.next().charAt(0);

            Calculator calculator = new Calculator();
           calculator.calculateResult(a, b, symbol);

            System.out.println("Whould do like to do more calculations? Enter 'Y' for Yes and 'N' for No: ");
            choice=input.next().charAt(0);

        }
    }
}
