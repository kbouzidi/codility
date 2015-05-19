/**
 * Created by kbouzidi on 19/05/2015.
 * <p/>
 * <p/>
 * A non-empty zero-indexed array A consisting of N integers is given.
 * <p/>
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * <p/>
 * For example, array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * <p/>
 * is a permutation, but array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * <p/>
 * is not a permutation, because value 2 is missing.
 * <p/>
 * The goal is to check whether array A is a permutation.
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int[] A); }
 * <p/>
 * that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
 * <p/>
 * For example, given array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * <p/>
 * the function should return 1.
 * <p/>
 * Given array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * <p/>
 * the function should return 0.
 * <p/>
 * Assume that:
 * <p/>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 * <p/>
 * Complexity:
 * <p/>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * <p/>
 * Elements of input arrays can be modified.
 */
public class S4 {

    public static void main(String[] args) {

        int[] A = new int[4];
        A[0] = 4;
        A[1] = 3;
        A[2] = 2;
        A[3] = 1;
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        if (A.length > 100000 || A.length <= 0) {
            return 0;
        }

        int cpt = 0;
        int[] solution = new int[A.length];

        if (A.length == 1 && 1 == A[0]) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length) {
                return 0;
            }
            if (A[i] > 10000000 || A[i] <= 0) {
                return 0;
            } else {
                solution[A[i] - 1] = A[i];
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (solution[i] == 0) {
                return 0;
            }

            if (solution[i] == i + 1) {
                cpt++;
            } else {
                return 0;
            }

        }
        if (cpt == A.length) {
            return 1;
        }
        return 0;


    }
}
