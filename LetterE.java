import java.util.Scanner;
public class LetterE {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(i == 0 || j == 0 || i == (num-1)/2 || i == num-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
