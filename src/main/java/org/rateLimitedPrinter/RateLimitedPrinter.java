package org.rateLimitedPrinter;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class RateLimitedPrinter {
    int interval;
    long oldTime = System.currentTimeMillis();
    String mess;
    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }

    public void print(String message) {
        long currentTime = System.currentTimeMillis();
        if ((currentTime - oldTime) > interval) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS", Locale.US);
            GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("US/Central"));
            calendar.setTimeInMillis(currentTime);
            System.out.println(sdf.format(calendar.getTime()));
            oldTime=currentTime;
        }
    }


}
