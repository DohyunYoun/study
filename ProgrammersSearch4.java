import java.util.HashSet;
import java.util.Set;

public class ProgrammersSearch4 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        solution(10,2);
    }
    static int[] solution(int brown, int red) {
        //(result[0]*2 + result[1]*2) - 4 = brown 개수
        //result[0]-2 X result[1]-2 == red의 가로세로
        //red가로 *2 = red세로*2 + 4 = brown 개수

        //가로가 같거나 더 길다.
        //row*2 + column*2 = brown+4;
            //row = ((brown+4)-2column)/2
        //(row-2)*(column-2) = red
            //(((brown+4)-2column)/2-2)*(column-2) = red
            //{(brown/2)-column}*(column-2) = red
            //{(brown/2)*(column-2)}-{column*(column-2)} = red
            //{(brown/2)*(column-2)} - column^2 + 2column = red
            //{(brown/2)*(column-2)} - column(column-2) = red
            //(brown/2) - column = red/(column-2)

            //column = (brown/2)-{red/(column-2)}
            //column + {red/(column-2)} = brown/2
            //(column+red) / (2column-2) = brown/2

            //column = (brown-1) / (brown+red);

            int column = (brown-1) / (brown+red);
            int row = ((brown+4)-(column*2))/2;
            return new int[]{column, row};





    }
}
