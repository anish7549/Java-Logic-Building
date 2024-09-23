// WAP to swap two numbers without using a third variable
import java.util.Scanner;
public class swapNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.print("After swapping number is: " +num1 + "and "+num2);

    }
}
