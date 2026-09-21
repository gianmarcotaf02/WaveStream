package p036d8;

/* JADX INFO: loaded from: classes4.dex */
@p119n8.i(with = p087j8.c.class)
public final class i implements java.lang.Comparable<p036d8.i> {
    public static final p036d8.h Companion = new p036d8.h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j$.time.LocalTime f21306h;

    static {
        j$.time.LocalTime MIN = j$.time.LocalTime.MIN;
        kotlin.jvm.internal.m.d(MIN, "MIN");
        new p036d8.i(MIN);
        j$.time.LocalTime MAX = j$.time.LocalTime.MAX;
        kotlin.jvm.internal.m.d(MAX, "MAX");
        new p036d8.i(MAX);
    }

    public i(j$.time.LocalTime value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.f21306h = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(p036d8.i iVar) {
        p036d8.i other = iVar;
        kotlin.jvm.internal.m.e(other, "other");
        return this.f21306h.compareTo(other.f21306h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p036d8.i) {
            return kotlin.jvm.internal.m.a(this.f21306h, ((p036d8.i) obj).f21306h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21306h.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f21306h.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
