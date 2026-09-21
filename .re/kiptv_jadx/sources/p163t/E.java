package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class E implements p163t.InterfaceC2766l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p163t.InterfaceC2779x f27450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p163t.T f27451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27452c;

    public E(p163t.InterfaceC2779x interfaceC2779x, p163t.T t9, long j) {
        this.f27450a = interfaceC2779x;
        this.f27451b = t9;
        this.f27452c = j;
    }

    @Override // p163t.InterfaceC2766l
    public final p163t.G0 a(p163t.E0 e6) {
        return new N2.e(this.f27450a.a(e6), this.f27451b, this.f27452c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p163t.E) {
            p163t.E e6 = (p163t.E) obj;
            if (kotlin.jvm.internal.m.a(e6.f27450a, this.f27450a) && e6.f27451b == this.f27451b && e6.f27452c == this.f27452c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f27452c) + ((this.f27451b.hashCode() + (this.f27450a.hashCode() * 31)) * 31);
    }
}
