package tasks;

/**
 * Created by khalil on 22/05/15.
 */
public class Task1 {
    public static void main(String[] args) {

        int[] A = new int[7];
        /* A[0] = 2;
        A[1] = 2;
        A[2] = 5;
        A[3] = 5;
        A[4] = 5;
        A[5] = 4;*/
        A[0] = 5;
        A[1] = 5;
        A[2] = 1;
        A[3] = 7;
        A[4] = 2;
        A[5] = 3;
        A[6] = 5;
        System.out.println(solution(5, A));
    }

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8

        int cptk = 0, cptKMin = 0;
        // The range [1..100,000]
        if (A.length > 100000 || A.length < 1) {
            // The minimal positive integer
            return -1;
        }

        // The range [1..100,000]
        if (X > 100000 || A.length < 0) {
            // The minimal positive integer
            return -1;
        }


        for (int i = 0; i < A.length; i++) {
            // Element range [0..100,000]
            if (A[0] > 100000 || A[0] < 0 || A[0] > 100000 || A[0] < 0) return -1;

            cptKMin = 0;
            if (X == A[i] ) {
                cptk++;
            }
            for (int j = i; j < A.length; j++) {
                if (X != A[j]) {
                    cptKMin++;

                }

            }
            System.out.println(cptk + " , " + cptKMin);

            if (cptk == cptKMin && X == A[0]) return i;
            if (cptk == cptKMin) return i + 1;


        }

        return -1;
    }
}
