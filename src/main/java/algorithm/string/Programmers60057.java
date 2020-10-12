package algorithm.string;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by DohyunYoun on 2020-06-11
 * SITE : https://programmers.co.kr/learn/courses/30/lessons/60057
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point : 이전것과 다음것이 같으면 숫자를 증가시켜서 log10에 넎어서 길이만 체크함.
 */
public class Programmers60057 {
    /**
     * 2020-08-31
     * 2020-06-11 보다 runtime 빠름
     * cf) testcase 21 : 31.11ms vs 3.31ms
     */
    public int solution20200831(String s) {
        final int LEN = s.length();
        //maximum compression
        final int HALF = LEN / 2;
        int minCompressedAnswer = LEN;

        int unit = 1;
        while (unit <= HALF) {
            String sub = s.substring(0, unit);
            int compressed = 1;
            int compressedAnswer = LEN;
            for (int i = unit; i < LEN; i += unit) {
                if (i + unit > LEN) {
                    continue;
                }
                String pair = s.substring(i, i + unit);
                if (pair.equals(sub)) {
                    compressed++;
                } else {
                    if (compressed != 1) {
                        // 자릿수 구하기 : (int)(Math.log10(compressed) +1)
                        compressedAnswer = compressedAnswer - (compressed * unit) + (int) (Math.log10(compressed) + 1) + unit;
                        compressed = 1;
                    }
                    sub = pair;
                }
            }
            //마지막 단어포함 압축될 경우 for문에서 처리 못해서 별도로 처리
            if (compressed != 1) {
                compressedAnswer = compressedAnswer - (compressed * unit) + (int) (Math.log10(compressed) + 1) + unit;
            }
            minCompressedAnswer = Math.min(minCompressedAnswer, compressedAnswer);
            unit++;
        }
        return minCompressedAnswer;
    }

    public int solution20200611(String s) {
        if (s.length() == 1) {
            return 1;
        }

        char[] cArr = s.toCharArray();

        //압축을 못한경우의 최소값
        int min = cArr.length;
        //어차피 절반넘어가는걸 압축하면 짝이 없으니까 절반을 미리 설정
        int half = min / 2;

        int beforeNum;
        boolean beforeSame;
        boolean isSame;

        int currLen;
        char c;

        Queue<Character> queue = new ArrayDeque<>();

        for (int i = 1; i <= half; i++) {
            queue.clear();
            isSame = true;
            beforeSame = false;
            beforeNum = 0;
            currLen = cArr.length;
            for (int j = 0; j < i; j++) {
                queue.offer(cArr[j]);
            }

            for (int j = i; j < cArr.length; j++) {
                c = queue.poll();
                queue.offer(cArr[j]);

                if (c != cArr[j]) {
                    isSame = false;
                }

                if (i == 1) {
                    if (isSame) {
                        currLen -= i;
                        beforeNum++;
                        if (!beforeSame) {
                            currLen++;
                            beforeSame = true;
                        } else {
                            if ((int) Math.log10(beforeNum) != (int) Math.log10(beforeNum + 1))
                                currLen++;
                        }
                    } else {
                        beforeSame = false;
                        beforeNum = 0;
                    }
                    isSame = true;

                } else if ((j + 1) % i == 0) {
                    if (isSame) {
                        currLen -= i;
                        beforeNum++;
                        if (!beforeSame) {
                            currLen++;
                            beforeSame = true;
                        } else {
                            if ((int) Math.log10(beforeNum) != (int) Math.log10(beforeNum + 1))
                                currLen++;
                        }
                    } else {
                        beforeSame = false;
                        beforeNum = 0;
                    }
                    isSame = true;
                }
            }
            min = Math.min(min, currLen);
        }

        return min;
    }
}
