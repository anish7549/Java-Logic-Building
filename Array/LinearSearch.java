import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        int [] arr= {12,21,15,40,45,85,65};
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to found from array:");
        int key = input.nextInt();
        for (int i=0; i<arr.length; i++){
            if(key == arr[i]){
                System.out.println("Key "+key+" found at index: "+i);
                flag = true;
                break;
            }
        }if (flag == false) {
            System.out.println("Key not found");
        }
    }
}
