package algorithm.dp;

public class Programmers12914 {

    public long solution(int n) {
        //long[n] 까지 할 경우 테케1번 런타임 에러가 난다.  > n이 1로 들어올때, steps[1]에 outofIndex에러가남.
        if (n <= 2) return n;
        long[] steps = new long[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; i++) {
            //매번 도달할 수 있는 방법 수이기때문에 나머지연산을 해준다.
            steps[i] = (steps[i - 2] + steps[i - 1]) % 1234567;
        }

        // BigInt로 바꾸면 마지막에 나머지 연산을 해줘도된다.
        return steps[n - 1];
    }
}
