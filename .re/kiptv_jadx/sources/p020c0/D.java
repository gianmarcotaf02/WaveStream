package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class D implements p020c0.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p194x6.j f18103a;

    public D(p194x6.j jVar) {
        this.f18103a = jVar;
    }

    @Override // p020c0.h1
    public final java.lang.Object a(p020c0.InterfaceC1691l0 interfaceC1691l0) {
        return this.f18103a.invoke(interfaceC1691l0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p020c0.D) && kotlin.jvm.internal.m.a(this.f18103a, ((p020c0.D) obj).f18103a);
    }

    public final int hashCode() {
        return this.f18103a.hashCode();
    }

    public final java.lang.String toString() {
        return "ComputedValueHolder(compute=" + this.f18103a + ')';
    }
}
