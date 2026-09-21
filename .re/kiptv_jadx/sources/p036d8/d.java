package p036d8;

/* JADX INFO: loaded from: classes4.dex */
@p119n8.i(with = p087j8.a.class)
public final class d implements java.lang.Comparable<p036d8.d> {
    public static final p036d8.c Companion = new p036d8.c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p036d8.d f21302i;
    public static final p036d8.d j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j$.time.Instant f21303h;

    static {
        kotlin.jvm.internal.m.d(j$.time.Instant.ofEpochSecond(-3217862419201L, 999999999L), "ofEpochSecond(...)");
        kotlin.jvm.internal.m.d(j$.time.Instant.ofEpochSecond(3093527980800L, 0L), "ofEpochSecond(...)");
        j$.time.Instant MIN = j$.time.Instant.MIN;
        kotlin.jvm.internal.m.d(MIN, "MIN");
        f21302i = new p036d8.d(MIN);
        j$.time.Instant MAX = j$.time.Instant.MAX;
        kotlin.jvm.internal.m.d(MAX, "MAX");
        j = new p036d8.d(MAX);
    }

    public d(j$.time.Instant instant) {
        this.f21303h = instant;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p036d8.d other) {
        kotlin.jvm.internal.m.e(other, "other");
        return this.f21303h.compareTo(other.f21303h);
    }

    public final p036d8.d b(long j9) {
        P7.a aVar = P7.b.f8168i;
        try {
            j$.time.Instant instantPlusNanos = this.f21303h.plusSeconds(P7.b.i(j9, P7.d.SECONDS)).plusNanos(P7.b.e(j9));
            kotlin.jvm.internal.m.d(instantPlusNanos, "plusNanos(...)");
            return new p036d8.d(instantPlusNanos);
        } catch (java.lang.Exception e6) {
            if ((e6 instanceof java.lang.ArithmeticException) || (e6 instanceof j$.time.DateTimeException)) {
                return j9 > 0 ? j : f21302i;
            }
            throw e6;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p036d8.d) {
            return kotlin.jvm.internal.m.a(this.f21303h, ((p036d8.d) obj).f21303h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21303h.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f21303h.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
