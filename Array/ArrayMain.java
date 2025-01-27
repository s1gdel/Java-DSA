
package Array;

public class ArrayMain {
    public static void main(String[] args) {
        int[] myArray = {5, 3, 8, 1, 9, 4};

        // Create an instance of ArrayOperations
        Array arrayOps = new Array(myArray);

        // Display the array
        arrayOps.displayArray();

        // Find and display the maximum element
        System.out.println("Max Element: " + arrayOps.findMax());

        // Find and display the minimum element
        System.out.println("Min Element: " + arrayOps.findMin());

        // Calculate and display the sum of all elements
        System.out.println("Sum of Elements: " + arrayOps.calculateSum());

        // Calculate and display the average of all elements
        System.out.println("Average of Elements: " + arrayOps.calculateAverage());

        // Search for an element in the array
        int searchElement = 8;
        if (arrayOps.searchElement(searchElement)) {
            System.out.println(searchElement + " found in the array.");
        } else {
            System.out.println(searchElement + " not found in the array.");
        }
    }
}