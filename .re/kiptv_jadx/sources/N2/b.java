package N2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.l f7302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f7303b;

    public b(E2.l lVar, java.util.Map map) {
        this.f7302a = lVar;
        this.f7303b = P3.e.n0(map);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N2.b)) {
            return false;
        }
        N2.b bVar = (N2.b) obj;
        return kotlin.jvm.internal.m.a(this.f7302a, bVar.f7302a) && kotlin.jvm.internal.m.a(this.f7303b, bVar.f7303b);
    }

    public final int hashCode() {
        return this.f7303b.hashCode() + (this.f7302a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Value(image=");
        sb.append(this.f7302a);
        sb.append(", extras=");
        return p121o0.p.r(sb, this.f7303b, ')');
    }
}
