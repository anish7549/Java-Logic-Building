public class FindGreatestNumber {
    public static void main(String[] args){
        int [] numbers= {45,12,36,52,49};
        int max = numbers[0];
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("The greatest number in the array is "+max);
    }
}
