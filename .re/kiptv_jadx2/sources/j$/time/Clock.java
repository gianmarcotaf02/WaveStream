package j$.time;

public abstract class Clock {
    public abstract Instant instant();

    public static Clock systemUTC() {
        return a.f23585b;
    }

    public static a b() {
        return new a(ZoneId.systemDefault());
    }

    public long a() {
        return instant().toEpochMilli();
    }
}
