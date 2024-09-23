// WAP to print first n odd numbers
import java.util.Scanner;
public class nOddNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int number = input.nextInt();
        System.out.println("The first " + number + " odd numbers are :");
        for(int i = 1; i <= number; i++){
            if(i % 2 != 0){
                System.out.print(i+ " ");
                i++;
            }
        }
    }
}
