package quizOne;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstNotRepeatingCharTest {
    @Test
    public void should_return_a_when_get_first_unique_char_given_a() throws Exception {
        String s = "a";

        char c = new FirstNotRepeatingChar().getFirstUniqueChar(s);

        assertEquals('a', c);
    }

    @Test
    public void should_return_b_when_get_first_unique_char_given_aab() throws Exception {
        String s = "aab";

        char c = new FirstNotRepeatingChar().getFirstUniqueChar(s);

        assertEquals('b', c);
    }

    @Test
    public void should_return_t_when_get_first_unique_char_given_abbat() throws Exception {
        String s = "abbat";

        char c = new FirstNotRepeatingChar().getFirstUniqueChar(s);

        assertEquals('t', c);
    }

    @Test
    public void should_return_0_when_get_first_unique_char_given_abbatt() throws Exception {
        String s = "abbatt";

        char c = new FirstNotRepeatingChar().getFirstUniqueChar(s);

        assertEquals(0, c);
    }
}
