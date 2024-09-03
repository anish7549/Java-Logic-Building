// Input currency in rupees and output in USD.

import java.util.Scanner;
public class currencyConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter INR-Rupees: ");
        float rupess = sc.nextLong();
        float dollars = rupess / 83.89f;
        System.out.println("Currency in USD is: $"+dollars);
    }
}
