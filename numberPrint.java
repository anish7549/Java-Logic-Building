// WAP to print first n numbers
import java.util.Scanner;
public class numberPrint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.println("The first "+ number + " numbers are: ");
        for(int i = 1; i <= number; i++){
            System.out.print(i + " ");
        }
    }
}
