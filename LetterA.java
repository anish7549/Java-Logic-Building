import java.util.Scanner;
public class LetterA {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if (j == 0 && i != 0 || i == 0 && j != 0 && j < (num-1)/2 || i == (num-1)/2 && j<(num -1)/2 || j==(num-1)/2 && i!=0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
