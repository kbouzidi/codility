/**
 * Created by kbouzidi on 21/05/2015.
 * A zero-indexed array A consisting of N integers is given. An equilibrium index of this array is any integer P such that 0 ≤ P < N and the sum of elements of lower indices is equal to the sum of elements of higher indices, i.e.
 * <p/>
 * A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].
 * <p/>
 * Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.
 * <p/>
 * For example, consider the following array A consisting of N = 8 elements:
 * <p/>
 * A[0] = -1
 * A[1] =  3
 * A[2] = -4
 * A[3] =  5
 * A[4] =  1
 * A[5] = -6
 * A[6] =  2
 * A[7] =  1
 * <p/>
 * P = 1 is an equilibrium index of this array, because:
 * <p/>
 * A[0] = −1 = A[2] + A[3] + A[4] + A[5] + A[6] + A[7]
 * <p/>
 * P = 3 is an equilibrium index of this array, because:
 * <p/>
 * A[0] + A[1] + A[2] = −2 = A[4] + A[5] + A[6] + A[7]
 * <p/>
 * P = 7 is also an equilibrium index, because:
 * <p/>
 * A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0
 * <p/>
 * and there are no elements with indices greater than 7.
 * <p/>
 * P = 8 is not an equilibrium index, because it does not fulfill the condition 0 ≤ P < N.
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int[] A); }
 * <p/>
 * that, given a zero-indexed array A consisting of N integers, returns any of its equilibrium indices. The function should return −1 if no equilibrium index exists.
 * <p/>
 * For example, given array A shown above, the function may return 1, 3 or 7, as explained above.
 * <p/>
 * Assume that:
 * <p/>
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * <p/>
 * Complexity:
 * <p/>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 */
public class SExemple {

    public static void main(String[] args) {
        // System.out.println("Hello World");

        int[] A = new int[8];
        A[0] = -1;

        A[1] = 3;
        A[2] = -4;
        A[3] = 5;
        A[4] = 1;
        A[5] = -6;
        A[6] = 2;
        A[7] = 1;

       /* A[0] = -1;

        A[1] = 10;
        A[2] = -4;
        A[3] = 5;*/


        System.out.println(solution(A));
        System.out.println("solution (A)");
    }

    public static int solution(int[] A) {

        // The range [0..100,000]
        if (A.length > 100000 || A.length <= 0) {

            return -1;
        }


        if (A.length == 1) {
            // Element range [−2,147,483,648..2,147,483,647]
            if (A[0] > 2147483647 || A[0] < -2147483647 || A[0] > 2147483647 || A[0] < -2147483647) return -1;
            if (A[0] == 0) return 1;
            return -1;
        }


        long calcA = 0, calcP = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 2147483647 || A[i] < -2147483647 || A[i] > 2147483647 || A[i] < -2147483647) return -1;
            calcA += A[i];
        }

        for (int i = 0; i < A.length; i++) {
            if (calcP == calcA - A[i]) return i;

            calcP += A[i];
            calcA -= A[i];

        }
        return -1;
    }
}
