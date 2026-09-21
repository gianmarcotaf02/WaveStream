package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements p163t.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f27695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f27696b;

    public t0(java.lang.Object obj, java.lang.Object obj2) {
        this.f27695a = obj;
        this.f27696b = obj2;
    }

    @Override // p163t.s0
    public final java.lang.Object a() {
        return this.f27695a;
    }

    @Override // p163t.s0
    public final java.lang.Object b() {
        return this.f27696b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p163t.s0)) {
            return false;
        }
        p163t.s0 s0Var = (p163t.s0) obj;
        if (kotlin.jvm.internal.m.a(this.f27695a, s0Var.a())) {
            return kotlin.jvm.internal.m.a(this.f27696b, s0Var.b());
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f27695a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.f27696b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
