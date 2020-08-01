package algorithm.string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LeetCode49Test {

    LeetCode49 problem = new LeetCode49();
    @Test
    public void groupAnagrams() {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        tmp.add("bat");
        expected.add(tmp);
        tmp = new ArrayList<>();
        tmp.add("nat");
        tmp.add("tan");
        expected.add(tmp);
        tmp = new ArrayList<>();
        tmp.add("ate");
        tmp.add("eat");
        tmp.add("tea");
        expected.add(tmp);
        List<List<String>> actual = problem.groupAnagrams(input);
        assertEquals(expected,actual);
    }
}