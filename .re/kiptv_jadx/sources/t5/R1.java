package t5;

/* JADX INFO: loaded from: classes4.dex */
public final class R1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28046f;
    public final boolean g;

    public R1(boolean z6, long j, long j9, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f28041a = z6;
        this.f28042b = j;
        this.f28043c = j9;
        this.f28044d = z9;
        this.f28045e = z10;
        this.f28046f = z11;
        this.g = z12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.R1)) {
            return false;
        }
        t5.R1 r9 = (t5.R1) obj;
        return this.f28041a == r9.f28041a && this.f28042b == r9.f28042b && this.f28043c == r9.f28043c && this.f28044d == r9.f28044d && this.f28045e == r9.f28045e && this.f28046f == r9.f28046f && this.g == r9.g;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.g) + p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.e(p121o0.p.e(java.lang.Boolean.hashCode(this.f28041a) * 31, 31, this.f28042b), 31, this.f28043c), 31, this.f28044d), 31, this.f28045e), 31, this.f28046f);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("YouTubeProbe(ready=");
        sb.append(this.f28041a);
        sb.append(", positionMs=");
        sb.append(this.f28042b);
        sb.append(", durationMs=");
        sb.append(this.f28043c);
        sb.append(", isPlaying=");
        sb.append(this.f28044d);
        sb.append(", ended=");
        sb.append(this.f28045e);
        sb.append(", adShowing=");
        sb.append(this.f28046f);
        sb.append(", hasFrames=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.g, ")");
    }
}
