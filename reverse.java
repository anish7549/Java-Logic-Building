//public class reverse {
//    public static void main(String[] args){
//        int num = 58795;
//        int ans =  0;
//        while(num > 0){
//            int rem = num % 10;
//            num /= 10;
//            ans = ans * 10 + rem;
//        }
//        System.out.println(ans);
//    }
//}

import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int output = 0;
        while(number > 0){
            int remender = number % 10;
            number /= 10;
            output = output * 10 + remender;
        }
        System.out.println("Reversed number is - "+output);
    }
}