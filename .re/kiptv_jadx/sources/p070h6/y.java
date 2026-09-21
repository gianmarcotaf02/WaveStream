package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short f22556h;

    public /* synthetic */ y(short s9) {
        this.f22556h = s9;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return kotlin.jvm.internal.m.f(this.f22556h & 65535, ((p070h6.y) obj).f22556h & 65535);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p070h6.y) {
            return this.f22556h == ((p070h6.y) obj).f22556h;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Short.hashCode(this.f22556h);
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(65535 & this.f22556h);
    }
}
