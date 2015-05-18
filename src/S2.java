/**
 * Created by kbouzidi on 18/05/2015.
 *
 A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

 Your goal is to find that missing element.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given a zero-indexed array A, returns the value of the missing element.

 For example, given array A such that:

 A[0] = 2
 A[1] = 3
 A[2] = 1
 A[3] = 5

 the function should return 4, as it is the missing element.

 Assume that:

 N is an integer within the range [0..100,000];
 the elements of A are all distinct;
 each element of array A is an integer within the range [1..(N + 1)].

 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

 Elements of input arrays can be modified.

 */
public class S2 {


    public static void main(String[] args) {

        int[] A = new int[4];
        A[0] = 5;
        A[1] = 4;
        A[2] = 2;
        A[3] = 1;
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length  > 100000 || A.length<=0 ) {
            return -1;
        }

        if (A.length ==1 && 1 > A[0]){
            return -1;
        }

        int [] s = new int [A.length];

        for (int i = 0; i < A.length; i++) {
            if (A.length - A[i]> 0 && A[i] >0){
                s[A[i]-1]=A[i]  ;
            }

        }


        for (int i = 0; i < A.length; i++) {
            if (s[i]==0){
                return i+1;
            }

        }
        return -1;

    }


}
