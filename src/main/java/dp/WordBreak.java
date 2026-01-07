package dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class WordBreak {
    int[] status;
    public boolean wordBreak(String s, List<String> wordDict) {
        status = new int[s.length()];
        Arrays.fill(status, -1);
        Set<String> dict = new HashSet<>(wordDict);
        return wordBreakHelper(s, dict,  0 );
    }


    public boolean wordBreakHelper(String s, Set<String> wordDict, int start) {

        if(start == s.length())
            return true;

        if (status[start] != -1) {
            return status[start] == 1;
        }

        for(int i = start+1; i <= s.length(); i++){
            String left = s.substring(start,i);
            if(wordDict.contains(left) && wordBreakHelper(s, wordDict,i)){
                status[start] = 1;
                return true;
            }
        }
        status[start] = 0;
        return false;
    }

    public static void main (String[] args){
        String testString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\"";
        List<String> wordDict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        /*String testString = "leetcode";
        List<String> wordDict = Arrays.asList("leet","code");*/
        boolean result = new WordBreak().wordBreak(testString, wordDict);
        System.out.println("Can break: " + result);
    }
}