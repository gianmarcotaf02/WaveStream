package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14046b;

    public W(int i3, boolean z6) {
        this.f14045a = i3;
        this.f14046b = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.W)) {
            return false;
        }
        p005a5.W w6 = (p005a5.W) obj;
        return this.f14045a == w6.f14045a && this.f14046b == w6.f14046b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f14046b) + (java.lang.Integer.hashCode(this.f14045a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Seed(tmdbId=");
        sb.append(this.f14045a);
        sb.append(", isMovie=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f14046b, ")");
    }
}
