package algorithm.implementation;

public class Programmers12901 {
    public String solution(int a, int b) {
        final String[] ANSWER = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        //월별 시작 요일
        final int[] START = {5, 1, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        int month = START[a - 1];
        int week = (b + month) % 7;
        return ANSWER[week == 0 ? 6 : week - 1];
    }
}
