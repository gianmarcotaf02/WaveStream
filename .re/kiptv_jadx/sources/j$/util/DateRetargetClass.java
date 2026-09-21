package j$.util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DateRetargetClass {
    public static j$.time.Instant toInstant(java.util.Date date) {
        return j$.time.Instant.ofEpochMilli(date.getTime());
    }
}
