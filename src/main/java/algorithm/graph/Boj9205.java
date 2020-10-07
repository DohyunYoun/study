package algorithm.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

//https://zoonvivor.tistory.com/113
public class Boj9205 {
    private static String HAPPY = "happy";
    private static String SAD = "sad";
    private static boolean isHappy = false;

    /**
     * 에러나는 테스트케이스
     * 집 : 0 0
     * 편의점 : 2000 0
     * 편의점 : 1000 0
     * 페스티벌 : 3000 0
     *
     * 집 : 0 0
     * 편의점 : 2000 0
     * 페스티벌 : 1000 0
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); //test개수

        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine()); //편의점 개수
            //좌표
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Point house = new Point(x,y);
            Point festival = null;
            Queue<Point> queue = new ArrayDeque<>();
            //input convenience store
            for (int j = 0; j < n + 1; j++) {
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                if(j == n){
                    festival = new Point(x,y);
                }else{
                    queue.offer(new Point(x,y));
                }
            }
            if(house.distance(festival)){
                System.out.println(HAPPY);
                break;
            }
            while(queue.size() > 1){
                Point store = queue.poll();
                if(house.distance(store)){
                    house = store;
                }else{
                    queue.offer(store);
                }
            }

//            System.out.println(house.distance() ? HAPPY : SAD);
        }

//        if (point != null) {
//            int distance = point.distance(x, y);
//            System.out.println("distance :: " + distance);
//            if (distance <= 1000) {
//                isHappy = true;
//                point = new Point(x, y);
//            } else {
//                isHappy = false;
//            }
//        }else{
//            point = new Point(x, y);
//        }

    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean distance(int _x, int _y) {
            return (Math.abs((_x - x)) + Math.abs((_y - y))) <= 1000;
        }

        boolean distance(Point p) {
            return (Math.abs((p.x - x)) + Math.abs((p.y - y))) <= 1000;
        }
    }
}
