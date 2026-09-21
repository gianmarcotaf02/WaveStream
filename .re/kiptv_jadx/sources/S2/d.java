package S2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements S2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.l f9216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S2.h f9217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Throwable f9218c;

    public d(E2.l lVar, S2.h hVar, java.lang.Throwable th) {
        this.f9216a = lVar;
        this.f9217b = hVar;
        this.f9218c = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2.d)) {
            return false;
        }
        S2.d dVar = (S2.d) obj;
        return kotlin.jvm.internal.m.a(this.f9216a, dVar.f9216a) && kotlin.jvm.internal.m.a(this.f9217b, dVar.f9217b) && kotlin.jvm.internal.m.a(this.f9218c, dVar.f9218c);
    }

    @Override // S2.k
    public final S2.h getRequest() {
        return this.f9217b;
    }

    public final int hashCode() {
        E2.l lVar = this.f9216a;
        return this.f9218c.hashCode() + ((this.f9217b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "ErrorResult(image=" + this.f9216a + ", request=" + this.f9217b + ", throwable=" + this.f9218c + ')';
    }
}
