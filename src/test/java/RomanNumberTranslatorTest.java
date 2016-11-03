import org.junit.*;

import static org.junit.Assert.*;

public class RomanNumberTranslatorTest {

    @Test public void test1() {
        RomanTranslator roman;
        roman = new RomanTranslator();
        assertEquals("I", roman.numberToRoman(1));
    }

}
