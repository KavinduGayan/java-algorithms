package algo;

import java.util.function.BiFunction;

import static java.lang.System.out;

public class LinearSearchFunctional {

    static BiFunction<int[], Integer, Integer> searchIndex = (a, b) -> {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    };

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 2, 6, 9, 7, 6};
        int n = 6;
        out.println(searchIndex.apply(arr, n));
    }
}
