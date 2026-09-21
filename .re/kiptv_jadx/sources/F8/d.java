package F8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends java.util.logging.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F8.d f3724a = new F8.d();

    @Override // java.util.logging.Handler
    public final void publish(java.util.logging.LogRecord record) {
        int i3;
        int iMin;
        kotlin.jvm.internal.m.e(record, "record");
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = F8.c.f3722a;
        java.lang.String loggerName = record.getLoggerName();
        kotlin.jvm.internal.m.d(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        java.util.logging.Level level = java.util.logging.Level.INFO;
        if (iIntValue > level.intValue()) {
            i3 = 5;
        } else {
            i3 = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        java.lang.String message = record.getMessage();
        kotlin.jvm.internal.m.d(message, "record.message");
        java.lang.Throwable thrown = record.getThrown();
        java.lang.String strP1 = (java.lang.String) F8.c.f3723b.get(loggerName);
        if (strP1 == null) {
            strP1 = O7.q.p1(23, loggerName);
        }
        if (android.util.Log.isLoggable(strP1, i3)) {
            if (thrown != null) {
                message = message + '\n' + android.util.Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i9 = 0;
            while (i9 < length) {
                int iK0 = O7.q.K0(message, '\n', i9, 4);
                if (iK0 == -1) {
                    iK0 = length;
                }
                while (true) {
                    iMin = java.lang.Math.min(iK0, i9 + 4000);
                    java.lang.String strSubstring = message.substring(i9, iMin);
                    kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    android.util.Log.println(i3, strP1, strSubstring);
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

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
