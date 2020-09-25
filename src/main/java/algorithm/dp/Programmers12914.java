package algorithm.dp;

public class Programmers12914 {

    public long solution(int n) {
        //long[n] 까지 할 경우 테케1번 런타임 에러가 난다. 메모리때문??
        long[] steps = new long[n + 1];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; i++) {
            //매번 도달할 수 있는 방법 수이기때문에 나머지연산을 해준다.
            steps[i] = (steps[i - 2]  + steps[i - 1]) % 1234567;
        }

        return steps[n - 1] % 1234567;
    }
}
