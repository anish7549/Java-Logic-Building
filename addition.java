// WAP to find the addition of two numbers.
import java.util.Scanner;
public class addition {
    public static void main(String[] args){
        System.out.print("This is addition program");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int addition = num1 + num2;
        System.out.println("Sum = "+addition);
    }
}
