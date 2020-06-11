package algorithm.graph;

import java.util.ArrayList;

/**
 * Created by DohyunYoun on 2020-06-09
 * SITE : [프로그래머스] 여행경로(https://programmers.co.kr/learn/courses/30/lessons/43164)
 * <p>
 * Used Algorithm : DFS / BFS
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class ProgrammersTravelPath {
    public String[] solution(String[][] tickets) {
        String[] answer = {};

        ArrayList<String> ans = new ArrayList<>();
        ans.add(tickets[0][0]) ;
        ans.add(tickets[0][1]);

        String[] tmp = new String[2];

            for(int i = 1, len = tickets.length ; i < len ; i++){
                for(int k = 0, lenK = ans.size(); k < lenK ; k++){
                    //출발지가 같으면
                    if(ans.get(k).equals(tickets[i][0])){
                        //알파벳 순서대로 넣기
                        if(k == lenK -1){
                            ans.add(k+1,tickets[i][1]);
                            break;
                        }
                        int compare = ans.get(k+1).compareTo(tickets[i][1]);
                        if(compare > 0){
                            //입력된 값이 뒤로가야함.
                            ans.add(k+1,tickets[i][1]);
                            break;
                        }else if (compare == 0){
                            break;
                        }else{
                            //뒤에 입력하면 됨.
                            ans.add(k+2,tickets[i][1]);
                            break;
                        }
                    }else{
                        //끝까지 왔는데도 해당 티켓정보가 없으면 add
                        if(k == lenK-1){
                            ans.add(tickets[i][0]);
                            ans.add(tickets[i][1]);
                        }

                    }
                }
            }
        return ans.toArray(new String[ans.size()]);
    }

}
