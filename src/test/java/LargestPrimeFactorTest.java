import com.training.excercies.LargetPrimeFactor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPrimeFactorTest {
    @Test
    public void testLargestPrimeFactors() {
        assertEquals(2, LargetPrimeFactor.largestPrimeFactor(2));
        assertEquals(3, LargetPrimeFactor.largestPrimeFactor(6));
        assertEquals(5, LargetPrimeFactor.largestPrimeFactor(15));
        assertEquals(7, LargetPrimeFactor.largestPrimeFactor(147));
        assertEquals(17, LargetPrimeFactor.largestPrimeFactor(17));
        assertEquals(31, LargetPrimeFactor.largestPrimeFactor(392832));
        assertEquals(893933, LargetPrimeFactor.largestPrimeFactor(1787866));
    }
}

