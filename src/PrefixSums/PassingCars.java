package PrefixSums;

/**
 * Created by Daniel on 2017-05-04.
 */
public class PassingCars {


    public int solution(int[] A) {
        int solution = 0;
        int tic = 0;
        int ticPos = 0;
        int toe = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == tic) {
                ticPos = i;
                for (int j = ticPos + 1; j < A.length; j++) {
                    if (A[j] == toe) {
                        solution++;
                    }
                }
            }

        }

        if (solution <= 1_000_000_000) {
            return solution;
        } else {
            return -1;
        }

    }
}
