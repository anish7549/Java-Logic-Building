// WAP to find the sum of divisible by three numbers
import java.util.Scanner;
public class sumDivisibleByThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 0;i <= num; i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        System.out.println("Sum of numbers divisible by 3 up to " +num+ " is : "+sum);
    }
}
