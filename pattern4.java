import java.util.Scanner;
public class pattern4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = num; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
