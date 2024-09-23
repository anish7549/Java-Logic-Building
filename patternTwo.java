import java.util.Scanner;
public class patternTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int row = input.nextInt();
        System.out.print("Enter the column :");
        int column = input.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j =1; j<= column; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
