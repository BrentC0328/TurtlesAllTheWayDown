import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public long factorial(int n) {
        Instant start = Instant.now();
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }


}
