package interviewquestion;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord(" "));

    }
    public int lengthOfLastWord(String s) {
       if(null==s || s.trim().isEmpty() ){
           return 0;
       }
       String[] ss=s.split("\\s++");
        System.out.println(ss);
       return ss[ss.length-1].length();
    }
}
