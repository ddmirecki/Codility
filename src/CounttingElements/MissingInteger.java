package CounttingElements;

/**
 * Created by Daniel on 2017-05-01.
 */
public class MissingInteger {

    public int solution(int[] A) {
        int tester = 1;
        int sol = 0;
        boolean found = true;
        boolean exists = true;
        while(found) {
            for (int u : A) {
                if (u > 0 && u == tester) {
                    exists = true;
                    break;
                }else if(u>0 && u!=tester){
                    exists = false;
                }
            }
            if(exists == true){
                tester++;
            }else if(exists ==false){
                sol = tester;
                found = false;

            }
        }
        return sol;
    }
}
