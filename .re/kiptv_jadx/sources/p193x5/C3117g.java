package p193x5;

/* JADX INFO: renamed from: x5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3117g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f31467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f31468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f31470d;

    public C3117g(java.lang.String str, java.lang.String str2, boolean z6, kotlin.jvm.functions.Function0 function0) {
        this.f31467a = str;
        this.f31468b = str2;
        this.f31469c = z6;
        this.f31470d = function0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p193x5.C3117g)) {
            return false;
        }
        p193x5.C3117g c3117g = (p193x5.C3117g) obj;
        return this.f31467a.equals(c3117g.f31467a) && this.f31468b.equals(c3117g.f31468b) && this.f31469c == c3117g.f31469c && this.f31470d.equals(c3117g.f31470d);
    }

    public final int hashCode() {
        return this.f31470d.hashCode() + p121o0.p.f(B2.a.a(this.f31467a.hashCode() * 31, 31, this.f31468b), 31, this.f31469c);
    }

    public final java.lang.String toString() {
        return "LiveGroupConfirmation(title=" + this.f31467a + ", message=" + this.f31468b + ", destructive=" + this.f31469c + ", action=" + this.f31470d + ")";
    }
}
