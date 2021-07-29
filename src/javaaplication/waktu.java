package javaaplication;
import java.util.*;

public class waktu {
    public static void main(String args[]) {

        GregorianCalendar gcalendar = new GregorianCalendar();

        System.out.print("Waktu: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE));
    }
}
