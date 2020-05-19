import java.util.HashMap;

public class ProgrammersHash1 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<completion.length; i++){
            map.put(completion[i],map.getOrDefault(completion[i],0)+1);
        }
        
        for(int i = 0 ; i < participant.length;i++){
            if(map.containsKey(participant[i]) && map.get(participant[i])>0){
                map.put(participant[i],map.get(participant[i])-1);
            }else{
                return participant[i];
            }
        }
        return answer;
    }
}
