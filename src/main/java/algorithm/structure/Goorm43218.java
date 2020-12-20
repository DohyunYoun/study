package algorithm.structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 실제 테케 통과못함
 */
public class Goorm43218 {
    public static void main(String[] args) throws Exception {
        final String OVERFLOW = "overflow";
        final String UNDERFLOW = "underflow";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        List<Integer> stack = new ArrayList<>();
        List<MyNumber> result = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int operator = Integer.parseInt(br.readLine());
            if (operator == 0) {
                //push & overflow(>10)
                if (stack.size() > 10) {
                    result.add(new MyNumber(OVERFLOW));
                } else {
                    int n = Integer.parseInt(br.readLine());
                    stack.add(n);
                    result.add(new MyNumber(i, n));
                }
            } else if (operator == 1) {
                //pop & underflow
                if (stack.size() == 0) {
                    result.add(new MyNumber(UNDERFLOW));
                } else {
                    int pos = i - 1;
                    int n = stack.remove(stack.size() - 1);
                    result.remove(new MyNumber(pos, n));
                }
            } else {
                //return
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            MyNumber num = result.get(i);
            if (num.pos == -1) {
                if (sb.length() != 0) {
                    System.out.println(sb.toString());
                    sb = new StringBuilder();
                }
                System.out.println(num.n);
            } else {
                sb.append(num.n + " ");
            }
        }
        if (sb.length() != 0) {
            System.out.println(sb.toString());
        }
    }

    static class MyNumber {
        int pos = -1;
        String n;

        MyNumber(int pos, int n) {
            this.pos = pos;
            this.n = String.valueOf(n);
        }

        MyNumber(String s) {
            this.n = s;
        }
    }
}
