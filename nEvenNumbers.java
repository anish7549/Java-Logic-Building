// WAP to print first n even numbers
import java.util.Scanner;
public class nEvenNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("The first " +number+ " even numbers are: ");
        for(int i = 0; i <= number; i++){
            if(number % 2 == 0){
                System.out.print(i+ " ");
                i++;
            }
        }
    }
}
