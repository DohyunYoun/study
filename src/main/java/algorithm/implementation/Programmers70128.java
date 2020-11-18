package algorithm.implementation;

public class Programmers70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
        // return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}
