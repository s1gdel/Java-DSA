
package Array;

public class Array {
    private int[] array;

    // Constructor to initialize the array
    public Array(int[] array) {
        this.array = array;
    }

    // Method to display the array
    public void displayArray() {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to find the maximum element in the array
    public int findMax() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method to find the minimum element in the array
    public int findMin() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Method to calculate the sum of all elements in the array
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Method to calculate the average of all elements in the array
    public double calculateAverage() {
        return (double) calculateSum() / array.length;
    }

    // Method to search for an element in the array
    public boolean searchElement(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}