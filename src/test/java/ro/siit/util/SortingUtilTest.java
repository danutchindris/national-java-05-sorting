package ro.siit.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortingUtilTest {

    @Test
    public void whenSortIsCalledANewSortedArrayIsReturned() {
        final int[] xs = {5, 1, 4, 2, 8};
        final int[] actualArray = SortingUtil.sort(xs);
        final int[] expectedArray = {1, 2, 4, 5, 8};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void whenSortIsCalledInputDoesNotChange() {
        final int[] xs = {15, 31, 4, 0};
        final int[] xsCopy = Arrays.copyOf(xs, xs.length);
        SortingUtil.sort(xs);
        Assert.assertArrayEquals(xsCopy, xs);
    }
}
