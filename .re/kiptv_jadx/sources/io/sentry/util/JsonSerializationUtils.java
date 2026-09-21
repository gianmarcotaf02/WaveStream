package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonSerializationUtils {
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");

    public static java.util.List<java.lang.Object> atomicIntegerArrayToList(java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            arrayList.add(java.lang.Integer.valueOf(atomicIntegerArray.get(i3)));
        }
        return arrayList;
    }

    public static byte[] bytesFrom(io.sentry.ISerializer iSerializer, io.sentry.ILogger iLogger, io.sentry.JsonSerializable jsonSerializable) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(byteArrayOutputStream, UTF_8));
                try {
                    iSerializer.serialize(jsonSerializable, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.lang.Throwable th5) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Could not serialize serializable", th5);
            return null;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.Object> calendarToMap(java.util.Calendar calendar) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("year", java.lang.Integer.valueOf(calendar.get(1)));
        map.put("month", java.lang.Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", java.lang.Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", java.lang.Integer.valueOf(calendar.get(11)));
        map.put("minute", java.lang.Integer.valueOf(calendar.get(12)));
        map.put("second", java.lang.Integer.valueOf(calendar.get(13)));
        return map;
    }
}
