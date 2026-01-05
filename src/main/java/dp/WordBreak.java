package dp;

import java.util.Arrays;
import java.util.List;

class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {

        return false;
    }

    public static void main (String[] args){
        String testString = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean result = wordBreak(testString, wordDict);
        System.out.println("Can break: " + result);
    }
}