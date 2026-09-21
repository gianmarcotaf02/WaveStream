package p159s5;

/* JADX INFO: renamed from: s5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2741b extends p159s5.AbstractC2743d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamVODStream f27272a;

    public C2741b(com.kiptv.core.model.XtreamVODStream stream) {
        kotlin.jvm.internal.m.e(stream, "stream");
        this.f27272a = stream;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p159s5.C2741b) && kotlin.jvm.internal.m.a(this.f27272a, ((p159s5.C2741b) obj).f27272a);
    }

    public final int hashCode() {
        return this.f27272a.hashCode();
    }

    public final java.lang.String toString() {
        return "Movie(stream=" + this.f27272a + ")";
    }
}
