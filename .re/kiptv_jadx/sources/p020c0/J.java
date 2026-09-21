package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class J implements p020c0.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p020c0.C1681g0 f18121a;

    public J(p020c0.C1681g0 c1681g0) {
        this.f18121a = c1681g0;
    }

    @Override // p020c0.h1
    public final java.lang.Object a(p020c0.InterfaceC1691l0 interfaceC1691l0) {
        return this.f18121a.getValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p020c0.J) && this.f18121a.equals(((p020c0.J) obj).f18121a);
    }

    public final int hashCode() {
        return this.f18121a.hashCode();
    }

    public final java.lang.String toString() {
        return "DynamicValueHolder(state=" + this.f18121a + ')';
    }
}
