import java.util.List;

public class RomanTranslator {

    private List<ArabicRoman> arabicRoman;
    private int lastPositionUsed;

    public RomanTranslator(List<ArabicRoman> arabicRoman) {
        this.arabicRoman = arabicRoman;
        this.lastPositionUsed = 0;
    }

    public String numberToRoman(Integer n) {
        int size = arabicRoman.size();
        while (lastPositionUsed < size) {
            ArabicRoman conversion = arabicRoman.get(lastPositionUsed);
            if (n >= conversion.getArabicValue()) return conversion.getRomanValue() + numberToRoman(n - conversion.getArabicValue());
            ++lastPositionUsed;
        }
        return "";
    }

    /*
    public String numberToRoman(Integer i) {
        for (ArabicRoman conversion : arabicRoman) {
            if (i >= conversion.getArabicValue()) return conversion.getRomanValue() + numberToRoman(i - conversion.getArabicValue());
        } return "";
    }
    */

}
