// WAP to find the sum of n odd numbers
import java.util.Scanner;
public class sumOfnOddNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
            int sum = num*num;
            System.out.print("Sum of "+num+ " odd numbers is: " +sum);
    }
}