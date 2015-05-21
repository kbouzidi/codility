/**
 * Created by kbouzidi on 21/05/2015.
 *
 *

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer that does not occur in A.

 For example, given:

 A[0] = 1
 A[1] = 3
 A[2] = 6
 A[3] = 4
 A[4] = 1
 A[5] = 2

 the function should return 5.

 Assume that:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

 Elements of input arrays can be modified.


 */


/**
 * Test cases
 *  [1,2,3,4]
 *   [-1, -3, -6, -4, -1, -2]
 *    [1, 3, 6, 4, -1, 2]
 *     [5,2,1,0,-1, -2,-3,-4,-2147483647]
 *     [5, 2, 1, 0, -1, -2, -4]
 *    [1, 2, 3, 4, 2147483647]
 *    [3]
 */

import java.util.Arrays;

public class S6 {

    public static void main(String[] args) {

        int[] A = new int[6];
        A[0] = -1;
        A[1] = -3;
        A[2] = 0;
        A[3] = -4;
        A[4] = -2147483647;
        A[5] = -2;
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {

        // The range [1..100,000]
        if (A.length > 100000 || A.length < 1) {
            // The minimal positive integer
            return 1;
        }

        // Element range [−2,147,483,648..2,147,483,647]
        if (A[0] > 2147483647 || A[0] < -2147483647 || A[0] > 2147483647 || A[0] < -2147483647) return 1;

        // One element test case
        if (A.length == 1 && A[0] == 1) {
            return A[0] + 1;
        } else if (A[0] <= 0) {
            return 1;
        }

        Arrays.sort(A);

        int result = 1;

        for (int i = 1; i < A.length; i++) {

            if (A[i] > 2147483647 || A[i] < -2147483647 || A[i] > 2147483647 || A[i] < -2147483647) return 1;

            if (A[i] != A[i - 1] && A[i] - A[i - 1] != 1) {

                if (A[i] - 1 <= 0 && A[A.length - 1] > 0) {
                    result = 1;
                }

                result = A[i - 1] + 1;
            }

        }

        return result;
    }
}
