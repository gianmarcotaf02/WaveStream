package p036d8;

/* JADX INFO: loaded from: classes4.dex */
@p119n8.i(with = p087j8.b.class)
public final class g implements java.lang.Comparable<p036d8.g> {
    public static final p036d8.e Companion = new p036d8.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j$.time.LocalDate f21305h;

    static {
        j$.time.LocalDate MIN = j$.time.LocalDate.MIN;
        kotlin.jvm.internal.m.d(MIN, "MIN");
        new p036d8.g(MIN);
        j$.time.LocalDate MAX = j$.time.LocalDate.MAX;
        kotlin.jvm.internal.m.d(MAX, "MAX");
        new p036d8.g(MAX);
    }

    public g(j$.time.LocalDate value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.f21305h = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(p036d8.g gVar) {
        p036d8.g other = gVar;
        kotlin.jvm.internal.m.e(other, "other");
        return this.f21305h.compareTo((j$.time.chrono.ChronoLocalDate) other.f21305h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p036d8.g) {
            return kotlin.jvm.internal.m.a(this.f21305h, ((p036d8.g) obj).f21305h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21305h.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f21305h.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
