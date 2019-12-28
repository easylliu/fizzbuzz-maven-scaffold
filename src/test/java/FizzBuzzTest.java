import com.sun.xml.internal.bind.v2.model.core.EnumConstant;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    private int number;
    private String expectedResult;
    private ExpectedException expectedException= ExpectedException.none();

    public FizzBuzzTest(int number,String expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1,"1"},
                {3, "Fizz"},
                {5, "Buzz"},
                {7, "Whizz"},
                {15, "FizzBuzz"},
                {21, "FizzWhizz"},
                {35, "BuzzWhizz"},
                {105, "FizzBuzzWhizz"},
        });
    }

    @Test
    public void test() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("invalid input");
        assertEquals(expectedResult, FizzBuzz.transform(number));
    }
}