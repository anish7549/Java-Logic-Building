import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Define an array with some pre-defined elements
        int[] arr = {12, 21, 15, 40, 45, 85, 65};  
        
        // Initialize a flag to track if the key is found or not
        boolean flag = false;
        
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be found in the array:");
        
        // Take the number to search for as input from the user
        int key = input.nextInt();
        
        // Loop through the array to find the key
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the key
            if (key == arr[i]) {
                // If key is found, print the index and set flag to true
                System.out.println("Key " + key + " found at index: " + i);
                flag = true;
                break;  // Exit the loop once the key is found
            }
        }
        
        // If flag is still false, it means key was not found in the array
        if (!flag) {
            System.out.println("Key not found");
        }
    }
}
