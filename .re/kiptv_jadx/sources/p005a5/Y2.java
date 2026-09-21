package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class Y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.local.cache.MovieCollectionStore$Summary f14119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f14120b;

    public Y2(com.kiptv.core.local.cache.MovieCollectionStore$Summary movieCollectionStore$Summary, java.util.ArrayList arrayList) {
        this.f14119a = movieCollectionStore$Summary;
        this.f14120b = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.Y2)) {
            return false;
        }
        p005a5.Y2 y9 = (p005a5.Y2) obj;
        return this.f14119a.equals(y9.f14119a) && this.f14120b.equals(y9.f14120b);
    }

    public final int hashCode() {
        return this.f14120b.hashCode() + (this.f14119a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "Saga(summary=" + this.f14119a + ", entries=" + this.f14120b + ")";
    }
}
