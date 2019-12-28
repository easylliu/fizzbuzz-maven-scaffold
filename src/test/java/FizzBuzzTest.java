import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void test(){
        assertThat(FizzBuzz.transform(3)).isEqualTo("Fizz");
    }

}
