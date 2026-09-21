package p186w5;

/* JADX INFO: renamed from: w5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2980f implements p186w5.InterfaceC2984h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamVODStream f30224a;

    public C2980f(com.kiptv.core.model.XtreamVODStream movie) {
        kotlin.jvm.internal.m.e(movie, "movie");
        this.f30224a = movie;
    }

    @Override // p186w5.InterfaceC2984h
    public final java.lang.String a() {
        return this.f30224a.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p186w5.C2980f) && kotlin.jvm.internal.m.a(this.f30224a, ((p186w5.C2980f) obj).f30224a);
    }

    @Override // p186w5.InterfaceC2984h
    public final java.lang.String getKey() {
        return com.google.android.gms.internal.play_billing.M0.l(this.f30224a.f20725d, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_MANIFEST);
    }

    @Override // p186w5.InterfaceC2984h
    public final java.lang.String getTitle() {
        return this.f30224a.f20723b;
    }

    public final int hashCode() {
        return this.f30224a.hashCode();
    }

    public final java.lang.String toString() {
        return "Movie(movie=" + this.f30224a + ")";
    }
}
