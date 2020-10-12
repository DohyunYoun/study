package algorithm.implementation;

import java.util.*;

public class Programmers42888 {
    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();
        Map<String, String> records = new HashMap<>();
        for (String s : record) {
            //대량 처리시 split보다 StringTokenizer이 runtime이 적게 나옴
            //ex) test28 : 257.79ms vs 384.26ms
            StringTokenizer st = new StringTokenizer(s, " ");
            String command = st.nextToken();
            if (command.equals("Enter") || command.equals("Change"))
                records.put(st.nextToken(), st.nextToken());
        }
        for (String s : record) {
            StringTokenizer st = new StringTokenizer(s, " ");
            String command = st.nextToken();
            String nickname = st.nextToken();

            StringBuilder sb = new StringBuilder();
            sb.append(records.get(nickname));
            sb.append("님이 ");
            if (command.equals("Enter")) {
                sb.append("들어왔습니다.");
            } else if (command.equals("Leave")) {
                sb.append("나갔습니다.");
            } else {
                continue;
            }
            answer.add(sb.toString());
        }
        return answer.toArray(new String[answer.size()]);
    }
}
