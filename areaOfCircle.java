// WAP to find area of circle
import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double radius  = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of circle is : "+area);
    }
}
