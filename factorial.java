// WAP to find the factorial
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        int n, factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 1; i<=num; i++){
            factorial = factorial*i;
            System.out.println("Factorial of "+num+ " is "+factorial);
        }
    }
}
