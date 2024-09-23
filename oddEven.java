// WAP to check entered number is even or odd
import java.util.Scanner;
public class oddEven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if(num % 2 == 0)
        {
            System.out.print("Entered number is Even");
        }else{
            System.out.print("Entered number is Odd");
        }
    }
}
