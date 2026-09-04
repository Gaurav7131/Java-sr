
//CompactNumberFormat Class:The part java.txt class.This class formats the long numbers into locale-sensitive representation like 1 million dollar : $1M
import java.text.NumberFormat;
import java.util.Locale;

public class Java12FeatCompactNumberEx {
    public static void main(String[] args) {
        NumberFormat formatShort = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);// SHORT
        NumberFormat formatLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);// LONG

        System.out.println("Short:" + formatShort.format(2500));// 2.5K
        System.out.println("Long:" + formatLong.format(1000000));// 1 million

    }
}
