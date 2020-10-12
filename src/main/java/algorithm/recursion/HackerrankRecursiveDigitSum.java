package algorithm.recursion;

/**
 * https://www.hackerrank.com/challenges/recursive-digit-sum/problem
 * 숫자 n을 k번 반복한 후,
 * 한자리수끼리 더하기를 반복해서, 최종 1자리수를 구하라.
 */
public class HackerrankRecursiveDigitSum {
    static int superDigit(String n, int k) {
        // 반복된 문자열을 붙여서 재귀를 돌리면 긴 테케에서 재귀가 너무 깊어져 runtimeError가 나는 경우가 있음.
//        StringBuilder sb = new StringBuilder();
//        while(k!=0){
//            sb.append(n);
//            k--;
//        }

        long repeatedNum = 0;
        for (int i = 0; i < n.length(); i++) {
            repeatedNum += Character.getNumericValue(n.charAt(i)) * k;
        }
        return Integer.parseInt(sumDigit(Long.toString(repeatedNum)));
    }

    static String sumDigit(String n) {
        if (n.length() == 1) return n;
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        return sumDigit(Long.toString(sum));
    }
}
