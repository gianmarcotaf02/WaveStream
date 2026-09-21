package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f11709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f11710b;

    public P1(java.util.Map map, java.util.Map map2) {
        this.f11709a = map;
        this.f11710b = map2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y4.P1)) {
            return false;
        }
        Y4.P1 p2 = (Y4.P1) obj;
        return this.f11709a.equals(p2.f11709a) && this.f11710b.equals(p2.f11710b);
    }

    public final int hashCode() {
        return this.f11710b.hashCode() + (this.f11709a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "XMLTVParseResult(channels=" + this.f11709a + ", programs=" + this.f11710b + ")";
    }
}
