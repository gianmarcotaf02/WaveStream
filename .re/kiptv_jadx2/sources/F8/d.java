package F8;

import O7.q;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class d extends Handler {

    public static final d f3724a = new d();

    @Override
    public final void publish(LogRecord record) {
        int i3;
        int iMin;
        kotlin.jvm.internal.m.e(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f3722a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.m.d(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i3 = 5;
        } else {
            i3 = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        kotlin.jvm.internal.m.d(message, "record.message");
        Throwable thrown = record.getThrown();
        String strP1 = (String) c.f3723b.get(loggerName);
        if (strP1 == null) {
            strP1 = q.p1(23, loggerName);
        }
        if (Log.isLoggable(strP1, i3)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i9 = 0;
            while (i9 < length) {
                int iK0 = q.K0(message, '\n', i9, 4);
                if (iK0 == -1) {
                    iK0 = length;
                }
                while (true) {
                    iMin = Math.min(iK0, i9 + 4000);
                    String strSubstring = message.substring(i9, iMin);
                    kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i3, strP1, strSubstring);
                    if (iMin >= iK0) {
                        break;
                    } else {
                        i9 = iMin;
                    }
                }
                i9 = iMin + 1;
            }
        }
    }

    @Override
    public final void close() {
    }

    @Override
    public final void flush() {
    }
}
