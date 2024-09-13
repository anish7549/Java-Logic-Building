import java.util.Scanner;
public class switchCase {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
//        System.out.println("Enter one of these fruit name - Mango, Apple, Grapes, Orange");
//        String fruit = input.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet Red fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            case "Orange" -> System.out.println("Round Fruit");
//            case "Guava"  -> System.out.println("Rich source of multivitamins")
//            default -> System.out.println("Enter the valid fruit name: ");
//        }
        System.out.println("Enter the Day from 1 to 7");
        int day = input.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter the valid day");
        }
    }
}
