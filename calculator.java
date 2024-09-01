import java.util.Scanner;
public class calculator {
    private static int number1;
    private static int number11;
    private static double answer;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Take input from the user till user does not print X or x.
        double answer = 0;
        while(true){
            System.out.println("Enter one of the following operator: (+,-,*,/,%)");
            char operator = input.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.println("Enter two numbers:");
                double number11 = input.nextDouble();
                double number2 = input.nextDouble();

                if(operator == '+')
                {
                    answer = number11 + number2;
                }
                if(operator == '-')
                {
                    answer = number11 - number2;
                }
                if(operator ==  '*')
                {
                    answer = number11 * number2;
                }
                if(operator == '/'){
                    if(number2 != 0){
                        answer = number11 / number2;
                    }
                }
                if(operator == '%')
                {
                    answer = number11 % number2;
                }
                else if(operator == 'x' || operator == 'X')
                {
                    break;
                }
                else{
                    System.out.println("Invalid Operation!");
                }
                System.out.println(answer);
            }
        }
    }
}
