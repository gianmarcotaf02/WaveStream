package p005a5;

/* JADX INFO: renamed from: a5.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1220a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamLiveStream f14201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f14202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14204d;

    public C1220a3(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, double d4, int i3, boolean z6) {
        this.f14201a = xtreamLiveStream;
        this.f14202b = d4;
        this.f14203c = i3;
        this.f14204d = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1220a3)) {
            return false;
        }
        p005a5.C1220a3 c1220a3 = (p005a5.C1220a3) obj;
        return kotlin.jvm.internal.m.a(this.f14201a, c1220a3.f14201a) && java.lang.Double.compare(this.f14202b, c1220a3.f14202b) == 0 && this.f14203c == c1220a3.f14203c && this.f14204d == c1220a3.f14204d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f14204d) + p121o0.p.d(this.f14203c, (java.lang.Double.hashCode(this.f14202b) + (this.f14201a.hashCode() * 31)) * 31, 31);
    }

    public final java.lang.String toString() {
        return "ScoredChannel(channel=" + this.f14201a + ", score=" + this.f14202b + ", quality=" + this.f14203c + ", isAdult=" + this.f14204d + ")";
    }
}
