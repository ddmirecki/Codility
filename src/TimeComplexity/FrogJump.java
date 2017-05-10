package TimeComplexity;

/**
 * Created by Daniel on 2017-04-30.
 */
public class FrogJump {

    public int solution(int X, int Y, int D) {
        int solution = 0;
        int reszta = (Y - X) % D;
        double ceil = Math.ceil((Y - X) / D);
        solution = (int) ceil;
        if (reszta == 0) {
            return solution;
        } else {
            return solution + 1;
        }

    }
}
