import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ProgrammersDBFS3 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        

        String[] w = {"hot", "dot", "dog", "lot", "log", "cog"};
       System.out.println("result = "+ solution("hit","cog",w));
    }
    
    public static boolean compare(String a, String b) {
        int answer = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i))
                answer++;
        }
        if (answer == a.length() - 1)
            return true;
        return false;
    }

    static boolean[] check;
    static String text;
    static int result = 0;

    static public boolean compareWords(String word, String target) {
        int changeCount = 0;
        for (int i = 0; i < target.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) {
                changeCount += 1;
            }
        }
        // System.out.println("===> " + word);
        // System.out.println("===> " + target);
        // System.out.println("===> " + changeCount);
        if (changeCount == 1) {
            return true;
        } else {
            return false;
        }
    }

    static public void showBfs(String begin, String target, String[] words) {
        if (compareWords(text,target)) {
            text = target;
            result += 1;
            return;
        }

        for (int m = 0; m < words.length; m++) {
            if (check[m] == false && compareWords(text, words[m])) {
                text = words[m];
                check[m] = true;
//                System.out.println("---> " + words[m]);
                // System.out.println("---> " + result);
                result += 1;
                break;
            }
        }
    }


    static int solution(String begin, String target, String[] words) {
      
        int answer = 0;
        check = new boolean[words.length];
        text = begin;

           
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));

        if (!list.contains(target))
            return 0;


       while (!text.equals(target)) {
           showBfs(text, target, words);
       }

        answer = result;
        return result;
      
        // int answer = 0;

        
        // ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));

        // if (!list.contains(target))
        //     return answer;

        // while (begin != target) {
        //     //다 똑같을 경우==마지막에 여기서 빠져나옴
        //     if (compare(begin, target)) {
        //         begin = target;
        //         answer++;
        //         break;
        //     }
        //     for (String word : list) {
        //         if (compare(begin, word)) {
        //             begin = word;
        //             list.remove(word);
        //             answer++;
        //             break;
        //         }
        //     }

        // }

        // return answer;



        //USING BFS
        // if (!Arrays.asList(words).contains(target)) {
        //     return 0;
        // }

        // int answer = 0;
        // Queue<String> q = new LinkedList<>();
        // q.offer(begin);
        // boolean[] visit = new boolean[words.length];

        // find : while (true) {
        //     int size = q.size();

        //     for (int i = 0; i < size; i++) {
        //         String word = q.poll();
        //         if (word.equals(target)) {
        //             break find;
        //         }

        //         for (int j = 0; j < words.length; j++) {
        //             if (!visit[j] && compare(word, words[j])) {
        //                 q.offer(words[j]);
        //                 visit[j] = true;
        //             }
        //         }
        //     }

        //     answer++;
        // }

        // return answer;
    }
    
    
}
