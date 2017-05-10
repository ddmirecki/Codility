package Sorting;

import java.util.Arrays;

/**
 * Created by Daniel on 2017-05-05.
 */
public class MaxProductOfThree {

    public int solution(int[] A) {
        int solution = 0;
        Arrays.sort(A);

        solution = Math.max(A[A.length - 1] * A[A.length - 2] * A[A.length - 3], A[0] * A[1] * A[A.length - 1]);

        return solution;
    }
}
