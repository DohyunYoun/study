package solved;
import java.util.HashSet;
import java.util.Set;

public class ProgrammersSearch3 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        solution(new int[][]{{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}});
    }
    static int solution(int[][] baseball) {

        //testcase 9 : 통과 (129.14ms, 93.5MB) >> 성능이 매우 안좋음...
        int answer = 0 ; 
        for(int i = 123; i<=987;i++){
            String[] tmp = Integer.toString(i).split("");
            boolean flag = true;
            
            //같은 숫자가 포함될 수 없음.
            if(tmp[0].equals(tmp[1]) || tmp[1].equals(tmp[2])||tmp[0].equals(tmp[2])){
                continue;
            }
            //0이 들어갈 수 없음.
            if(tmp[0].equals("0")||tmp[1].equals("0")||tmp[2].equals("0")){
                continue;
            }

            for(int j = 0 ; j<baseball.length ; j++){
                int strike=0, ball = 0;
                //a : 입력된 배열의 자리수
                //b : 정답 배열의 자리수
                for(int a  = 0 ; a < 3 ; a++){
                    for (int b = 0 ; b < 3 ; b++){
                        //세자리 수를 가져옴.
                        String[] num = Integer.toString(baseball[j][0]).split("");
                        if(a==b && tmp[a].equals( num[b])){
                            strike++;
                        }else if(tmp[a].equals(num[b])){
                            ball++;
                        }
                    }
                }
                //한 숫자를 다 살펴봄
                if(strike!= baseball[j][1] || ball!=baseball[j][2]){
                    flag = false;
                }
            }
            if(flag){
                answer++;
            }
            
        }

        return answer;
    }
}
