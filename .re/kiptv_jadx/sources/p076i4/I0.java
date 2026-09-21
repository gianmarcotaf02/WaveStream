package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends p076i4.AbstractC2185b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient p076i4.H0 f22801n;

    @Override // p076i4.AbstractC2215q, p076i4.AbstractC2222u
    public final java.util.Map d() {
        java.util.Map map = this.f22929l;
        if (map instanceof java.util.NavigableMap) {
            return new p076i4.C2197h(this, (java.util.NavigableMap) map);
        }
        return map instanceof java.util.SortedMap ? new p076i4.C2203k(this, (java.util.SortedMap) map) : new p076i4.C2193f(this, map);
    }

    @Override // p076i4.AbstractC2215q, p076i4.AbstractC2222u
    public final java.util.Set f() {
        java.util.Map map = this.f22929l;
        if (map instanceof java.util.NavigableMap) {
            return new p076i4.C2199i(this, (java.util.NavigableMap) map);
        }
        return map instanceof java.util.SortedMap ? new p076i4.C2205l(this, (java.util.SortedMap) map) : new p076i4.C2195g(this, map);
    }

    @Override // p076i4.AbstractC2215q
    public final java.util.Collection j() {
        return (java.util.List) this.f22801n.get();
    }
}
