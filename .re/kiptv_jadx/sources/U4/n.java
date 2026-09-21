package U4;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.local.cache.MovieCollectionStore$Part f10149b;

    public n(int i3, com.kiptv.core.local.cache.MovieCollectionStore$Part movieCollectionStore$Part) {
        this.f10148a = i3;
        this.f10149b = movieCollectionStore$Part;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U4.n)) {
            return false;
        }
        U4.n nVar = (U4.n) obj;
        return this.f10148a == nVar.f10148a && kotlin.jvm.internal.m.a(this.f10149b, nVar.f10149b);
    }

    public final int hashCode() {
        return this.f10149b.hashCode() + (java.lang.Integer.hashCode(this.f10148a) * 31);
    }

    public final java.lang.String toString() {
        return "TitleMatch(collectionId=" + this.f10148a + ", part=" + this.f10149b + ")";
    }
}
