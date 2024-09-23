// WAP to check character is vowel or not
import java.util.Scanner;
public class checkChar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Othe character: ");
        char ch = input.next().charAt(0);
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||
                ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
            System.out.println("Yes Given character is Vowel");
        }else{
            System.out.println("No given character is not a vowel");
        }
    }
}
