package interviewquestion;

public class PalindromeDemo {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}
