package PrefixSums;

/**
 * Created by Daniel on 2017-05-04.
 */
public class CountDiv {

    public int solution(int A, int B, int K) {
        int solution = 0;
        int podzielny = 0;

        if(B == 0 || A == B){
            solution = 0;
            return solution;
        }

        if(A > 0 && A % K == 0){
            podzielny = A;
        }else if(A > 0){
            podzielny = ((A/K) + 1)*K;
        }

        solution = ((B-podzielny)/K) +1;

        return solution;
    }
}
