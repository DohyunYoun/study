package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Programmers67257 {

    public long solution(String expression) {
        long answer = 0;
        final String[][] OPERATORS = {{"*", "+", "-"}, {"*", "-", "+"}, {"+", "*", "-"}, {"+", "-", "*"}, {"-", "+", "*"}, {"-", "*", "+"}};
        Queue<String> q = new ArrayDeque<>();
        //StringBuilder vs String+=String : 6배정도 차이남
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                num.append(Character.getNumericValue(c));
            } else {
                if (num.length() != 0) {
                    q.add(num.toString());
                    num = new StringBuilder();
                }
                q.add(Character.toString(c));
            }
        }
        q.add(num.toString());

        for (int i = 0; i < 6; i++) {
            Queue<String> result = new ArrayDeque<>(q);
            for (int j = 0; j < 3; j++) {
                result = calculate(result, OPERATORS[i][j]);
            }

            answer = Math.max(answer, Math.abs(Long.parseLong(result.peek())));
        }
        return answer;
    }

    Queue<String> calculate(Queue<String> q, String op) {

        Stack<String> newQ = new Stack<>();
        while (q.size() > 0) {
            String s = q.poll();
            if (s.equals("*") || s.equals("+") || s.equals("-")) {
                if (s.equals(op)) {
                    long before = Long.parseLong(newQ.pop());
                    long after = Long.parseLong(q.poll());
                    switch (op) {
                        case "+":
                            newQ.push(String.valueOf(before + after));
                            continue;
                        case "-":
                            newQ.push(String.valueOf(before - after));
                            continue;
                        case "*":
                            newQ.push(String.valueOf(before * after));
                            continue;
                    }
                }
            }
            newQ.push(s);
        }
        return new ArrayDeque<>(newQ);
    }

    /*
//         System.out.println(String.join(", ", OPERATORS[i]));
//            System.out.println(Math.abs(Long.parseLong(result)));
    //70점
    public long solution(String expression) {
        long answer = 0;
        final String[][] OPERATORS = {{"*", "+", "-"}, {"*", "-", "+"}, {"+", "*", "-"}, {"+", "-", "*"}, {"-", "+", "*"}, {"-", "*", "+"}};

        for (int i = 0; i < 6; i++) {
            String result = expression;
            for (int j = 0; j < 3; j++) {
                result = calculate(result, OPERATORS[i][j]);
            }
            System.out.println(String.join(", ", OPERATORS[i]));
            System.out.println(Math.abs(Long.parseLong(result)));
            answer = Math.max(answer, Math.abs(Long.parseLong(result)));
        }
        return answer;
    }

    boolean canCalculate(String s, String op) {
        if (op.equals("-")) {
            if (s.charAt(0) == '-') {
                s = s.substring(1, s.length());
            }
            s = s.replace("*-", "*").replace("+-", "+");
        }
        return s.contains(op);
    }

    String calculate(String s, String op) {
        if (canCalculate(s, op)) {
            StringBuilder num = new StringBuilder();
            int beforeStartIndex = 0;
            int afterStartIndex = 0;

            int before = 0;
            boolean doCalculate = false;

            for (int i = 0, len = s.length(); i < len; i++) {
                char a = s.charAt(i);
                if (i == len - 1) {
                    if (doCalculate) {
                        int after = Integer.parseInt(s.substring(afterStartIndex, i + 1));
                        int result = 0;
                        switch (op) {
                            case "+":
                                result = before + after;
                                break;
                            case "-":
                                result = before - after;
                                break;
                            case "*":
                                result = before * after;
                                break;
                        }
                        num.append(s.substring(0, beforeStartIndex));
                        num.append(result);
                        return calculate(num.toString(), op);
                    }
                }
                if (!Character.isDigit(a)) {
                    if (a == '-') {
                        //맨 앞이거나, 부호로 쓰였을 경우 스킵해야함.
                        if (i == 0) {
                            continue;
                        }
                        if (!Character.isDigit(s.charAt(i - 1))) {
                            continue;
                        }
                    }
                    if (doCalculate) {
                        int after = Integer.parseInt(s.substring(afterStartIndex, i));
                        int result = 0;
                        switch (op) {
                            case "+":
                                result = before + after;
                                break;
                            case "-":
                                result = before - after;
                                break;
                            case "*":
                                result = before * after;
                                break;
                        }
                        num.append(s.substring(0, beforeStartIndex));
                        num.append(result);
                        num.append(s.substring(i, len));
                        return calculate(num.toString(), op);
                    } else {
                        if (op.equals(Character.toString(a))) {
                            before = Integer.parseInt(s.substring(beforeStartIndex, i));
                            doCalculate = true;
                            afterStartIndex = i + 1;
                        } else {
                            beforeStartIndex = i + 1;
                        }
                    }
                }
            }
            return num.toString();
        } else {
            return s;
        }
    }
    */
}
