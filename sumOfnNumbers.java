// WAP to print sum of n numbers
import java.util.Scanner;
public class sumOfnNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = (num*(num+1))/2;
        System.out.println("Sum of n numbers is: "+sum);
    }
}
