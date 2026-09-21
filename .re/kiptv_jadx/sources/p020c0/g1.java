package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements p020c0.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f18248a;

    public g1(java.lang.Object obj) {
        this.f18248a = obj;
    }

    @Override // p020c0.h1
    public final java.lang.Object a(p020c0.InterfaceC1691l0 interfaceC1691l0) {
        return this.f18248a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p020c0.g1) && kotlin.jvm.internal.m.a(this.f18248a, ((p020c0.g1) obj).f18248a);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f18248a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return B2.a.n(new java.lang.StringBuilder("StaticValueHolder(value="), this.f18248a, ')');
    }
}
