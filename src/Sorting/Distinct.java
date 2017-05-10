package Sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Daniel on 2017-05-04.
 */
public class Distinct {

    public int solution(int[] A){
        int solution = 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length ; i++) {
            if(!set.contains(A[i])){
                set.add(A[i]);
            }
        }
        solution = set.size();


        return solution;
    }
}
