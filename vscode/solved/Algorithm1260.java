package solved;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithm1260 {
    static ArrayList<Integer>[] arrayList;
    static boolean[] checkList;

    /**
     * DFS 시나리오 (Stack)
     * 1 -> 2 -> 1(t), 4 -> 1(t), 2(t), 3
     */
    public static void showDfs(int x) {
        // 첫 진입시 false
        // x == s : 1
        if (checkList[x]) return;
        checkList[x] = true;
        System.out.print(x + " ");
        for (int y : arrayList[x]) {
            // input your code
            if(!checkList[y]){
                showDfs(y);
            }
        }
    }

    /**
     * BFS 시나리오 (Queue)
     * 1 -> arraylist[1] : (2, 3, 4)
     */
    public static void showBfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        checkList[s] = true;

        while (!queue.isEmpty()) {
            int x = queue.remove();
            System.out.print(x + " ");
            for (int y : arrayList[x]) {
                // input your code
                if(!checkList[y]){
                    queue.add(y);
                    checkList[y] = false;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000),
        // 간선의 개수 M(1 ≤ M ≤ 10,000),
        // 탐색을 시작할 정점의 번호 V가 주어진다. --> s : start
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        // 1부터라서 n + 1
        arrayList = (ArrayList<Integer>[]) new ArrayList[n + 1];

        
        for (int i = 1; i < n + 1; i++) {
            arrayList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            // 간선이 연결하는 두 정점의 번호
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            // 양방향이므로 add는 반대로
            arrayList[v1].add(v2);
            arrayList[v2].add(v1);
        }

        for (int i = 1; i < n + 1; i++) {
            Collections.sort(arrayList[i]);
        }

        // DFS
        checkList = new boolean[n+1];
        showDfs(s);
        System.out.println();

        // BFS
        checkList = new boolean[n+1];
        showBfs(s);
        System.out.println();
    }
}
