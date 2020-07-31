package interviewquestion;

import com.sun.jdi.IntegerValue;

public class ReverseIntegerDemo {
    public static void main(String[] args) {
       int a=2^31;
        System.out.println(new ReverseIntegerDemo().reverse(-1534236460));
    }
    public int reverse(int x) {
        long reversed = 0;
        while (x!= 0) {
            reversed = 10 * reversed + (x % 10);
            x /= 10;
        }
        return (reversed == (int)reversed) ? (int)reversed
                : 0;


    }

}
