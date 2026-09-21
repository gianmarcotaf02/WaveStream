package p159s5;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p070h6.k f27317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p070h6.k f27318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p070h6.k f27319c;

    public p(p070h6.k all, p070h6.k trakt, p070h6.k kiptv) {
        kotlin.jvm.internal.m.e(all, "all");
        kotlin.jvm.internal.m.e(trakt, "trakt");
        kotlin.jvm.internal.m.e(kiptv, "kiptv");
        this.f27317a = all;
        this.f27318b = trakt;
        this.f27319c = kiptv;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p159s5.p)) {
            return false;
        }
        p159s5.p pVar = (p159s5.p) obj;
        return kotlin.jvm.internal.m.a(this.f27317a, pVar.f27317a) && kotlin.jvm.internal.m.a(this.f27318b, pVar.f27318b) && kotlin.jvm.internal.m.a(this.f27319c, pVar.f27319c);
    }

    public final int hashCode() {
        return this.f27319c.hashCode() + ((this.f27318b.hashCode() + (this.f27317a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "WatchedIds(all=" + this.f27317a + ", trakt=" + this.f27318b + ", kiptv=" + this.f27319c + ")";
    }
}
