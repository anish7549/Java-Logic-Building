// WAP to find the season for example when we enter 5 it must be print summer
import java.util.Scanner;
public class seasonFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1 to 12): ");
        int month = input.nextInt();
        String season;
        switch(month){
            case 1: case 11: case 12:
                season = "WINTER";
                System.out.print(season); // need to ask
                break;
            case 2: case 3: case 4:
                season = "SPRING";
                System.out.print(season);
                break;
            case 5: case 6: case 7:
                season = "SUMMER";
                System.out.print(season);
                break;
            case 8: case 9: case 10:
                season = "RAINING";
                System.out.print(season);
                break;
            default:
                System.out.print("Oh! INVALID Month : Please enter the month form 1 to 12");
        }
    }
}
