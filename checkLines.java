// WAP to check given two points are in a line or not
import java.util.Scanner;
public class checkLines {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 : ");
        int x1 = input.nextInt();
        System.out.print("Enter y1 : ");
        int y1 = input.nextInt();

        System.out.print("Enter x2 : ");
        int x2 = input.nextInt();
        System.out.print("Enter y2 : ");
        int y2 = input.nextInt();

        if(x1 == x2){
            System.out.print("The point lie on vertical line.");
        }
        else if(y1 == y2){
            System.out.print("The points lie on horizontal line.");
        }
        else{
            System.out.print("The points do not lies on the same vertical or horizontal line.");
        }
    }
}
