// WAP to convert ℉ into ℃.
import java.util.Scanner;
public class temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in celsius is: "+celsius);
    }
}
