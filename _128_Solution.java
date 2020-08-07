package interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _128_Solution {
    public int longestConsecutive(int[] nums) {
        int c=0;
        List integers= IntStream.of(nums).boxed().collect(Collectors.toList());
        Collections.sort(integers);

        try {

            for(int i=0;i<integers.size();i++){
                if (integers.get(i).equals(integers.get(i)))
                    if(integers.get(i).equals(integers.get(i+1))){
                        c++;
                    }
            }

        }catch (Exception r){

        }
return c==0 && integers.size()<1?0:(integers.size()==1?1:c);   }

    public static void main(String[] args) {
     int[] array={100,4,200,1,3,2};

        System.out.println(new _128_Solution().longestConsecutive(array));
    }
}
