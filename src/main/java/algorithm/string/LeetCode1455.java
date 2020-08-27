package algorithm.string;



public class LeetCode1455 {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentences = sentence.split(" ");
        for(int i = 0; i < sentences.length; i ++){
            if(sentences[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }


    //TIME : O(N)
    //SPACE : O(1)
    public int solution(String sentence, String searchWord){
        int idx = 1;
        if (sentence.startsWith(searchWord)) {
            return idx;
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                idx++;
                if (sentence.startsWith(searchWord, i + 1)) {
                    return idx;
                }
            }
        }

        return -1;
    }

}
