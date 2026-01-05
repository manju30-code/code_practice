package dp;

import java.util.Arrays;
import java.util.List;

class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict, int start, int [] status) {

        if(start == s.length())
            return true;

        if (status[start] != 0) {
            return status[start] == 1;
        }

        for(int i = start+1; i <= s.length(); i++){
            String left = s.substring(start,i);
            if(wordDict.contains(left) && wordBreak(s, wordDict,i,status)){
                return status[start] == 1;
            }
        }
        return status[start] == 0;
    }

    public static void main (String[] args){
        String testString = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "cat","sand","dog");
        int [] status = new int[testString.length()];
        int start = 0;
        boolean result = wordBreak(testString, wordDict,start,status);
        System.out.println("Can break: " + result);
    }
}