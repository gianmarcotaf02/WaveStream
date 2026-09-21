package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f14071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14073c;

    public X(java.util.List items, boolean z6, boolean z9) {
        kotlin.jvm.internal.m.e(items, "items");
        this.f14071a = items;
        this.f14072b = z6;
        this.f14073c = z9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.X)) {
            return false;
        }
        p005a5.X x9 = (p005a5.X) obj;
        return kotlin.jvm.internal.m.a(this.f14071a, x9.f14071a) && this.f14072b == x9.f14072b && this.f14073c == x9.f14073c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f14073c) + p121o0.p.f(this.f14071a.hashCode() * 31, 31, this.f14072b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktPagesOutcome(items=");
        sb.append(this.f14071a);
        sb.append(", hasMore=");
        sb.append(this.f14072b);
        sb.append(", failed=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f14073c, ")");
    }
}
