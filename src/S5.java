/**
 * Created by kbouzidi on 19/05/2015.
 * <p/>
 * <p/>
 * A small frog wants to get to the other side of a river. The frog is currently located at position 0, and wants to get to position X. Leaves fall from a tree onto the surface of the river.
 * <p/>
 * You are given a non-empty zero-indexed array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in minutes.
 * <p/>
 * The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X.
 * <p/>
 * For example, you are given integer X = 5 and array A such that:
 * <p/>
 * A[0] = 1
 * A[1] = 3
 * A[2] = 1
 * A[3] = 4
 * A[4] = 2
 * A[5] = 3
 * A[6] = 5
 * A[7] = 4
 * <p/>
 * In minute 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int X, int[] A); }
 * <p/>
 * that, given a non-empty zero-indexed array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
 * <p/>
 * If the frog is never able to jump to the other side of the river, the function should return −1.
 * <p/>
 * For example, given X = 5 and array A such that:
 * <p/>
 * A[0] = 1
 * A[1] = 3
 * A[2] = 1
 * A[3] = 4
 * A[4] = 2
 * A[5] = 3
 * A[6] = 5
 * A[7] = 4
 * <p/>
 * the function should return 6, as explained above.
 * <p/>
 * Assume that:
 * <p/>
 * N and X are integers within the range [1..100,000];
 * each element of array A is an integer within the range [1..X].
 * <p/>
 * Complexity:
 * <p/>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(X), beyond input storage (not counting the storage required for input arguments).
 * <p/>
 * Elements of input arrays can be modified.
 */
public class S5 {
    public static void main(String[] args) {

        int[] A = new int[1];
        A[0] = 1;
        /*A[1] = 3;
        A[2] = 1;
        A[3] = 4;
        A[4] = 2;
        A[5] = 3;
        A[6] = 5;
        A[7] = 4;*/
        System.out.println(solution(1, A));
    }

    public static int solution(int X, int[] A) {
        if (A.length > 100000 || A.length <= 0 || X > 100000 || X <= 0) {
            return -1;
        }

        if (A.length == 1 && X == A[0]) {
            return 0;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 100000 || A[i] <= 0) {
                return -1;
            }
            if (A[i] == X) {
                return i;
            }
        }

        return -1;
    }

}
