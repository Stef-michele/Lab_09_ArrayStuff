import java.util.Random;
import java.util.Scanner;

public class Main {
    // static method to calculate the average of an array of int values
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
    public static void main(String[] args) {
        // Declare and initialize an array of type int named dataPoints
        int[] dataPoints = new int[100];

        // Code a regular for loop to initialize each element in dataPoints to a random value between 1 and 100
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Code a loop to display the dataPoints values separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i != dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // Move to the next line after displaying all values

        // Code a loop to calculate the sum and the average of the values in dataPoints
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;

        // Output/display the sum and the calculated average
        System.out.printf("The sum of the random array dataPoints is: %d%n", sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);

        // Prompt the user to input an integer value between 1 and 100
        int userValue;
        userValue = SafeInput.getRangedInt(new Scanner(System.in), "Enter an integer between 1 and 100: ", 1, 100);
        // Count occurrences of the user's value in the dataPoints array
        int occurrences = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                occurrences++;
            }
        }

        // Output the count of occurrences of the user's value in the array
        System.out.printf("The user's value (%d) was found %d times in the dataPoints array.%n", userValue, occurrences);

        // Prompt the user again for a value between 1 and 100 to search
        int searchValue = SafeInput.getRangedInt(scanner, "Enter another integer between 1 and 100 to search: ", 1, 100);

        // Code a loop to find the first position of the user's value within the array
        int position = -1; // Initialize to -1 indicating the value is not found
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                position = i; // Update position when value is found
                break; // Break out of the loop once the value is found
            }
        }

        // Output the position of the user's value in the array
        if (position != -1) {
            System.out.printf("The value %d was found at array index %d.%n", searchValue, position);
        } else {
            System.out.printf("The value %d was not found in the dataPoints array.%n", searchValue);
        }

        // Find minimum and maximum values in the dataPoints array
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        // Display values to the user
        System.out.printf("The minimum value in the dataPoints array is: %d%n", min);
        System.out.printf("The maximum value in the dataPoints array is: %d%n", max);
        //Test get average method
        System.out.printf("Average of dataPoints is:" + getAverage(dataPoints));
    }

}