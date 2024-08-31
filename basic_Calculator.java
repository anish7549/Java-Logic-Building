
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class basic_Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the operator (+,-,*,/)");
        char operator = input.next().charAt(0);
        double result = 0;

        if(operator == '+')
        {
            result = num1 + num2;
        } else if(operator == '-')
        {
            result = num1 - num2;
        } else if(operator == '*')
        {
            result = num1*num2;
        } else if(operator == '/')
        {
            if(num2 != 0)
            {
                result = num1 / num2;
            } else
            {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else
        {
            System.out.println("Error: Invalid operator.");
        }
        System.out.println("Here is the answer: "+result);
    }
}