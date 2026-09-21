package E2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E2.k f2786b = new E2.k(P3.e.n0(new java.util.LinkedHashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f2787a;

    public k(java.util.Map map) {
        this.f2787a = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E2.k) && kotlin.jvm.internal.m.a(this.f2787a, ((E2.k) obj).f2787a);
    }

    public final int hashCode() {
        return this.f2787a.hashCode();
    }

    public final java.lang.String toString() {
        return p121o0.p.r(new java.lang.StringBuilder("Extras(data="), this.f2787a, ')');
    }
}
