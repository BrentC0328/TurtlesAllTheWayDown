import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class GCDTests {

    @Test
    public void GCD1Test(){
        //given
        GCD gcd1 = new GCD();
        Long expected = 4L;

        //when
        Instant start = Instant.now();
        Long actual = gcd1.greatestCommonDivisor(12L, 8L);
        Instant finish = Instant.now();
        System.out.println(Duration.between(start,finish).toNanos());
        //then

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void GCD1Test2(){
        //given
        GCD gcd1 = new GCD();
        Long expected = 24L;

        //when
        Instant start = Instant.now();
        Long actual = gcd1.greatestCommonDivisor(1440L, 408L);
        Instant finish = Instant.now();
        System.out.println(Duration.between(start,finish).toNanos());
        //then

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void GCD2Test(){
        //given
        GCD gcd1 = new GCD();
        Long expected = 4L;

        //when
        Long actual = gcd1.greatestCommonDivisor2(12L, 8L);
        //then

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void GCD2Test2(){
        //given
        GCD gcd1 = new GCD();
        Long expected = 24L;

        //when
        Instant start = Instant.now();
        Long actual = gcd1.greatestCommonDivisor2(1440L, 408L);
        Instant finish = Instant.now();
        System.out.println(Duration.between(start,finish).toNanos());
        //then

        Assert.assertEquals(expected,actual);
    }
}
