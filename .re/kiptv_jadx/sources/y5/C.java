package y5;

/* JADX INFO: loaded from: classes4.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y5.B f31897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f31898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D0.C0205f f31899c;

    public C(y5.B b9, java.lang.String str, D0.C0205f c0205f) {
        this.f31897a = b9;
        this.f31898b = str;
        this.f31899c = c0205f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5.C)) {
            return false;
        }
        y5.C c9 = (y5.C) obj;
        return this.f31897a == c9.f31897a && kotlin.jvm.internal.m.a(this.f31898b, c9.f31898b) && kotlin.jvm.internal.m.a(this.f31899c, c9.f31899c);
    }

    public final int hashCode() {
        int iHashCode = this.f31897a.hashCode() * 31;
        java.lang.String str = this.f31898b;
        return this.f31899c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        return "TvTabEntry(tab=" + this.f31897a + ", labelKey=" + this.f31898b + ", icon=" + this.f31899c + ")";
    }
}
