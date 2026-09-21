package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f13869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1353n6 f13870c;

    public S(boolean z6, java.util.Map map, p005a5.C1353n6 c1353n6) {
        this.f13868a = z6;
        this.f13869b = map;
        this.f13870c = c1353n6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.S)) {
            return false;
        }
        p005a5.S s9 = (p005a5.S) obj;
        return this.f13868a == s9.f13868a && kotlin.jvm.internal.m.a(this.f13869b, s9.f13869b) && kotlin.jvm.internal.m.a(this.f13870c, s9.f13870c);
    }

    public final int hashCode() {
        int iHashCode = (this.f13869b.hashCode() + (java.lang.Boolean.hashCode(this.f13868a) * 31)) * 31;
        p005a5.C1353n6 c1353n6 = this.f13870c;
        return iHashCode + (c1353n6 == null ? 0 : c1353n6.hashCode());
    }

    public final java.lang.String toString() {
        return "FeedQuery(isMovie=" + this.f13868a + ", params=" + this.f13869b + ", trakt=" + this.f13870c + ")";
    }
}
