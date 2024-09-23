/* WAP to print -
*
    *
        *
            *
                *
 */
import java.util.Scanner;
public class pattern41 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = input.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i*4; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
