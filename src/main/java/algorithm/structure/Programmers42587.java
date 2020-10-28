package algorithm.structure;


import java.util.ArrayDeque;
import java.util.Deque;

//https://programmers.co.kr/learn/courses/30/lessons/42587
public class Programmers42587 {
    class Document implements Comparable<Document> {
        int index;
        int priority;

        Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        @Override
        public int compareTo(Document o) {
            return priority - o.priority;
        }
    }

    public int solution(int[] priorities, int location) {
        Deque<Document> printer = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < priorities.length; i++) {
            printer.add(new Document(i, priorities[i]));
            max = Math.max(max, priorities[i]);
        }

        int ans = 1;
        while (!printer.isEmpty()) {
            Document J = printer.poll();
            if (J.priority == max) {
                if (J.index == location)
                    break;
                if (printer.isEmpty())
                    break;
                ans++;
                max = printer.stream().max(Comparable::compareTo).get().priority;
            } else {
                printer.add(J);
            }
        }
        return ans;
    }
}
