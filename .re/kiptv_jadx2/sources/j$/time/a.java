package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class a extends Clock implements Serializable {

    public static final a f23585b;
    private static final long serialVersionUID = 6740630888130243051L;

    public final ZoneId f23586a;

    public a(ZoneId zoneId) {
        this.f23586a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f23585b = new a(ZoneOffset.UTC);
    }

    @Override
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f23586a.equals(((a) obj).f23586a);
    }

    public final int hashCode() {
        return this.f23586a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f23586a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
