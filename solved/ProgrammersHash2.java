import java.util.Arrays;
import java.util.HashMap;

public class ProgrammersHash2 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        String[] test = {"12", "123", "1235", "567", "88"};
        System.out.println("result is "+ solution(test));
        
    }
    static boolean solution(String[] phone_book) {
        boolean answer = true;
        // //["12", "123", "1235", "567", "88"]
        
        //효율성면에서, answer에 값을 넣는것보다 바로 return하는 것이 좋음.(하나라도 false면 false이기 때문에)
        //contains로 하게되면, 중간값도 비교될 수 있기 때문에, startsWith사용
        for (int i = 0 ; i<phone_book.length-1 ; i++){
            for(int j = i+1 ; j < phone_book.length ; j++){
                if(phone_book[j].startsWith(phone_book[i])){
                    answer = false;
                }
                if(phone_book[i].startsWith(phone_book[j])){
                    answer = false;
                }
            }
        }


        //동작하는지 확인 필요
        // Arrays.sort(phoneBook);
        // boolean result = true;
        // for (int i=0; i<phoneBook.length-1; i++) {
        //     if (phoneBook[i+1].startsWith(phoneBook[i])) {
        //         result = false;
        //         break;
        //     }
        // }
        // return result;



    }
}
