package CounttingElements;

/**
 * Created by Daniel on 2017-05-02.
 */
public class PermCheck {

    public int solution(int[] A) {
        int solution = 1;
        int checker = 1;
        boolean searching = true;
        while (searching && checker <= A.length) {
            for (int i : A) {
                if (i == checker) {
                    searching = true;
                    solution = 1;
                    break;

                } else {
                    searching = false;
                    solution = 0;
                }
            }
            checker++;

        }
        return solution;
    }
}
