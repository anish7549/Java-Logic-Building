import java.util.Scanner;

public class ThreeDarray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[][][] arr = new int[2][2][3];

        // Inputting the data
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the marks of college " + i + " class " + j + " student " + k);
                    arr[i][j][k] = input.nextInt();
                }
            }
        }

        // Displaying the data
        System.out.println("The marks of the students are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();  // For better formatting, print a new line after each class's students.
            }
            System.out.println();  // Print a new line after each college's classes.
        }
    }
}
