package algorithm.greedy;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://www.hackerrank.com/challenges/greedy-florist/problem
 * 꽃의 종류 : c의 length
 * 꽃의 가격 : c의 value
 * 구매자 : k
 *
 * k가 모든 꽃을 구매한다고 할 때, 두번째 꽃 부터는 1씩 가격을 높여서 측정한다.[(0+1)*original price]
 * 가장 비싸게 팔 수 있는 금액을 구하시오.
 */
public class HackerrankFlorist {
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int cost = 0;
        int dumping = 0;

        for (int i = c.length - 1; i >= 0; i--) {
            cost += ((dumping / k) + 1) * c[i];
            dumping++;
        }

        return cost;
    }

}
