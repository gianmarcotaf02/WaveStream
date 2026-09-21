package p186w5;

/* JADX INFO: renamed from: w5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2982g implements p186w5.InterfaceC2984h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamSeries f30231a;

    public C2982g(com.kiptv.core.model.XtreamSeries series) {
        kotlin.jvm.internal.m.e(series, "series");
        this.f30231a = series;
    }

    @Override // p186w5.InterfaceC2984h
    public final java.lang.String a() {
        return this.f30231a.c();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p186w5.C2982g) && kotlin.jvm.internal.m.a(this.f30231a, ((p186w5.C2982g) obj).f30231a);
    }

    @Override // p186w5.InterfaceC2984h
    public final java.lang.String getKey() {
        return com.google.android.gms.internal.play_billing.M0.l(this.f30231a.f20684c, androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_SS);
    }

    @Override // p186w5.InterfaceC2984h
    public final java.lang.String getTitle() {
        return this.f30231a.f20683b;
    }

    public final int hashCode() {
        return this.f30231a.hashCode();
    }

    public final java.lang.String toString() {
        return "Series(series=" + this.f30231a + ")";
    }
}
