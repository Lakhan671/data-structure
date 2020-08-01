package interviewquestion;

import java.util.*;
import java.util.stream.IntStream;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */

public class MedianOfTwoSortedArrays {
    public  double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
    }

    public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
        if (aStart > A.length - 1) {
            return B[bStart + k - 1];
        }
        if (bStart > B.length - 1) {
            return A[aStart + k - 1];
        }
        if (k == 1) {
            return Math.min(A[aStart], B[bStart]);
        }

        int aMid = Integer.MAX_VALUE;
        int bMid = Integer.MAX_VALUE;
        if (aStart + k / 2 - 1 < A.length) {
            aMid = A[aStart + k / 2 - 1];
        }
        if (bStart + k / 2 - 1 < B.length) {
            bMid = B[bStart + k / 2 - 1];
        }

        if (aMid < bMid) {
            return getkth(A, aStart + k / 2, B, bStart, k - k / 2);// Check: aRight + bLeft
        } else {
            return getkth(A, aStart, B, bStart + k / 2, k - k / 2);// Check: bRight + aLeft
        }
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays=new MedianOfTwoSortedArrays();
        int[] a={1,2};
        int[] b={3,4};
        //System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(a,b));
        System.out.println(sortCut(a,b));;
    }
    public static double sortCut(int[]A,int[]B){
        List<Integer> integers=new ArrayList<>();
       for(int c:A){
           integers.add(c);
       }
       for(int i:B){
           integers.add(i);
       }
        Collections.sort(integers);
        double d;
        int in=(A.length+B.length)/2;
        if(integers.size()%2==0){
           d=(Double.parseDouble(integers.get(in)+"")+Double.parseDouble(integers.get(in-1)+""))/2;

        }else{
         d= Double.parseDouble(integers.get(in)+"");
        }
      return d;
    }
}
