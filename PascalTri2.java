import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//119
public class PascalTri2{
    public static void main(String[] args) {
        getRow(4);
        System.out.println("Default Main Fuction Sample");
        
    }
    
    static Integer[] curList;
    static int a;
    static  int ct;
    static  int k;
    
    public static List<Integer> getRow(int rowIndex) {
        
        // List<Integer> result = new ArrayList<>();
        // List<Integer> nextLine = new ArrayList<>();
        
        // result.add(1);
        // for(int i = 1 ; i<=rowIndex; i++){
        //     //시작과 끝은 1
        //     nextLine = new ArrayList<>();
        //     for(int j = 0 ; j<result.size(); j++){
        //         if(j ==0){
        //             nextLine.add(1);
        //         }
        //         if(j == result.size()-1){
        //             nextLine.add(1);
        //             result = nextLine;
        //             break;
        //         }
        //         nextLine.add(result.get(j) + result.get(j+1));
        //     }
        // }
        
        // return result;
        
        // SOLUTION 1**(Math)
        Integer[] rowList = new Integer[rowIndex+1];
        rowList[0] = 1;
        for(int i=1; i<rowList.length;i++) {
         rowList[i] = (int)((long)rowList[i-1]*(rowIndex-(i-1))/(i));
        }
        return Arrays.asList(rowList);

        // SOLUTION 2
        // ArrayList<Integer> result = new ArrayList<>(rowIndex + 1);
        // for (int i = 0; i < rowIndex + 1; i++) {
        // result.add(0, 1);
        //   for (int j = 1; j < result.size() - 1; j++) {
        //      result.set(j, result.get(j) + result.get(j + 1));
        //  }
        // }
        // return result;

        // SOLUTION 3
        // ArrayList<Integer> result = new ArrayList<>(rowIndex + 1);
        // for (int i = 0; i < rowIndex + 1; i++) {
        // result.add(1);
        // for (int j = i - 1; j > 0; j--) {
        // result.set(j, result.get(j) + result.get(j - 1));
        // }
        // }

        // return result;

        //SOLUTION 4(Recursive)
        // if (rowIndex == 0) return new ArrayList<>(Arrays.asList(1));
        // List<Integer> lastRow = getRow(rowIndex - 1);
        // List<Integer> newRow = new ArrayList<>();
        // int left = 0;
        // int right = 0;
        // for (int i = 0; i < lastRow.size(); ++i) {
        //     right = lastRow.get(i);
        //     newRow.add(left + right);
        //     left = right;
        // }
        // newRow.add(1);
        // return newRow;

        // if (rowIndex == 0) return Arrays.asList(1);
        // List<Integer> previousList = getRow(rowIndex - 1);
        // List<Integer> thisList = new ArrayList<>();
        // for (int i =0; i < previousList.size(); i++) {
        //     if (i == 0) thisList.add(1);
        //     if (i > 0) thisList.add(previousList.get(i) + previousList.get(i-1));
        //     if (i == previousList.size() -1) thisList.add(1);
        // }
        // return thisList;
    }
}
