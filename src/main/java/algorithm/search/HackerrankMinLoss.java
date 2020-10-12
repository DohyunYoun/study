package algorithm.search;

/**
 * https://www.hackerrank.com/challenges/minimum-loss/problem
 * price에 집의 가격이 담겨 있다.
 * 언제든 무조건 집을 사서, 이후에 집을 판다고 가정할때
 * 가장 적게 손해보는 금액을 구하시오
 */
public class HackerrankMinLoss {
    static int minimumLoss(long[] price) {
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < price.length-1; i++) {
            for (int j = i+1; j < price.length; j++) {
                long loss = price[i] - price[j];
                if (loss > 0)
                    min = Math.min(min, loss);
            }
        }
        return (int) min;
    }

    //timeout
//    static int minimumLoss(long[] price) {
//        long min = Integer.MAX_VALUE;
//        for (int i = 0; i < price.length-1; i++) {
//            for (int j = i+1; j < price.length; j++) {
//                long loss = price[i] - price[j];
//                if (loss > 0)
//                    min = Math.min(min, loss);
//            }
//        }
//        return (int) min;
//    }
}
