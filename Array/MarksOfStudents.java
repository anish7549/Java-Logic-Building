import java.util.Scanner;
public class MarksOfStudents {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total numbers of students: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the marks of the students: "+i);
            arr[i] = input.nextInt();
        }
        System.out.print("The marks of five students as follows: ");{
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
