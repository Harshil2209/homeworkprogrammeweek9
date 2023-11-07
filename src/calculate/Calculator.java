package calculate;

public class Calculator {

    //Instance method for addition,Subtraction, division,multiplication

    public void addition(int a, int b){
        System.out.println("Addition of " + a + " and " + b + " is " + (a+b) );
    }

    public void subtraction(int a , int b){
        System.out.println("Subtraction of " + a + " and " + b + " is " + (a-b) );
    }

    public void division(int a, int b){
        System.out.println("Divison of " + a + " and " + b + " is " + (a/b));
    }

    public void multiplication(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a*b));
    }


    //creating instance method to calculate based on symbol

    public void calculateResult(int a , int b, char symbol){
        if (symbol == '+'){
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        }else {
            System.out.println("Invalid symbol!");
        }
    }


}
