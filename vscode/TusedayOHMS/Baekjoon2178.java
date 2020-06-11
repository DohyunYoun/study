package TusedayOHMS;
//https://fbtmdwhd33.tistory.com/31
//https://zoonvivor.tistory.com/77
import java.io.FileInputStream;
import java.util.*;

public class Baekjoon2178 {
    
    static int[][] arr;
    static boolean[][] visited;
     int[] dx = { -1, 0, 1, 0 };
     int[] dy = { 0, -1, 0, 1 };
    static int N;
    static int M;
    
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j)-'0';
                visited[i][j] = false;
            }
        }
        visited[0][0] = true;
        new Baekjoon2178().BFS(0, 0);
        System.out.println(arr[N - 1][M - 1]);
    }

    
    void BFS(int x, int y) {
        
        //offer 는 queue 의 메소드
        //add 는 LinkedList의 메소드
        //add를 쓸 경우에는 다형성이 손실됨.
        //offer는 리턴이 true or false.<>queue의 add는 리턴이 true or exception
        //offer 선호
        /**
         * add > offer
         * remove > poll
         * element > peek
         * 
         * Queue 는 ArrayList로 할경우 성능이 안좋음 LinkedList가 좋음.
         * Stack은 내장보다 ArrayList가 좋음. java내의 내장 Stack의 성능이 안좋음. - Vector로 구현 - 동기화작업이 과함.
         */
        Queue<Dot> q = new LinkedList<Dot>();
        q.add(new Dot(x, y));
        //큐가 끝날때 까지
        while (!q.isEmpty()) {
            Dot d = q.poll();
            for (int i = 0; i < 4; i++) {
                //다음 방문할 좌표 nextX, nextY
                int nextX = d.x + dx[i];
                int nextY = d.y + dy[i];
                
                //다음 좌표가 범위를 넘어갈때 건너뛰기
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }
                //이미 방문했던 점이면 건너뛰기
                if (visited[nextX][nextY] || arr[nextX][nextY] == 0) {
                    continue;
                }
                //다음에 방문할 좌표를 큐에 넣는다.
                q.add(new Dot(nextX, nextY));
                //배열안에 다음 방문할 곳은 현재 방문했던 점보다 1칸 더 가야하므로 +1
                arr[nextX][nextY] = arr[d.x][d.y] + 1;
                //다음 좌표는 방문했음으로 표시
                visited[nextX][nextY] = true;
            }
        }
    }
}

class Dot {
    int x;
    int y;
    
    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/**
 * 경문
 * import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    int Y;
    int X;

    int[][] map;
    boolean[][] visit;

    Node start;

    int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    class Node {
        int y;
        int x;
        int times;

        //노드가 시간을 갖고 있도록 처리
        Node(int y, int x, int times) {
            this.y = y;
            this.x = x;
            this.times = times;
        }
    }


    void solve() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] splits = br.readLine().split(" ");
            Y = Integer.parseInt(splits[0]);
            X = Integer.parseInt(splits[1]);

            map = new int[Y][X];
            visit = new boolean[Y][X];

            for (int y = 0; y < Y; y++) {
                splits = br.readLine().split("");
                for (int x = 0; x < X; x++) {
                    map[y][x] = Integer.parseInt(splits[x]);
                }
            }

            Queue<Node> queue = new ArrayDeque<>();
            queue.offer(new Node(0, 0, 1));

            int result = 0;

            while (!queue.isEmpty()) {
                Node node = queue.poll();
                //도착지인지를 확인
                if ((node.y == (Y - 1)) && (node.x == (X - 1))) {
                    result = node.times;
                    break;
                }
                int newY;
                int newX;

                for (int i = 0; i < 4; i++) {
                    newY = node.y + direction[i][0];
                    newX = node.x + direction[i][1];

                    if (newY >= Y || newY < 0 || newX >= X || newX < 0 ||
                            visit[newY][newX] || map[newY][newX] == 0) {
                        continue;
                    }

                    visit[newY][newX] = true;
                    queue.offer(new Node(newY, newX, node.times + 1));
                }
            }

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 */
/**
 * SOLUTION
  import java.util.*;
import java.io.*;

public class Main {
	static class Point {
		int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws Exception {
		int[] mx = {0, 0, 1, -1};
		int[] my = {1, -1, 0, 0};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Point> q = new LinkedList<Point>();
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		int[][] map = new int[N][M];
		boolean[][] visit = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			char[] c = br.readLine().toCharArray();
			for(int j = 0; j < M; j++) {
				map[i][j] = c[j] - '0';
			}
		}
		
		q.add(new Point(0, 0));
		
		while(!q.isEmpty()) {
			Point p = q.poll();
 			for(int k = 0; k < 4; k++) {
				int x = p.x + mx[k];
				int y = p.y + my[k];
				if(x >= 0 && y >= 0 && x < M && y < N && !visit[y][x] && map[y][x] >= 1) {
					q.add(new Point(x, y));
					visit[y][x] = true;
					map[y][x] = map[p.y][p.x] + 1;
				}
			}
		}
		
		System.out.println(map[N-1][M-1]);
		
	}
}
 */

 /*
 SOLUTIOn 2
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 
//  * Created by Bomi on 2020/05/25.
//  * 문제 출처 : https://www.acmicpc.net/problem/2178
//  *
//  * Time Complexity : O(N)
//  * Used Algorithm :  BFS
//  * Used Data structure : Array, Queue(LinkedList)
//  

public class Main_2178 {
    static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int n, m;

    private static int[][] maze;

    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        for(int i=0; i<n; i++) {
            String line = br.readLine();
            for(int j=0; j<m; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(new Node(0, 0));
        System.out.println(maze[n-1][m-1]);
    }

    private static void bfs(Node start) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(start);
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for(int i=0; i<4; i++) {
                int nextX = node.x + dx[i];
                int nextY = node.y + dy[i];

                if(!isAvailable(nextX, nextY)) {
                    continue;
                }

                queue.offer(new Node(nextX, nextY));
                maze[nextX][nextY] += maze[node.x][node.y];
            }
        }
    }

    private static boolean isAvailable(int x, int y) {
        if(0 > x || x >= n) return false;
        if(0 > y || y >= m) return false;
        if(maze[x][y] != 1) return false;
        return true;
    }
}
 */