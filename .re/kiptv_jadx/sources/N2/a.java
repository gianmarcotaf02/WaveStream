package N2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f7301b;

    public a(java.lang.String str, java.util.Map map) {
        this.f7300a = str;
        this.f7301b = P3.e.n0(map);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N2.a)) {
            return false;
        }
        N2.a aVar = (N2.a) obj;
        return kotlin.jvm.internal.m.a(this.f7300a, aVar.f7300a) && kotlin.jvm.internal.m.a(this.f7301b, aVar.f7301b);
    }

    public final int hashCode() {
        return this.f7301b.hashCode() + (this.f7300a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Key(key=");
        sb.append(this.f7300a);
        sb.append(", extras=");
        return p121o0.p.r(sb, this.f7301b, ')');
    }
}
