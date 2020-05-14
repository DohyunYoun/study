public class ExcelSheetColumnNumber171{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    
    static int titleToNumber(String s) {
        int res = 0;
        //한자리 수의 알파벳 수는 26자
        //예 : BCD = (2*26*26)+(3*26)+4
        for (char c : s.toCharArray()) {
            res *= 26;
            res += c - 'A' + 1; //알파벳을 숫자로 변환
        }
        return res;
    }
}
