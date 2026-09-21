package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends j$.time.Clock implements java.io.Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j$.time.a f23585b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.ZoneId f23586a;

    public a(j$.time.ZoneId zoneId) {
        this.f23586a = zoneId;
    }

    static {
        java.lang.System.currentTimeMillis();
        f23585b = new j$.time.a(j$.time.ZoneOffset.UTC);
    }

    @Override // j$.time.Clock
    public final long a() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // j$.time.Clock
    public final j$.time.Instant instant() {
        return j$.time.Instant.ofEpochMilli(java.lang.System.currentTimeMillis());
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof j$.time.a)) {
            return false;
        }
        return this.f23586a.equals(((j$.time.a) obj).f23586a);
    }

    public final int hashCode() {
        return this.f23586a.hashCode() + 1;
    }

    public final java.lang.String toString() {
        return "SystemClock[" + this.f23586a + "]";
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
    }
}
