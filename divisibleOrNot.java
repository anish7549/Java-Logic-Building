// WAP to find given number is divisible by 7 or not
import java.util.Scanner;
public class divisibleOrNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if(num % 7 == 0) {
            System.out.println("Yes it is divisible by 7");
        }else{
            System.out.println("NO it is not divisible by 7");
        }
    }
}
