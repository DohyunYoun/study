package algorithm;

/**
 * https://www.hackerrank.com/challenges/the-time-in-words/problem
 * <p>
 * 정각 : o'clock
 * 1~30분 : past
 * 31분~59분 : to
 * 15분, 45분 : quarter
 * 30분 : half
 */
public class HackerrankTimeinWords {

    static final String[] SINGLE_DIGIT = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    static final String[] TENS_DIGIT = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static final String[] TWO_DIGITS = {"", "", "twenty"};

    static String timeInWords(int h, int m) {
        final int OCLOCK = 0;
        final int HALF = 30;
        final int PAST = 15;
        final int TO = 45;


        StringBuilder sb = new StringBuilder();
        if (m == OCLOCK) {
            return castToTenDigits(h) + " o' clock";
        } else if (m == TO) {
            return sb.append("quarter to ").append(castToTenDigits((h + 1) % 12)).toString();
        } else if (m > HALF) {
            sb.append(castToMinutes(60 - m));
            if (m == 59) {
                sb.append(" minute to ");
            } else {
                sb.append(" minutes to ");
            }
            return sb.append(castToTenDigits((h + 1) % 12)).toString();
        } else if (m == HALF) {
            sb.append("half past ");
        } else if (m == PAST) {
            sb.append("quarter past ");
        } else {
//            m < HALF
            sb.append(castToMinutes(m));
            if (m == 1) {
                sb.append(" minute past ");
            } else {
                sb.append(" minutes past ");
            }
        }
        //hour
        sb.append(castToTenDigits(h));
        return sb.toString();
    }

    static String castToTenDigits(int n) {
        if (SINGLE_DIGIT.length > n) {
            return SINGLE_DIGIT[n];
        } else {
            return TENS_DIGIT[n % 10];
        }
    }

    static String castToMinutes(int n) {
        //25분
        int first = n / 10; //2
        int second = n % 10; //5

        if (first == 1) {
            return castToTenDigits(n);
        } else if (first != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(TWO_DIGITS[first]).append(" ").append(SINGLE_DIGIT[second]);
            return sb.toString();
        } else {
            return SINGLE_DIGIT[n];
        }
    }
}
