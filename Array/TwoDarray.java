import java.util.Scanner;
public class TwoDarray {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int [][] arr = new int[3][4];
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.println("Enter the marks of the class"+i +" Student "+j);
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The marks of the student is: ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
