package algorithm;

public class Programmers42842 {
    int red;
    int total;

    //최초값 설정
    double x;
    double y;

    public int[] solution(int brown, int red) {
        this.red = red;
        total = brown + red;

        x = y = Math.floor(Math.sqrt(total));

        find(x, y);

        return new int[]{(int) x, (int) y};
    }

    /**
     * width 를 1씩 늘려가면서 비교
     * - width * height 와 total이 일치할 때
     * - red타일의 개수가 일치하면 끝
     * - 일치하지 않으면 width 는 초기값으로, height는 최초 height-1값으로 세팅하여 다시 실행
     * - total이 더 작을 때
     * - width++
     * - total이 더 클 때
     * - 일치하는 width/height를 구하지 못했음으로 width 는 초기값으로, height는 최초 height-1값으로 세팅하여 다시 실행
     * > 왜냐면, red타일이 1층, 2층, 3층...일 수 있음.
     */
    void find(double width, double height) {
        double currentTotal = width * height;

        if (currentTotal < total) {
            find(++width, height);
        } else if (currentTotal > total) {
            //reset width
            //reduce height
            --y;
            width = x;
            height = y;
            find(width, height);
        } else {
            //currentTotal == total
            if ((width - 2) * (height - 2) == red) {
                x = width;
                y = height;
            } else {
                //reset width
                //reduce height
                --y;
                width = x;
                height = y;
                find(width, height);
            }

        }
    }
}
