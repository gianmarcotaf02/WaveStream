package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f11770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11773d;

    public X0(int i3, int i9, int i10, java.lang.Object obj) {
        this.f11770a = obj;
        this.f11771b = i3;
        this.f11772c = i9;
        this.f11773d = i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y4.X0)) {
            return false;
        }
        Y4.X0 x9 = (Y4.X0) obj;
        return kotlin.jvm.internal.m.a(this.f11770a, x9.f11770a) && this.f11771b == x9.f11771b && this.f11772c == x9.f11772c && this.f11773d == x9.f11773d;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f11770a;
        return java.lang.Integer.hashCode(this.f11773d) + p121o0.p.d(this.f11772c, p121o0.p.d(this.f11771b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "Page(items=" + this.f11770a + ", page=" + this.f11771b + ", pageCount=" + this.f11772c + ", itemCount=" + this.f11773d + ")";
    }
}
