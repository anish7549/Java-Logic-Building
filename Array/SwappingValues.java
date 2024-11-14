import java.util.Arrays;
import java.util.Scanner;
public class SwappingValues{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr ={1,3,5,45,75};
        swap(arr, 0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}