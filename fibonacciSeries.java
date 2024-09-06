 /* To calculate Fibonacci Series up to n numbers.
 (In fibonacci series, next number is the sum of previous two numbers
  for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
   The first two numbers of fibonacci series are 0 and 1.) */


import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms the fibonacci series: ");
        int n = input.nextInt();

       int firstTerm = 0;
       int secondTerm = 1;
       System.out.print("Fibonacci series: ");
       for(int i = 1; i<= n; i++){
           System.out.print(firstTerm+ " ");

           int nextTerm = firstTerm + secondTerm;
           firstTerm = secondTerm;
           secondTerm = nextTerm;
       }
    }
}

// using this method we can directly find the exact fibonacci series number.

//import java.util.Scanner;
//public class fibonacciSeries{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        int number1 = 0;
//        int number2 = 1;
//
//        int count = 2;
//
//        while(count <= number){
//            int temp = number2;
//            number2 = number2 + number1;
//            number1 = temp;
//            count++;
//        }
//        System.out.println(number2);
//    }
//}










