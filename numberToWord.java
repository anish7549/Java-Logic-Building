// WAP to enter a number and corresponding english word
// Example when we enter 5 it must print FIVE.
import java.util.Scanner;
public class numberToWord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (0 - 9) : ");
        int number = input.nextInt();
        String word;
        switch (number) {
            case 0 -> word = "ZERO";
            case 1 -> word = "ONE";
            case 2 -> word = "TWO";
            case 3 -> word = "THREE";
            case 4 -> word = "FOUR";
            case 5 -> word = "FIVE";
            case 6 -> word = "SIX";
            case 7 -> word = "SEVEN";
            case 8 -> word = "EIGHT";
            case 9 -> word = "NINE";
            default -> word = "INVALID NUMBER";
        }
        System.out.println(number + " " + word);
    }
}
