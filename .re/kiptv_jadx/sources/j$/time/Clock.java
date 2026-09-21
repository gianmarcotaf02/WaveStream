package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Clock {
    public abstract j$.time.Instant instant();

    public static j$.time.Clock systemUTC() {
        return j$.time.a.f23585b;
    }

    public static j$.time.a b() {
        return new j$.time.a(j$.time.ZoneId.systemDefault());
    }

    public long a() {
        return instant().toEpochMilli();
    }
}
