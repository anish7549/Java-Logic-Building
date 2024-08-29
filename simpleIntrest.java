/* Write a program to input principal, time, and rate (P, T, R)
    from the user and find Simple Interest. */
import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Ammount: ");
        int principal_Ammount = input.nextInt();
        System.out.print("Enter Rate of Intrest: ");
        int rate_Of_Intrest = input.nextInt();
        System.out.print("Enter the Time In Years: ");
        int time = input.nextInt();

        int simple_intrest = ((principal_Ammount * rate_Of_Intrest * time)/100);
        System.out.print("Simple intrest is = "+simple_intrest);



    }
}
