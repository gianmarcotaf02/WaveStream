package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class V2 extends p005a5.W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.C1250d3 f14020a;

    public V2(p005a5.C1250d3 hit) {
        kotlin.jvm.internal.m.e(hit, "hit");
        this.f14020a = hit;
    }

    @Override // p005a5.W2
    public final java.lang.String a() {
        return com.google.android.gms.internal.play_billing.M0.l(((com.kiptv.core.model.XtreamVODStream) this.f14020a.f14349a).f20725d, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_MANIFEST);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p005a5.V2) && kotlin.jvm.internal.m.a(this.f14020a, ((p005a5.V2) obj).f14020a);
    }

    public final int hashCode() {
        return this.f14020a.hashCode();
    }

    public final java.lang.String toString() {
        return "Movie(hit=" + this.f14020a + ")";
    }
}
