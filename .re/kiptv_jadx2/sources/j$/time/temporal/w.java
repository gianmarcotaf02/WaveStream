package j$.time.temporal;

import j$.time.DayOfWeek;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class w implements Serializable {
    public static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);

    public static final i f23820h;
    private static final long serialVersionUID = -1177360819670808121L;

    public final DayOfWeek f23821a;

    public final int f23822b;

    public final transient v f23823c;

    public final transient v f23824d;

    public final transient v f23825e;

    public final transient v f23826f;

    static {
        new w(DayOfWeek.MONDAY, 4);
        a(DayOfWeek.SUNDAY, 1);
        f23820h = j.f23794d;
    }

    public static w a(DayOfWeek dayOfWeek, int i3) {
        String str = dayOfWeek.toString() + i3;
        ConcurrentHashMap concurrentHashMap = g;
        w wVar = (w) concurrentHashMap.get(str);
        if (wVar != null) {
            return wVar;
        }
        concurrentHashMap.putIfAbsent(str, new w(dayOfWeek, i3));
        return (w) concurrentHashMap.get(str);
    }

    public w(DayOfWeek dayOfWeek, int i3) {
        b bVar = b.DAYS;
        b bVar2 = b.WEEKS;
        this.f23823c = new v("DayOfWeek", this, bVar, bVar2, v.f23812f);
        this.f23824d = new v("WeekOfMonth", this, bVar2, b.MONTHS, v.g);
        i iVar = j.f23794d;
        this.f23825e = new v("WeekOfWeekBasedYear", this, bVar2, iVar, v.f23814i);
        this.f23826f = new v("WeekBasedYear", this, iVar, b.FOREVER, a.YEAR.f23783b);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i3 < 1 || i3 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f23821a = dayOfWeek;
        this.f23822b = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f23821a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i3 = this.f23822b;
        if (i3 < 1 || i3 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.f23821a, this.f23822b);
        } catch (IllegalArgumentException e6) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e6.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f23821a.ordinal() * 7) + this.f23822b;
    }

    public final String toString() {
        return "WeekFields[" + this.f23821a + "," + this.f23822b + "]";
    }
}
