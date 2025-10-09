package arrays;

public class ArraysExample {

    // Example 1: Creating and printing an array
    public void createArray() {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Example 1: Printing elements of the array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Example 2: Using array indexes
    public void accessArray() {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("\nExample 2: Accessing array elements by index:");
        System.out.println("First element: " + fruits[0]);
        System.out.println("Second element: " + fruits[1]);
        System.out.println("Third element: " + fruits[2]);
    }

    // Example 3: Changing array values
    public void modifyArray() {
        double[] prices = {9.99, 14.99, 29.99};
        System.out.println("\nExample 3: Modifying an array element:");
        System.out.println("Old price of second item: " + prices[1]);
        prices[1] = 19.99;
        System.out.println("New price of second item: " + prices[1]);
    }

    // Example 4: Array length
    public void arrayLength() {
        char[] grades = {'A', 'B', 'C', 'D'};
        System.out.println("\nExample 4: Array length:");
        System.out.println("Total elements in array: " + grades.length);
    }

    // Example 5: Multidimensional arrays
    public void multiDimensionalArray() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\nExample 5: Multidimensional array values:");
        System.out.println("Element at row 0, column 2: " + matrix[0][2]);
        System.out.println("Element at row 1, column 0: " + matrix[1][0]);
    }
}