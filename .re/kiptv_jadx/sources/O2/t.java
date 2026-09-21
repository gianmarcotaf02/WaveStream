package O2;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O2.s f7941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E2.k f7942d;

    public t(java.lang.String str, java.lang.String str2, O2.s sVar, E2.k kVar) {
        this.f7939a = str;
        this.f7940b = str2;
        this.f7941c = sVar;
        this.f7942d = kVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O2.t)) {
            return false;
        }
        O2.t tVar = (O2.t) obj;
        return kotlin.jvm.internal.m.a(this.f7939a, tVar.f7939a) && kotlin.jvm.internal.m.a(this.f7940b, tVar.f7940b) && kotlin.jvm.internal.m.a(this.f7941c, tVar.f7941c) && kotlin.jvm.internal.m.a(this.f7942d, tVar.f7942d);
    }

    public final int hashCode() {
        return this.f7942d.f2787a.hashCode() + B2.a.c(B2.a.a(this.f7939a.hashCode() * 31, 31, this.f7940b), 961, this.f7941c.f7938a);
    }

    public final java.lang.String toString() {
        return "NetworkRequest(url=" + this.f7939a + ", method=" + this.f7940b + ", headers=" + this.f7941c + ", body=null, extras=" + this.f7942d + ')';
    }
}
