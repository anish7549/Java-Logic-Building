import java.util.Scanner;
public class greetings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Good Name Please: ");
        String name = input.next();
        System.out.println("Hello "+name);
    }
}
