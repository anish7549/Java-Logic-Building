// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class oddOrEven {
    public static void main(String[] args){
        System.out.println("Checking given number is Even or Odd: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }
    }
}
