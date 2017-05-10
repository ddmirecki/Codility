package Arrays;

/**
 * Created by Daniel on 2017-04-28.
 */
public class CyclicRotation {

    public int[] solution(int[] Arr, int K) {
        int[] rotated = new int[Arr.length];
        if (Arr.length == 0) {
            return Arr;
        }else if(Arr.length == 1){
            return Arr;
        }else{
            for (int i = 0; i < Arr.length - K; i++) {
                rotated[i + K] = Arr[i];
//            rotated[i] = Arr[Arr.length-K];

            }
            for (int i = 0; i < K; i++) {
                rotated[i] = Arr[Arr.length - (K - i)];
            }
        }return rotated;
    }
}
