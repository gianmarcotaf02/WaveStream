package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ java.util.List c(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            java.util.Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public static java.lang.String b(long j, java.lang.String str, java.util.Locale locale) {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("UTC");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static java.lang.String a(long j, java.lang.String str, java.util.Locale locale) {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("UTC");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }
}
