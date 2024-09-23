/* WAP to print
        *
       **
      ***
     ****
 */
import java.util.Scanner;
public class pattern39 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = i; j < num; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}


