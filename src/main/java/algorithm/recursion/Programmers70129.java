package algorithm.recursion;

public class Programmers70129 {
    private int countConvert = 0;
    private int countZero = 0;

    public int[] solution(String s) {
        if (!s.equals("1")) {
            String replaced = s.replace("0", "");
            countZero += s.length() - replaced.length();
            countConvert++;
            solution(Integer.toBinaryString(replaced.length()));
        }
        return new int[]{countConvert, countZero};
    }

}
