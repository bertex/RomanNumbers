/**
 * Created by albert.renom on 26/10/2016.
 *
 */

import org.junit.*;
import static org.junit.Assert.*;


public class RomanNumberTranslatorTest {

    @Test public void Test1() {
        RomanTranslator roman = new RomanTranslator();
        assertEquals("I", roman.numberToRoman(1));
    }

}
