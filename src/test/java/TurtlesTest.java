import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {


    @Test
    public void factorialTest(){
        //given
        Turtles turtles = new Turtles();
        Long expected = 120L;

        //when
        Long actual = turtles.factorial(5);

        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void factorialTest2(){
        //given
        Turtles turtles = new Turtles();
        Long expected = 5040L;

        //when
        Long actual = turtles.factorial(7);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest3(){
        //given
        Turtles turtles = new Turtles();
        Long expected = 3628800L;

        //when
        Long actual = turtles.factorial(10);

        //then
        Assert.assertEquals(expected, actual);
    }

}