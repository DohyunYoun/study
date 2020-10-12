package algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/64061
//board가 가로임...
public class Programmers64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();
        for (int value : moves) {
            int move = value - 1;
            for (int j = 0; j < board[move].length; j++) {
                if (board[j][move] != 0) {
                    int doll = board[j][move];
                    if (basket.isEmpty() || basket.get(basket.size() - 1) != doll) {
                        basket.add(doll);
                    } else if (basket.get(basket.size() - 1) == doll) {
                        answer += 2;
                        basket.remove(basket.size() - 1);
                    }
                    board[j][move] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
