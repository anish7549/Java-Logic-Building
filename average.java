// WAP to find the average of 5 subjects
import java.util.Scanner;
public class average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for subject 1 : ");
        double sub1 = input.nextDouble();
        System.out.print("Enter the marks for subject 2 : ");
        double sub2 = input.nextDouble();
        System.out.print("Enter the marks for subject 3 : ");
        double sub3 = input.nextDouble();
        System.out.print("Enter the marks for subject 4 : ");
        double sub4 = input.nextDouble();
        System.out.print("Enter the marks for subject 5 : ");
        double sub5 = input.nextDouble();

        double average = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        System.out.print("The average of marks are :"+average);
    }
}
