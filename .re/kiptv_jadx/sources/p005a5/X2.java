package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class X2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamLiveStream f14081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.EPGProgram f14082b;

    public X2(com.kiptv.core.model.XtreamLiveStream channel, com.kiptv.core.model.EPGProgram ePGProgram) {
        kotlin.jvm.internal.m.e(channel, "channel");
        this.f14081a = channel;
        this.f14082b = ePGProgram;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.X2)) {
            return false;
        }
        p005a5.X2 x9 = (p005a5.X2) obj;
        return kotlin.jvm.internal.m.a(this.f14081a, x9.f14081a) && kotlin.jvm.internal.m.a(this.f14082b, x9.f14082b);
    }

    public final int hashCode() {
        return this.f14082b.hashCode() + (this.f14081a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ProgramSearchHit(channel=" + this.f14081a + ", program=" + this.f14082b + ")";
    }
}
