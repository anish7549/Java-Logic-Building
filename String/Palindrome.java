
// WAP to check given String is Palindrome or not.
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter the String to check it is Palindrome or not: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2= "";
        for (int i=s1.length()-1; i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
        if (s2.equals(s1)){
            System.out.println("Entered string is Palindrome:");
        }
        else {
            System.out.println("Entered string is not Palindrome.");
        }
    }
}
