package ro.siit.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortingUtilTest {

    @Test
    void whenSortIsCalledANewSortedArrayIsReturned() {
        final int[] xs = {5, 1, 4, 2, 8};
        final int[] actualArray = SortingUtil.sort(xs);
        final int[] expectedArray = {1, 2, 4, 5, 8};
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void whenSortIsCalledInputDoesNotChange() {
        final int[] xs = {15, 31, 4, 0};
        final int[] xsCopy = Arrays.copyOf(xs, xs.length);
        SortingUtil.sort(xs);
        Assertions.assertArrayEquals(xsCopy, xs);
    }
}
