package javaprogrammeweek9;

import java.util.Arrays;

public class Programme_3_ReverseArray {

    public static void main(String[] args) {
        // Array Declaration
        int[] array = new int[]{10, 20, 30, 40, 50, 60};

        // Printing Original Array
        int[] nonReversedArray = new int[array.length];
        for (int i = 0; i < nonReversedArray.length; i++) {
            nonReversedArray[i] = array[i];
        }
        System.out.println("Original Array = " + Arrays.toString(nonReversedArray));

        // Reversing The Array and printing reversed Array
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = array[i];
        }
        for (int i = 0; i < reverseArray.length / 2; i++) {
            int temp = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length - i - 1];
            reverseArray[reverseArray.length - i - 1] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(reverseArray));

    }

}
