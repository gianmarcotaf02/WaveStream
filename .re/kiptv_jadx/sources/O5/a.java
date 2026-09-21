package O5;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements O5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.tv.update.PlayUpdateManifest f7951a;

    public a(com.kiptv.tv.update.PlayUpdateManifest playUpdateManifest) {
        this.f7951a = playUpdateManifest;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O5.a) && kotlin.jvm.internal.m.a(this.f7951a, ((O5.a) obj).f7951a);
    }

    public final int hashCode() {
        return this.f7951a.hashCode();
    }

    public final java.lang.String toString() {
        return "Available(manifest=" + this.f7951a + ")";
    }
}
