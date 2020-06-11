
package solved;
import java.util.HashMap;

public class ProgrammersHash3 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        String[][] test = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "headgear"}, {"green_turban", "headgear"}};

        System.out.println("value is "+solution(test));
    }

// [[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]]	5
//3,2 / 3!/2+2! = 5
// [[crow_mask, face], [blue_sunglasses, face], [smoky_makeup, face]]	3
//3,1 / 3/1+1 ???? 1일때는 다르게??


    static int solution(String[][] clothes) {

        HashMap<String,Integer> category = new HashMap<>();

        int cat = 0;
        int clo = clothes.length;
        
        int cloValue = 1;
        int catValue = 1;

        for(int i = 0 ; i < clothes.length;i++){
            for(int j = 0 ; j<clothes[i].length;j++){
                category.put(clothes[i][j],1);
            }
        }
        cat = category.size() - clo;

        //(clo! / cat!) + cat!
        //if cat == 1 { clo!/cat! }
        for(int i = clo ; i > 0;i--){
            cloValue*=i;
        }
        
        for(int i = cat ; i>0;i--){
            catValue*=i;
        }

        if(cat==1){
            return cloValue/catValue;
        }else{
            return (cloValue/catValue) + catValue;
        }

    }
}
