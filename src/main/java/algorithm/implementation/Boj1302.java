package algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> books = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            books.put(book, books.getOrDefault(book, 0) + 1);
        }

        System.out.println(
                books.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .findFirst().get().getKey()
        );
    }
}
