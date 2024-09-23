/* WAP to print -
*
*
*
*
*
 */
import java.util.Scanner;
public class pattern1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of columns you want to print: ");
        int col = input.nextInt();
        for(int i = 1; i<=col; i++){
            System.out.println("*");
        }
    }
}
