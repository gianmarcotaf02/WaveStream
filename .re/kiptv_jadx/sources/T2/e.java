package T2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements T2.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T2.h f9735b;

    public e(T2.h hVar) {
        this.f9735b = hVar;
    }

    @Override // T2.i
    public final java.lang.Object e(p100l6.c cVar) {
        return this.f9735b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T2.e) && kotlin.jvm.internal.m.a(this.f9735b, ((T2.e) obj).f9735b);
    }

    public final int hashCode() {
        return this.f9735b.hashCode();
    }

    public final java.lang.String toString() {
        return "RealSizeResolver(size=" + this.f9735b + ')';
    }
}
