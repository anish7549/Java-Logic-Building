// WAP to print sum of n even numbers
import java.util.Scanner;
public class sumOfnEvennumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int sum = num * (num+1);
        System.out.println("Sum of "+num+ " even numbers is: "+sum);
    }
}