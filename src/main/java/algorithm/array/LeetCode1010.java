package algorithm.array;

public class LeetCode1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int answer = 0;
        int[] duration = new int[61];
        for (int t : time) {
            int remainTime = t % 60;
            int needTime = (remainTime == 0) ? 0 : 60 - remainTime;
            answer += duration[needTime];
            duration[remainTime] += 1;
        }
        return answer;
    }
    //timeout
    /*
    public int numPairsDivisibleBy60(int[] time) {
        int answer = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                int duration = time[i] + time[j];
                if (duration % 60 == 0)
                    answer++;
            }
        }
        return answer;
    }
    */
}
