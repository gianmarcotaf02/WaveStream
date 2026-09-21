package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f13956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13957b;

    public U(java.util.List list, boolean z6) {
        this.f13956a = list;
        this.f13957b = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.U)) {
            return false;
        }
        p005a5.U u6 = (p005a5.U) obj;
        return this.f13956a.equals(u6.f13956a) && this.f13957b == u6.f13957b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f13957b) + (this.f13956a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchOutcome(items=");
        sb.append(this.f13956a);
        sb.append(", failed=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f13957b, ")");
    }
}
