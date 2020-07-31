package interviewquestion;

import java.util.Set;
import java.util.TreeSet;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
    static String  longestPalindrome(String s){
        Set<String> set=new TreeSet();
        String str="";

            for(int i=0;i<s.length();i++){
                str=str+s.charAt(i);
                if(str.trim().equals(new StringBuilder(str.trim()).reverse().toString()) && str.trim().length()>1){
                    set.add(str);
                }else{

                }
            }


        System.out.println(set);
        return "";
    }
}
