package algorithm.dp;

/**
 * https://www.hackerrank.com/challenges/play-game/problem
 * <p>
 * 친구와 같이 게임을 하는데 한사람당 최소 1개 ~ 최대 3개까지 벽돌을 깨트릴 수 있다.
 * 번갈아가면서 벽돌을 깨트린다고 할때, 내가 얻을 수 있는 가장 높은 점수를 출력해라.
 * <p>
 * ?? 친구는 무조건 3개의 벽돌을 깨트리나 ..?
 */
public class HackerrankBricksGame {
    static int bricksGame(int[] arr) {
        //{1,0,999  ,3,4,5,  1,999,  0,8,9,  999};
        int[] score = new int[arr.length];
        score[0] = arr[0];
        score[1] = score[0] + arr[1];
        score[2] = score[1] + arr[2];
        score[3] = score[2];
        for (int i = 4; i < arr.length; i++) {
            score[i] = Math.max(score[i-1],Math.max((score[i - 4] + arr[i]), score[i - 2]));
        }
        return score[arr.length - 1];

    }

    static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
