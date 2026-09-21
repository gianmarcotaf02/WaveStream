package v;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.S f29019b;

    public u0() {
        long jD = p188x0.z.d(4284900966L);
        B.S sA = B.AbstractC0065c.a(0.0f, 0.0f, 3);
        this.f29018a = jD;
        this.f29019b = sA;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v.u0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        v.u0 u0Var = (v.u0) obj;
        return p188x0.C3098s.d(this.f29018a, u0Var.f29018a) && kotlin.jvm.internal.m.a(this.f29019b, u0Var.f29019b);
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return this.f29019b.hashCode() + (java.lang.Long.hashCode(this.f29018a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OverscrollConfiguration(glowColor=");
        p121o0.p.x(this.f29018a, ", drawPadding=", sb);
        sb.append(this.f29019b);
        sb.append(')');
        return sb.toString();
    }
}
