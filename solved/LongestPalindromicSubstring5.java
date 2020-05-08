
public class LongestPalindromicSubstring5 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        longestPalindrome("accabacca");
    }
    static boolean isPalindrome(String str, int startIndex, int endIndex) {
        for(int i = startIndex, j = endIndex; i <= j; i++, j--) 
                if (str.charAt(i) != str.charAt(j)) 
                    return false;
        return true;
    }
    
    static String longestPalindrome(String s) {
        int n = s.length();
        int longestLen = 0;
        int longestIndex = 0;
        
        for(int currentIndex = 0; currentIndex < n; currentIndex++) {
            if(isPalindrome(s,currentIndex - longestLen, currentIndex)){
                longestLen += 1;
                longestIndex = currentIndex;
                // longestIndex = currentIndex-longestLen;
                // longestLen+=1;

            } else if(currentIndex - longestLen - 1 >= 0 && 
                      isPalindrome(s, currentIndex - longestLen - 1, currentIndex)) {
                longestLen += 2;
                longestIndex = currentIndex;
                // longestIndex=currentIndex-longestLen-1;
                // longestLen+=2;
            }	
        }
        longestIndex++;
        return s.substring(longestIndex - longestLen, longestIndex);


      /* 
        String[] str = s.split("");
        String result="";
        String tmp=str[0];
        // String chk = str[0];
        int pos = 0;
        int chk = 0;
        
        ArrayList<String> wait = new ArrayList<>();
        HashMap<String, Integer> dup = new HashMap<>();
        
        
        for(int i = 0 ; i < str.length ; i ++){
            if(dup.containsKey(str[i])){
                wait.add(str[i]);
            }else{
                dup.put(str[i], 1);
            }
        }
        while(wait.size()!=0){
            for(int i = 1 ; i < str.length ; i ++){
                tmp+=str[i];
                if(str[i].equals(wait.get(0))){
                    if(chkPalindrom(str, pos,i) && result.length()<tmp.length()){
                        result=tmp;
                        tmp="";
                        // chk = str[i];
                        pos = i;
                    }
                }
            }
            wait.remove(wait.get(chk));
        }
        
        return result;
         */
    }
    /* 
    static  boolean chkPalindrom( String[] str, int first, int last){
        
        
        if(first==last ){
            return true;
        }
        if(first == last-1 ){
            if( str[first].equals(str[last]))
            return true;
            else 
            return false;
        }
        
        return str[first].equals(str[last]) && chkPalindrom(str, ++first, --last);
    }
     */
}
