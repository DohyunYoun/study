package algorithm.implementation;

public class Programmers68935 {
    public int solution(int n) {
        final int TERNARY = 3;
//        StringBuilder three = new StringBuilder();
//        while (n > 0) {
//            three.append(n % 3);
//            n = n / 3;
//        }
        return Integer.parseInt(new StringBuffer(Integer.toString(n, TERNARY)).reverse().toString(), TERNARY);
    }
}
