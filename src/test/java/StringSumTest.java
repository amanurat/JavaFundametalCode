import com.training.excercies.StringSum;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringSumTest {


    @Test
    public void shouldReplaceZeroIfInputString() throws Exception {
        StringSum stringSum = new StringSum();
        Integer sum = stringSum.add("", "");
        assertThat(sum, is(0));
    }

    @Test
    public void shouldSummaryTwoParameterWhenInputIsNaturalNumber() throws Exception {
        StringSum stringSum = new StringSum();
        Integer sum = stringSum.add("2", "3");

        assertThat(sum, is(5));

    }
}
