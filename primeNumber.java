// WAP to check given number is prime or not
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        if(isPrime(number)){
            System.out.print(number + " is a prime number.");
        }else {
            System.out.print(number + " is not a prime number.");
        }
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int i = 2;
        while(i <= num / 2){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
