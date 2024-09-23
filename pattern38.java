/* WAP to print
*
* *
* * *
* * * *
 */
import java.util.Scanner;
public class pattern38 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = input.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
