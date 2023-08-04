import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public long factorial(int n) {
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }


}
