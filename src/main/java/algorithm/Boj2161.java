package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Boj2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new ArrayDeque<>();
        int[] result = new int[N];
        for (int i = 1; i < N + 1; i++) {
            q.offer(i);
        }
//        Queue<Integer> queue = new LinkedList(IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList()));

        boolean isPoped = false;
        while (q.size() != 0) {
            if (isPoped) {

            } else {

            }
            isPoped = !isPoped;
        }
    }
}
