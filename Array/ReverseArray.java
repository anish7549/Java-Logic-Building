public class ReverseArray {
    public static void main(String[] args){
        int [] arr = {15,27,11,45,92,33};
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
