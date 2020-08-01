package algorithm.greedy;

import java.util.Arrays;

//https://leetcode.com/problems/queue-reconstruction-by-height/
public class LeetCode406 {
    public int[][] reconstructQueue(int[][] people) {

        //My SOLUTION 17 ms	40.4 MB
        int len = people.length;
        int[][] result = new int[len][2];
        for(int i = 0; i < len; i++){
            result[i][0] = -1;
            result[i][1] = -1;
        }
        Arrays.sort(people, ((o1, o2) -> o1[0]-o2[0]));
        for(int i = 0; i < len; i ++){
            int h = people[i][0]; //value
            int k = people[i][1];
                for(int l = 0; l < len; l++){
                    int value = result[l][0];
                    if(value == -1 &&  result[l][1] == -1){ //can input
                        if(k == 0){
                            result[l] = people[i];
                            break;
                        } else
                            k--;
                    }else{
                        if(value>=h){
                            k--;
                        }
                    }
            }
        }
        return result;

        //SOLUTION 7 ms	40.4 MB
//        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
//        List<int[]> list = new LinkedList<>();
//        for (int[] p : people) {
//            list.add(p[1], p);
//        }
//        return list.toArray(new int[list.size()][]);
    }

}
