package interviewquestion;

import java.util.ArrayList;
import java.util.List;


public class CommonChars {
    public static void main(String[] args) {
        String[] ss= {"cool","lock","cook"};
        System.out.println(new CommonChars().commonChars(ss));
    }
    public List<String> commonChars(String[] A) {
        List<String> ss=new ArrayList<>();
        int cc=0;
        for(char c:A[0].toCharArray()){
            for(String a:A){
               if(a.contains(String.valueOf(c))){
                   cc++;
               }
            }
            if(cc==A.length && !ss.contains(String.valueOf(c))){
                ss.add(String.valueOf(c));
            }
            cc=0;
        }
 return ss;
    }
}
