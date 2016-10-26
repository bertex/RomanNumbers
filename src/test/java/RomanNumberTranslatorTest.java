import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class RomanNumberTranslatorTest {

    private RomanTranslator roman;
    private List<ArabicRoman> conversionList = initConversionList();

    @Before
    public void setup() {
        roman = new RomanTranslator(conversionList);
    }

    @Test public void test1() {
        assertEquals("I", roman.numberToRoman(1));
    }

    @Test public void test3() {
        assertEquals("III", roman.numberToRoman(3));
    }

    @Test public void test9() {
        assertEquals("IX", roman.numberToRoman(9));
    }

    @Test public void test1066() {
        assertEquals("MLXVI", roman.numberToRoman(1066));
    }

    @Test public void test1989() {
        assertEquals("MCMLXXXIX", roman.numberToRoman(1989));
    }

    private List<ArabicRoman> initConversionList() {
        List<ArabicRoman> arabicRoman;
        arabicRoman = new ArrayList<ArabicRoman>();
        arabicRoman.add(new ArabicRoman(1000, "M"));
        arabicRoman.add(new ArabicRoman(900, "CM"));
        arabicRoman.add(new ArabicRoman(500, "D"));
        arabicRoman.add(new ArabicRoman(400, "CD"));
        arabicRoman.add(new ArabicRoman(100, "C"));
        arabicRoman.add(new ArabicRoman(90, "XC"));
        arabicRoman.add(new ArabicRoman(50, "L"));
        arabicRoman.add(new ArabicRoman(40, "XL"));
        arabicRoman.add(new ArabicRoman(10, "X"));
        arabicRoman.add(new ArabicRoman(9, "IX"));
        arabicRoman.add(new ArabicRoman(5, "V"));
        arabicRoman.add(new ArabicRoman(4, "IV"));
        arabicRoman.add(new ArabicRoman(1, "I"));
        return arabicRoman;
    }

}
