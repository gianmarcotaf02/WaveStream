package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class Z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.local.cache.MovieCollectionStore$Part f14163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f14164b;

    public Z2(com.kiptv.core.local.cache.MovieCollectionStore$Part part, java.util.List list) {
        kotlin.jvm.internal.m.e(part, "part");
        this.f14163a = part;
        this.f14164b = list;
    }

    public final com.kiptv.core.model.XtreamVODStream a() {
        return (com.kiptv.core.model.XtreamVODStream) p078i6.o.j1(this.f14164b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.Z2)) {
            return false;
        }
        p005a5.Z2 z6 = (p005a5.Z2) obj;
        return kotlin.jvm.internal.m.a(this.f14163a, z6.f14163a) && kotlin.jvm.internal.m.a(this.f14164b, z6.f14164b);
    }

    public final int hashCode() {
        return this.f14164b.hashCode() + (this.f14163a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "SagaEntry(part=" + this.f14163a + ", copies=" + this.f14164b + ")";
    }
}
