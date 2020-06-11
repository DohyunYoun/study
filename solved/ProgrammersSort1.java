package solved;
import java.util.Arrays;

public class ProgrammersSort1 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        int[] arr =  new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] comm = new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        solution(arr,comm);
    }
    //     array	            commands                        	return
    // [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int j=0;
        for(int i = 0 ; i < commands.length; i++){
            int[] command = commands[i];
            int point = command[2];
            int start = command[0];
            int size = command[1] - command[0]+1;
            int[] newArr = new int[size];

            // for(int j = start - 1 ; j < end ; j++)
            
            for(int k = 0 ; k<size; k++){
                newArr[k] = array[start-1];
                start++;
            }
            
            Arrays.sort(newArr);
            answer[j] = newArr[point-1];
            j++;
        }
        return answer;




        // int[] answer = new int[commands.length];

        // for(int i=0; i<commands.length; i++){
        //     int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        //     Arrays.sort(temp);
        //     answer[i] = temp[commands[i][2]-1];
        // }

        // return answer;
    }
}
