package algorithm.structure;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//https://leetcode.com/problems/last-stone-weight/
public class LeetCode1046 {
    public static void main(String[] args) {
        int[]  stones = new int[]{2,7,4,1,8,1};
        lastStoneWeight(stones);
    }
    public static int lastStoneWeight(int[] stones) {


        //SOLUTION 1 	4 ms	37.1 MB
        //PriorityQueue를 reverOrder하면 Tree구조이기때문에 넣는 순서에 따라 제대로 안됨.
        // 미리 stones를 역순 정렬해놓고 넣으면 됨.
        //단 같은 값이 2개 들어있는 큐({1,1})일경우, while문에서 둘다 poll되서 이후 NullPointException이 날 수 있기때문에 리턴할때 체크해야함.
      /*
        Arrays.sort(stones);
        int size = stones.length;
        int[] finalStones = stones;
        stones = IntStream.range(0,size).map(i -> finalStones[size-i-1])
                .toArray();

        Queue<Integer> nums = new PriorityQueue<>(Comparator.reverseOrder());
        for (int st : stones) {
            nums.offer(st);
        }

        while(nums.size() > 1){
            int heaviestA = nums.poll();
            int heaviestB = nums.poll();
            if(heaviestA != heaviestB){
                nums.offer(heaviestA-heaviestB);
            }
        }


        return nums.isEmpty()?0:nums.poll();
        */

        //SOLUTION 2 4 ms	38.8 MB
        Queue<Integer> nums = new PriorityQueue<>(Comparator.reverseOrder());
        for (int st : stones) {
            nums.offer(st);
        }
        while(nums.size()>1){
            nums.offer(nums.poll()-nums.poll());
        }
        return nums.poll();
    }
}
