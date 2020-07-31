package interviewquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MainDemo {
    public static void main(String[] args) throws IOException {
        long bn1, bn2;
        int k = 0, carry = 0;
        int[] sum = new int[15];
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            String[] s=line.split(",");
             bn1=Long.valueOf(s[0]);
             bn2=Long.valueOf(s[1]);
            while (bn1 != 0 || bn2 != 0) {
                sum[k++] = (int)((bn1 % 10 + bn2 % 10 + carry) % 2);
                carry = (int)((bn1 % 10 + bn2 % 10 + carry) / 2);
                bn1 = bn1 / 10;
                bn2 = bn2 / 10;
            }
            if (carry != 0) {
                sum[k++] = carry;
            }
            --k;

            while (k >= 0) {
                System.out.print(sum[k--]);
            }

        }
    }

}
