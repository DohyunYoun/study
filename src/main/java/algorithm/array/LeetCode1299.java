package algorithm.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class LeetCode1299 {
    //1 ms	40.2 MB
    public int[] replaceElementsSolution(int[] arr) {
        int mx = -1, n = arr.length, a;
        for (int i = n - 1; i >= 0; --i) {
            a = arr[i];
            arr[i] = mx;
            mx = Math.max(mx, a);
        }
        return arr;
    }

    //1927 ms	40.7 MB
    public int[] replaceElements(int[] arr) {
        final int LEN = arr.length;
        for (int i = 0; i < LEN - 1; i++) {
            arr[i] = Arrays.stream(Arrays.copyOfRange(arr, i + 1, LEN )).max().getAsInt();
        }
        arr[LEN - 1] = -1;
        return arr;
    }
}
