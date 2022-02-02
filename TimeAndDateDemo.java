import java.text.*;
import java.util.*;
public class TimeAndDateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        DateFormat df;
        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.ROOT);
        System.out.println("Europe: " + df.format(d));
    }
}
