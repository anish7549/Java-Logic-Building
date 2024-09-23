/* WAP to print -
******
*    *
*    *
******
 */
import java.util.Scanner;
public class pattern40 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int row = input.nextInt();
        System.out.print("Enter the columns :");
        int col = input.nextInt();
        for (int i=1; i<= row; i++){
            for(int j=1; j<= col; j++){
                if(i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
