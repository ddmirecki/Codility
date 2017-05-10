package TimeComplexity;

import java.util.Arrays;

/**
 * Created by Daniel on 2017-04-30.
 */
public class PermMissingElement {

    public int solution(int[] A) {
        Arrays.sort(A);
        int solution = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if ((A[i]+1) != A[i + 1]) {
                solution = i+2;
            }
        }
        return solution;
    }
}
