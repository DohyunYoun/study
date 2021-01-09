package algorithm.graph;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/all-paths-from-source-to-target/
public class LeetCode797 {

    static int[][] graph;
    static int LEN;

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        LEN = graph.length;

        List<Integer> sublist = new ArrayList<>();
        sublist.add(0);
        acyclicGraph(sublist, graph[0]);

        return result;
    }

    void acyclicGraph(List<Integer> sublist, int[] destination) {
        List<Integer> currentList = new ArrayList<>(sublist);
        for (int value : destination) {
            currentList.add(value);

            if (value == LEN - 1)
                result.add(currentList);
            else
                acyclicGraph(currentList, graph[value]);

            currentList = new ArrayList<>(sublist);
        }
    }
}
