package algorithm;

public class Programmers12911 {
    public int solution(int n) {
        final int cnt = Integer.bitCount(n);
        n++;
        while (Integer.bitCount(n) != cnt) {
            n++;
        }
        return n;
    }
}
