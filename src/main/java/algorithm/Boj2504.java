package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj2504 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] brackets = br.readLine().split("");
        Stack<String> stack = new Stack<>();


        int hasOutter = 0;
        int innerSum = 1;

        int sum = 0;
        loop:
        for (String bracket : brackets) {
            String start = "";
            if (!stack.isEmpty())
                start = stack.peek();

            switch (bracket) {
                case "(":
                    stack.push(bracket);
                    hasOutter++;
                    break;
                case "[":
                    stack.push(bracket);
                    hasOutter++;
                    break;
                case ")":
                    if ("(".equals(start)) {
                        stack.pop();
                        if (hasOutter > 1) {
                            innerSum *= 2;
                        } else {
                            innerSum = 1;
                        }
                        sum += innerSum;
                        hasOutter--;
                    } else {
                        sum = 0;
                        break loop;
                    }
                    break;
                case "]":

                    if ("[".equals(start)) {
                        stack.pop();
                        if (hasOutter > 1) {
                            innerSum *= 3;
                        } else {
                            innerSum = 1;
                        }
                        sum += innerSum;
                        hasOutter--;
                    } else {
                        sum = 0;
                        break loop;
                    }
                    break;
            }
            if (!stack.isEmpty())
                sum = 0;

            System.out.println(sum);
        }
    }

}
