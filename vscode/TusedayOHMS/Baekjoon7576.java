package TusedayOHMS;

//https://developer-mac.tistory.com/67
//https://zoonvivor.tistory.com/131
//https://full-of-dream.tistory.com/21 - 얘만 맥준에서 작동함.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Dot {
    int x;
    int y;
    
    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Baekjoon7576 {
    int[] dx = { 0, 0, -1, 1 };
    int[] dy = { -1, 1, 0, 0 };
    static Queue<Dot> queue;
    static int[][] arr, dist;
    
    static int n,m;
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String[] str1 = br.readLine().split(" ");
        Scanner sc = new Scanner(System.in);
        
        m = sc.nextInt();
        n = sc.nextInt();
        sc.nextLine();
        
        arr = new int[n][m];
        dist = new int[n][m];
        
        queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] =sc.nextInt();
                if (arr[i][j] == 1) {
                    queue.add(new Dot(i, j));
                }
            }
        }
        
        new Baekjoon7576().solve();
    }
    
    void solve(){
        
        
        while (!queue.isEmpty()) {
            
            
            //익은 토마토의 상하좌우는 다음에 익기 때문에 큐에 담아야한다.
            Dot p = queue.remove();
            int x = p.x;
            int y = p.y;
            
            for (int i = 0; i < 4; i++) {
                int nextX = x+ dx[i];
                int nextY = y + dy[i];
                
                //범위 밖 패스
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                    continue;
                }
                //다음 위치가 익지 않은 토마토가 아니면 패스
                if (arr[nextX][nextY] != 0 &&  dist[nextX][nextY] != 0) {
                    continue;
                }
                //최대 일수를 구하기 때문에 1로 바꾸는 것이 아니라 현재 일수 +1 을 해줘야한다.
                queue.add(new Dot(nextX, nextY));
                dist[nextX][nextY] = dist[x][y] + 1;
                
                
                // Dot p = queue.remove();
                // int x = p.x;
                // int y = p.y;
                // for (int i = 0; i < dx.length; i++) {
                    //     int nx = x + dx[i];
                    //     int ny = y + dy[i];
                    
                    //     if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                        //         if (arr[nx][ny] == 0 && dist[nx][ny] == 0) {
                            //             queue.add(new Dot(nx, ny));
                            //             dist[nx][ny] = dist[x][y] + 1;
                            //         }
                            //     }
                        }
                    }
                    
                    // int ans = 0;
                    // for (int i = 0; i < n; i++) {
                    //     for (int j = 0; j < m; j++) {
                    //         ans = Math.max(ans, dist[i][j]);
                    //     }
                    // }
                    
                    // for (int i = 0; i < n; i++) {
                    //     for (int j = 0; j < m; j++) {
                    //         if (arr[i][j] == 0 && dist[i][j] == 0) {
                    //             ans = -1;
                    //         }
                    //     }
                    // }
                    

        // 모두 다 익지 못하는 상태이면 -1 출력
		// 다 익을 수 있으면 최소 일 수
		int ans = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					System.out.println("-1");
					return;
				}

				if(dist[i][j] > ans) ans = dist[i][j];
			}
        }
                    System.out.println(ans);
                }
            }

/**
 * SOLUTION
 * import java.util.*;
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Point> q = new LinkedList<Point>();
		int[] mx = {0, 0, 1, -1};
		int[] my = {1, -1, 0, 0};
		
		String[] s = br.readLine().split(" ");
		int M = Integer.parseInt(s[0]);
		int N = Integer.parseInt(s[1]);
		int[][] map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			s = br.readLine().split(" ");
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(s[j]);
				if(map[i][j] == 1) {q.add(new Point(j, i));}
			}
		}
		
		while(!q.isEmpty()) {
			Point p = q.poll();
			for(int k = 0; k < 4; k++) {
				int x = p.x + mx[k];
				int y = p.y + my[k];
				if(x >= 0 && y >= 0 && x < M && y < N && map[y][x] == 0) {
					q.add(new Point(x, y));
					map[y][x] = map[p.y][p.x]+1;
				}
			}
		}

		int result = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 0) {
					result = 0;
					i = M;
					break;
				}
				result = Math.max(map[i][j], result);
			}
		}
		
		System.out.println(result-1);
	}
}
 */