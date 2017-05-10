package Arrays;

/**
 * Created by Daniel on 2017-04-28.
 */
public class OddOccurrenciessInArray {

    public int solution(int[] A){
        sort(A);
        int temp = A[0];
        int dubel = A[0];
        int soluion = A[0];
        for (int i = 1; i < A.length-1; i++) {
            if(temp == A[i]){
                dubel = A[i];
            }else{
                temp = A[i];
                if(temp< A[i+1] && temp > A[i-1]){
                    soluion = A[i];
                }

            }

        }

        return soluion;
    }

    public int[] sort(int[] data) {
        int temp;
        boolean elementSwapped = true;
        while (elementSwapped) {
//            elementSwapped = false;
            for (int i = 0; i <= data.length; i++) {
                for (int j = (data.length - 1); j > 0; j--) {
                    if ((data[j - 1]) > data[j]) {
                        temp = data[j - 1];
                        data[j - 1] = data[j];
                        data[j] = temp;
                    }
                }
            }
            return data;
//        Arrays.sort(data);
        }return data;


    }
}
