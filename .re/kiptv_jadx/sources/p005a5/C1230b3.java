package p005a5;

/* JADX INFO: renamed from: a5.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1230b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamVODStream f14242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f14243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14245d;

    public C1230b3(com.kiptv.core.model.XtreamVODStream xtreamVODStream, double d4, int i3, boolean z6) {
        this.f14242a = xtreamVODStream;
        this.f14243b = d4;
        this.f14244c = i3;
        this.f14245d = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1230b3)) {
            return false;
        }
        p005a5.C1230b3 c1230b3 = (p005a5.C1230b3) obj;
        return kotlin.jvm.internal.m.a(this.f14242a, c1230b3.f14242a) && java.lang.Double.compare(this.f14243b, c1230b3.f14243b) == 0 && this.f14244c == c1230b3.f14244c && this.f14245d == c1230b3.f14245d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f14245d) + p121o0.p.d(this.f14244c, (java.lang.Double.hashCode(this.f14243b) + (this.f14242a.hashCode() * 31)) * 31, 31);
    }

    public final java.lang.String toString() {
        return "ScoredMovie(movie=" + this.f14242a + ", score=" + this.f14243b + ", quality=" + this.f14244c + ", isAdult=" + this.f14245d + ")";
    }
}
