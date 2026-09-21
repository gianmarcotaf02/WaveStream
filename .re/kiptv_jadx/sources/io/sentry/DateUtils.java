package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class DateUtils {
    private DateUtils() {
    }

    public static long dateToNanos(java.util.Date date) {
        return millisToNanos(date.getTime());
    }

    public static double dateToSeconds(java.util.Date date) {
        return millisToSeconds(date.getTime());
    }

    public static java.util.Date getCurrentDateTime() {
        return java.util.Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC).getTime();
    }

    public static java.util.Date getDateTime(java.lang.String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.ISO8601Utils.parse(str, new java.text.ParsePosition(0));
        } catch (java.text.ParseException unused) {
            throw new java.lang.IllegalArgumentException(p121o0.p.C("timestamp is not ISO format ", str));
        }
    }

    public static java.util.Date getDateTimeWithMillisPrecision(java.lang.String str) {
        try {
            return getDateTime(new java.math.BigDecimal(str).setScale(3, java.math.RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (java.lang.NumberFormatException unused) {
            throw new java.lang.IllegalArgumentException(p121o0.p.C("timestamp is not millis format ", str));
        }
    }

    public static java.lang.String getTimestamp(java.util.Date date) {
        return io.sentry.vendor.gson.internal.bind.util.ISO8601Utils.format(date, true);
    }

    public static long millisToNanos(long j) {
        return j * 1000000;
    }

    public static double millisToSeconds(double d4) {
        return d4 / 1000.0d;
    }

    public static java.util.Date nanosToDate(long j) {
        return getDateTime(java.lang.Double.valueOf(nanosToMillis(j)).longValue());
    }

    public static double nanosToMillis(double d4) {
        return d4 / 1000000.0d;
    }

    public static double nanosToSeconds(long j) {
        return j / 1.0E9d;
    }

    public static long secondsToNanos(long j) {
        return j * androidx.media3.common.C.NANOS_PER_SECOND;
    }

    public static java.util.Date toUtilDate(io.sentry.SentryDate sentryDate) {
        if (sentryDate == null) {
            return null;
        }
        return toUtilDateNotNull(sentryDate);
    }

    public static java.util.Date toUtilDateNotNull(io.sentry.SentryDate sentryDate) {
        return nanosToDate(sentryDate.nanoTimestamp());
    }

    public static java.util.Date getDateTime(long j) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }
}
