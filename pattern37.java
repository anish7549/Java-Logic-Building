/* WAP to print
12345
12345
12345
 */
import java.util.Scanner;
public class pattern37 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = input.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j<=row; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
