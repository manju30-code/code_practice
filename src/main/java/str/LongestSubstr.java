package str;

public class LongestSubstr {
    public int lengthOfLongestSubstring(String s) {
        String temp = "";
        int maxLen = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!temp.contains(String.valueOf(c))){
                temp += c;
                maxLen = Math.max(maxLen, temp.length());
            }
            else{
                temp = temp.substring(temp.indexOf(String.valueOf(c))+1);
                temp += c;
            }

            System.out.println(temp);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "bbbbb";
        LongestSubstr ls = new LongestSubstr();
        System.out.println(ls.lengthOfLongestSubstring(s));
    }
}
