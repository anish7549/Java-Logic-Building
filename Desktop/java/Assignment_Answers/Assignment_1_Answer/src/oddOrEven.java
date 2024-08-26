// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class oddOrEven {
    public static void main(String[] args){
        System.out.println("We are going to check given number is Even or Odd :");
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the Number: ");
       int num1 = input.nextInt();

       if(num1 % 2 == 0){
           System.out.println("This is a even number");
       }
       else{
           System.out.println("This is a Odd number");
       }

    }
}
