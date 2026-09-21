package j$.util;

import j$.time.Instant;
import java.util.Date;

public final class DateRetargetClass {
    public static Instant toInstant(Date date) {
        return Instant.ofEpochMilli(date.getTime());
    }
}
