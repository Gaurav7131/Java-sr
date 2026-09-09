import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Java14FeatJapaneseReiwaEx {

    public static void main(String[] args) {
        JapaneseDate date = JapaneseDate.from(LocalDate.of(2019, 5, 1));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("GGGG y年M月d日", Locale.JAPAN);
        System.out.println("Reiwa Date:" + date.format(dtf));

        // Unicode:Reiwa Square character (U+32FF)
        String reiwaSymbol = "\u32FF";
        System.out.println("Symbol:" + reiwaSymbol);
        System.out.println("Codepointcut:" + reiwaSymbol.codePointCount(0, reiwaSymbol.length()));
    }
}