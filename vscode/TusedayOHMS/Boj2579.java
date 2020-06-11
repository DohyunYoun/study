package TusedayOHMS;
/**
 * 
0: 10
1: 20
2: 15
3: 25
4: 10
5: 20


연속가능배열: 0: 10, 1: 20, 2: 25, 3: 45, 4: 35, 5: 65
연속노가배열: 1: 30, 2: 35, 3: 50, 4: 55, 5: 55

연속가능배열: 2: 25, 3: 55, 4: 45, 5: 70
연속노가배열: 3: 50, 4: 65, 5: 65

연속가능배열: 4: 35, 5: 75

5의 최대값: 75
 */

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    
    public class Boj2579 {
        public static void main(String[] args) {
            new Main().solve();
        }
    
        int N;
        int[] arr;
    
        int[] can;
        int[] cannot;
    
        void solve() {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                N = Integer.parseInt(br.readLine());
                arr = new int[N];
                can = new int[N];
                cannot = new int[N];
    
                for (int i = 0; i < N; i++) {
                    arr[i] = Integer.parseInt(br.readLine());
                }
    
                if (N == 1) {
                    System.out.println(arr[0]);
                    return;
                }
    
                can[0] = arr[0];
                can[1] = arr[1];
                for (int i = 2; i < N; i++) {
                    can[i] = arr[i] + can[i - 2];
                }
    
                int cn = 1;
                int c = 2;
    
                while (true) {
                    int curr;
                    int curr2;
    
                    for (int i = cn; i < N; i++) {
                        curr = can[i - 1] + arr[i];
                        cannot[i] = Math.max(cannot[i], curr);
                    }
    
                    for (int i = c; i < N; i++) {
                        curr = arr[i] + cannot[i - 2];
                        curr2 = arr[i] + can[i - 2];
                        can[i] = Math.max(can[i], Math.max(curr, curr2));
                    }
    
                    cn += 2;
                    c += 2;
    
    
                    if (cn > N) {
                        break;
                    }
                }
                System.out.println(Math.max(can[N - 1], cannot[N - 1]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    }