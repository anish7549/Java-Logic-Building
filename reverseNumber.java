//  WAP to reverse a number
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int reversed =0;
        int num = input.nextInt();
        while(num !=0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("Reversed number is: "+reversed);
    }
}
