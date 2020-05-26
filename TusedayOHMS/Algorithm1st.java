package TusedayOHMS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Algorithm1st {
    /**
        * 도착을 못하는 경우
        1000
        1111
        0001
        0000

        * 도착을 하는 경우
        1000
        1111
        0001
        0001

        1000
        1111
        0101
        0000
    */

    /**
     * 기존 BFS
     * Queue>Stack으로 바꾸면 DFS
     * 
     * 위의 입력값 중 0은 방문할 수 없음 / 1은 방문 가능
     */
    public static void main(String[] args){
        new Algorithm1st().solve();
    }
    
    //방문하는 좌표의 정렬
    class Node {
        int y;
        int x;
        
        //행렬로 생각해서 m,y
        Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    //주어지는 표
    int[][] map;
    //해당 표에서의 방문 여부 (=맵과 같은 크기)
    boolean[][] visit;
    //종료 점 임의 생성
    Node end;
    //BFS 시 상하좌우
    int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    void solve() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Queue<Node> queue = new ArrayDeque<>();
            map = new int[4][4];
            visit = new boolean[4][4];

            //시작점 설정
            queue.offer(new Node(0, 0));
            //시작점 방문 완료
            visit[0][0] = true;

            
            //map 및 end를 초기화
            for (int i = 0; i < 4; i++) {
                String[] splits = br.readLine().split("");
                for (int j = 0; j < 4; j++) {
                    map[i][j] = Integer.parseInt(splits[j]);
                }
            }
            //목적지
            end = new Node(3, 3);
            

             //이동하는 지점
             int newY;
             int newX;

             //BFS
            while (!queue.isEmpty()) {
                Node item = queue.poll();
                
                if (item.y == end.y && item.x == end.x) {
                    System.out.println("arrive!");
                    break;
                }
                
                //네 방향이어서 4까지 돌림.
                //1,0 / 1,1 / 1,-1 / 0,0
                for (int i = 0; i < 4; i++) {
                    newY = item.y + direction[i][0];
                    newX = item.x + direction[i][1];
                    
                    //범위 밖일때,
                    if (newY >= 4 || newY < 0 || newX >= 4 || newX < 0) {
                        continue;
                    }
                    //범위 밖일때 = 0은 방문할 수 없는 지점
                    if (map[newY][newX] == 0) {
                        continue;
                    }
                    //범위 밖일때 = true는 이미 방문한 지점
                    if (visit[newY][newX]) {
                        continue;
                    }
                    
                    System.out.println(newY + ", " + newX);
                    
                    visit[newY][newX] = true;
                    queue.offer(new Node(newY, newX));
                }
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
