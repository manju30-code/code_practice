package dp;

import java.util.Arrays;
import java.util.List;

class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict, int start, int [] status) {

        if(start == s.length())
            return true;

        if (status[start] != 0) {
            return true;
        }

        for(int i = start+1; i <= s.length(); i++){
            String left = s.substring(start,i);
            if(wordDict.contains(left) && wordBreak(s, wordDict,i,status)){
                status[start] = 1;
                return true;
            }
        }
        status[start] = 0;
        return false;
    }

    public static void main (String[] args){
        String testString = "applepenapple";
        List<String> wordDict = Arrays.asList("apple","pen");
        /*String testString = "leetcode";
        List<String> wordDict = Arrays.asList("leet","code");*/
        int [] status = new int[testString.length()];
        int start = 0;
        boolean result = wordBreak(testString, wordDict,start,status);
        System.out.println("Can break: " + result);
    }
}