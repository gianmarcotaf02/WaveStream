package p036d8;

/* JADX INFO: loaded from: classes4.dex */
@p119n8.i(with = p087j8.d.class)
public final class k {
    public static final p036d8.j Companion = new p036d8.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.ZoneOffset f21307a;

    static {
        j$.time.ZoneOffset UTC = j$.time.ZoneOffset.UTC;
        kotlin.jvm.internal.m.d(UTC, "UTC");
        new p036d8.k(UTC);
    }

    public k(j$.time.ZoneOffset zoneOffset) {
        kotlin.jvm.internal.m.e(zoneOffset, "zoneOffset");
        this.f21307a = zoneOffset;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p036d8.k) {
            return kotlin.jvm.internal.m.a(this.f21307a, ((p036d8.k) obj).f21307a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21307a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f21307a.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
