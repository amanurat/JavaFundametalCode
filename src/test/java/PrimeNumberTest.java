import com.training.excercies.PrimeNumber;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {


    @Test
    public void shouldReturnTrueWhenInput2() throws Exception {

        assertThat(PrimeNumber.isPrime(2), is(true));
    }
}
