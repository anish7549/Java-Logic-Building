import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Initialize a sorted array of integers to perform binary search on
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Prompt user to enter a number to search for in the array
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);

        // Store the user's input in the variable 'key'
        int key = input.nextInt();

        // Initialize variables for the low and high bounds of the search
        int low = 0;
        int high = arr.length - 1;

        // Start the binary search loop; it will run as long as the search range is valid (low <= high)
        while (low <= high) {
            // Calculate the mid index (mid-point of the current search range)
            int mid = low + high / 2;

            // Check if the key matches the element at the mid index
            if (key == arr[mid]) {
                // If a match is found, print the result and exit the loop
                System.out.println("Key " + key + " found at index " + mid);
                break;
            }
            // If the key is smaller than the middle element, search the left half
            else if (key < arr[mid]) {
                high = mid - 1;  // Narrow the search to the left side by adjusting 'high'
            }
            // If the key is greater than the middle element, search the right half
            else if (key > arr[mid]) {
                low = mid + 1;   // Narrow the search to the right side by adjusting 'low'
            }
        }
        // If the key is not found in the array, no output is printed in this version of the code
    }
}
