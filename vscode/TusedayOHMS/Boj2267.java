package TusedayOHMS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Boj2267 {
    public static void main(String[] args) {
        new Boj2267().solve();
    }

    int Y;
    int X;

    int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int[][] map;
    boolean[][] visit;

    class Node {
        int y;
        int x;
        int times;
        boolean isCrash;

        public Node(int y, int x, int times, boolean isCrash) {
            this.y = y;
            this.x = x;
            this.times = times;
            this.isCrash = isCrash;
        }
    }

    void solve() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] splits = br.readLine().split(" ");
            char[] cArr;
            Y = Integer.parseInt(splits[0]);
            X = Integer.parseInt(splits[1]);

            map = new int[Y][X];
            visit = new boolean[Y][X];

            for (int y = 0; y < Y; y++) {
                cArr = br.readLine().toCharArray();
                for (int x = 0; x < X; x++) {
                    map[y][x] = cArr[x] - '0';
                }
            }

            Queue<Node> queue = new ArrayDeque<>();
            queue.offer(new Node(0, 0, 1, false));

            int result = -1;

            while (!queue.isEmpty()) {
                Node node = queue.poll();

                if (node.y == Y - 1 && node.x == X - 1) {
                    result = node.times;
                    break;
                }

                int newY;
                int newX;

                for (int k = 0; k < 4; k++) {
                    boolean org = node.isCrash;
                    newY = node.y + direction[k][0];
                    newX = node.x + direction[k][1];

                    if (newY >= Y || newY < 0 || newX >= X || newX < 0) {
                        continue;
                    }

                    if (map[newY][newX] == 1) {
                        if (node.isCrash)
                            continue;
                        else
                            node.isCrash = true;
                    } else {
                        if (visit[newY][newX]) {
                            if (node.isCrash)
                                continue;
                            else {
                                if (map[newY][newX] == 2)
                                    continue;
                                map[newY][newX] = 2;
                            }
                        }
                    }

                    visit[newY][newX] = true;
                    queue.offer(new Node(newY, newX, node.times + 1, node.isCrash));
                    node.isCrash = org;
                }
            }

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}