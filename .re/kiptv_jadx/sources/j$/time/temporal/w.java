package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements java.io.Serializable {
    public static final java.util.concurrent.ConcurrentHashMap g = new java.util.concurrent.ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.time.temporal.i f23820h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.DayOfWeek f23821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.temporal.v f23823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient j$.time.temporal.v f23824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient j$.time.temporal.v f23825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient j$.time.temporal.v f23826f;

    static {
        new j$.time.temporal.w(j$.time.DayOfWeek.MONDAY, 4);
        a(j$.time.DayOfWeek.SUNDAY, 1);
        f23820h = j$.time.temporal.j.f23794d;
    }

    public static j$.time.temporal.w a(j$.time.DayOfWeek dayOfWeek, int i3) {
        java.lang.String str = dayOfWeek.toString() + i3;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g;
        j$.time.temporal.w wVar = (j$.time.temporal.w) concurrentHashMap.get(str);
        if (wVar != null) {
            return wVar;
        }
        concurrentHashMap.putIfAbsent(str, new j$.time.temporal.w(dayOfWeek, i3));
        return (j$.time.temporal.w) concurrentHashMap.get(str);
    }

    public w(j$.time.DayOfWeek dayOfWeek, int i3) {
        j$.time.temporal.b bVar = j$.time.temporal.b.DAYS;
        j$.time.temporal.b bVar2 = j$.time.temporal.b.WEEKS;
        this.f23823c = new j$.time.temporal.v("DayOfWeek", this, bVar, bVar2, j$.time.temporal.v.f23812f);
        this.f23824d = new j$.time.temporal.v("WeekOfMonth", this, bVar2, j$.time.temporal.b.MONTHS, j$.time.temporal.v.g);
        j$.time.temporal.i iVar = j$.time.temporal.j.f23794d;
        this.f23825e = new j$.time.temporal.v("WeekOfWeekBasedYear", this, bVar2, iVar, j$.time.temporal.v.f23814i);
        this.f23826f = new j$.time.temporal.v("WeekBasedYear", this, iVar, j$.time.temporal.b.FOREVER, j$.time.temporal.a.YEAR.f23783b);
        java.util.Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i3 < 1 || i3 > 7) {
            throw new java.lang.IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f23821a = dayOfWeek;
        this.f23822b = i3;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        if (this.f23821a == null) {
            throw new java.io.InvalidObjectException("firstDayOfWeek is null");
        }
        int i3 = this.f23822b;
        if (i3 < 1 || i3 > 7) {
            throw new java.io.InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private java.lang.Object readResolve() throws java.io.InvalidObjectException {
        try {
            return a(this.f23821a, this.f23822b);
        } catch (java.lang.IllegalArgumentException e6) {
            throw new java.io.InvalidObjectException("Invalid serialized WeekFields: " + e6.getMessage());
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.temporal.w) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f23821a.ordinal() * 7) + this.f23822b;
    }

    public final java.lang.String toString() {
        return "WeekFields[" + this.f23821a + "," + this.f23822b + "]";
    }
}
