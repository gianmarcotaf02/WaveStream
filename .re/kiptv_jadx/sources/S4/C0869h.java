package S4;

/* JADX INFO: renamed from: S4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0869h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f9396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f9397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f9398f;

    public C0869h(java.lang.String normalized, java.lang.String matching, java.lang.String aggressive, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.m.e(normalized, "normalized");
        kotlin.jvm.internal.m.e(matching, "matching");
        kotlin.jvm.internal.m.e(aggressive, "aggressive");
        this.f9393a = normalized;
        this.f9394b = matching;
        this.f9395c = aggressive;
        this.f9396d = num;
        this.f9397e = num2;
        this.f9398f = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new D5.C0261o(22, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    public final java.lang.String a() {
        return (java.lang.String) this.f9398f.getValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.C0869h)) {
            return false;
        }
        S4.C0869h c0869h = (S4.C0869h) obj;
        return kotlin.jvm.internal.m.a(this.f9393a, c0869h.f9393a) && kotlin.jvm.internal.m.a(this.f9394b, c0869h.f9394b) && kotlin.jvm.internal.m.a(this.f9395c, c0869h.f9395c) && kotlin.jvm.internal.m.a(this.f9396d, c0869h.f9396d) && kotlin.jvm.internal.m.a(this.f9397e, c0869h.f9397e);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(this.f9393a.hashCode() * 31, 31, this.f9394b), 31, this.f9395c);
        java.lang.Integer num = this.f9396d;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f9397e;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "MatchKey(normalized=" + this.f9393a + ", matching=" + this.f9394b + ", aggressive=" + this.f9395c + ", year=" + this.f9396d + ", tmdbId=" + this.f9397e + ")";
    }
}
