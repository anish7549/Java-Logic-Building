// WAP to swap two numbers using third variable
import java.util.Scanner;
public class basicSwap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to swap : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int tamp = num1;
        num1 = num2;
        num2 = tamp;
        System.out.print("Swapped number is : "+num1 +num2);
    }
}
