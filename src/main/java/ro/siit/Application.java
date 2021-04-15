package ro.siit;

import ro.siit.util.SortingUtil;

import java.util.Arrays;

public class Application {

    public static void main(final String... args) {
        final int[] array = {5, 4, 1};
        System.out.println(Arrays.toString(SortingUtil.sort(array)));
    }
}
