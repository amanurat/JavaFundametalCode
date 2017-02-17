import com.training.excercies.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amanurat on 3/30/15 AD.
 */
public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void inputOneItShouldReturnOne() {
        assertEquals("1", fizzBuzz.getResult(1));
    }

    @Test
    public void inputTwoItShouldReturnTwo() {
        assertEquals("2", fizzBuzz.getResult(2));
    }

    @Test
    public void inputThreeItShouldReturnFizz() {
        assertEquals("Fizz", fizzBuzz.getResult(3));
    }

    @Test
    public void inputFourItShouldReturnFour() {
        assertEquals("4", fizzBuzz.getResult(4));
    }

    @Test
    public void inputFiveItShouldReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.getResult(5));
    }

    @Test
    public void inputFifteenItShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.getResult(15));
    }

    @Test
    public void inputThirtyItShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.getResult(30));
    }

}
