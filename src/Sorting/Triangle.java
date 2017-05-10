package Sorting;

import java.util.Arrays;

/**
 * Created by Daniel on 2017-05-04.
 */
public class Triangle {

    public int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return 1;
            }
        }
        return 0;

    }
}
