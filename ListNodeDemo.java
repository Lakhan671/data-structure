package interviewquestion;

public class ListNodeDemo {
    public static void main(String[] args) {
        int[] a = {7, 5, 6, 3, 4, 1, 2, 9, 11};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int p = i, q = i + 1;
                while (true) {
                    q++;
                    if (a[p] < a[q]) {
                        a[p] = a[q];
                        break;
                    }
                }
            } else
                a[i] = a[i + 1];
        }
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
    }
}
