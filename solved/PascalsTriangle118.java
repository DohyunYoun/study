import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        generate(5);
    }
    
    static List<List<Integer>> generate(int numRows) {
        
        // List<List<Integer>> result = new ArrayList<List<Integer>>();
        // ArrayList<Integer> pre = null;
        // for (int i = 1; i <= numRows; i++) {
        //     ArrayList<Integer> save = new ArrayList<>();
        //     for (int j = 1; j <= i; j++)
        //         if (j == 1 || j == i) save.add(1);
        //         else save.add(pre.get(j-1) + pre.get(j-2));
        //     result.add(save);
        //     pre = save;
        // }
        // return result;

        //위와 비슷하지만 pre를 사용하지 않고 해결 / 더 간결하고 이해하기 쉬운듯.
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < i + 1 ; j++) {
                if(j == 0 || j == i) {
                    list.add(1);
                }
                else {
                    int a = result.get(i - 1).get(j - 1);
                    int b = result.get(i - 1).get(j);
                    list.add(a + b);
                }
            }
            result.add(list);
         }
        return result;


        // List<List<Integer>> ret = new ArrayList<>();
        // for (int i = 0; i < n; i++) {            
            //     ArrayList<Integer> temp = new ArrayList<>();
            
            //     for (int j = 0; j < i; j++) {
                //         List<Integer> prev = ret.get(i-1);
                //         temp.add(prev.get(j) + ((j >= 1) ? prev.get(j-1) : 0));
                //     }
                //     temp.add(1);
                //     ret.add(temp);
                //  }        
                // return ret;  
            }
        }
        