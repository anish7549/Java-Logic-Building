// WAP to find area of triangle
import java.util.Scanner;
public class areaOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle : ");
        double base = input.nextDouble();
        System.out.print("Enter the height : ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of triangle is :"+area);
    }
}
