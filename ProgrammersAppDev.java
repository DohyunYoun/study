import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProgrammersAppDev {
    public static void main(final String[] args) {
        System.out.println("Default Main Fuction Sample");
        String command = "<v>AB^CYv^XAZ";
        String[] buttons = new String[]{"v>AB^CYv^XA", "<v>A", "^XAZ", "Yv^XA", ">AB^"};
        int[] scores = new int[]{50, 18, 20, 30, 25};
        new ProgrammersAppDev().solve3(command,buttons,scores);
    }
    
    
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {1, -1, 0, 0};
    
    int solve2(int[][] board){
        
        // for (int y = 0; y < Y; y++) {
        //     for (int x = 0; x < X; x++) {
        //         if (map[y][x] == 0) {
        //             continue;
        //         }
        //         for (int k = 0; k < 4; k++) {
        //             score = 0;
        //             dfs(y, x, 1, map[y][x], k);
        //             if (score == 5) {
        //                 winner = map[y][x];
        //                 k = 5;
        //                 y = Y;
        //                 x = X;
        //             }
        //         }
        //     }
        // }

        // return winner;


        dfs(v, new boolean[n + 1]);
        bw.write("\n");
        
    }
    
    
    void dfs(int y, int x, int depth, int dol, int k) {
        int newY = y + direction[k][0];
        int newX = x + direction[k][1];

        if (newY >= Y || newY < 0 || newX >= X || newX < 0 || map[newY][newX] != dol || visit[newY][newX][k]) {
            score = Math.max(score, depth);
            return;
        }

        visit[newY][newX][k] = true;
        dfs(newY, newX, depth + 1, dol, k);
    }

    
    private static void dfs(int x, int y, int k,boolean[] visited)  {
        int newX = x + dx[k];
        int newY = y + dy[k];

        if(newY <0 || newX < 0){
            
        }
        visited[start] = true;
        bw.write(start + " ");
        for(int i=1, len=matrix.length; i<len; i++) {
            if(visited[i]) continue;
            if(matrix[start][i] == 1) {
                dfs(i, visited);
            }
        }
    }
    
    
    /**
    * 
    * @param command : user input command
    * @param buttons : command button
    * @param scores  : score
    * @return
    */
    int solve3( String command,  String[] buttons,  int[] scores) {
        String[] c = new String[] { "<", ">", "^", "v", "A", "B", "C", "X", "Y", "Z" };
        // save Command and Scroe
        HashMap<String, Integer> commands = new HashMap<>();
        // sort by score
        commands = sortByValue(commands);
        ArrayList<String> keyset = (ArrayList<String>) commands.keySet();
        
        int max = 0;
        // while(true){
            int score = 0;
            for(int i = 0 ; i < keyset.size(); i++){
                String deleted = command.replaceAll(keyset.get(i),"");
                int count = command.length() - deleted.length();
                command = deleted;
                score += count * commands.get(keyset.get(i));
            }
            score += command.length();
            max = Math.max(max, score);
            // }
            
            return max;
            
        }
        
        
        static LinkedHashMap<String, Integer> sortByValue(Map<String, Integer> map) {
            List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
            Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
            
            LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : entries) {
                result.put(entry.getKey(), entry.getValue());
            }
            return result;
        }
        
    }
    