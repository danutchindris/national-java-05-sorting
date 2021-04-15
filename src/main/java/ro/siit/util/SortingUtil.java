package ro.siit.util;

import java.util.Arrays;

public class SortingUtil {

    /**
     * Sorts an array of numbers in ascending order using
     * the Bubble Sort algorithm.
     *
     * @param numbers The array to sort.
     * @return A new array containing the sorted numbers.
     */
    public static int[] sort(final int[] numbers) {
        final int[] xs = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < xs.length - 1; i++) {
            for (int j = 0; j < xs.length - 1 - i; j++) {
                if (xs[j] > xs[j + 1]) {
                    // interschimbam valorile lui xs[j] si xs[j + 1]
                    int temp = xs[j + 1];
                    xs[j + 1] = xs[j];
                    xs[j] = temp;
                }
            }
        }
        return xs;
    }
}
