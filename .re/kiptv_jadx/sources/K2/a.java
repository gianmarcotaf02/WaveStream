package K2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.l f6767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H2.h f6769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f6770d;

    public a(E2.l lVar, boolean z6, H2.h hVar, java.lang.String str) {
        this.f6767a = lVar;
        this.f6768b = z6;
        this.f6769c = hVar;
        this.f6770d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K2.a)) {
            return false;
        }
        K2.a aVar = (K2.a) obj;
        return kotlin.jvm.internal.m.a(this.f6767a, aVar.f6767a) && this.f6768b == aVar.f6768b && this.f6769c == aVar.f6769c && kotlin.jvm.internal.m.a(this.f6770d, aVar.f6770d);
    }

    public final int hashCode() {
        int iHashCode = (this.f6769c.hashCode() + p121o0.p.f(this.f6767a.hashCode() * 31, 31, this.f6768b)) * 31;
        java.lang.String str = this.f6770d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecuteResult(image=");
        sb.append(this.f6767a);
        sb.append(", isSampled=");
        sb.append(this.f6768b);
        sb.append(", dataSource=");
        sb.append(this.f6769c);
        sb.append(", diskCacheKey=");
        return Y6.f.l(sb, this.f6770d, ')');
    }
}
