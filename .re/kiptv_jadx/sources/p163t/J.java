package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Float f27476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p163t.InterfaceC2780y f27477b;

    public J(java.lang.Float f9, p163t.InterfaceC2780y interfaceC2780y) {
        this.f27476a = f9;
        this.f27477b = interfaceC2780y;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p163t.J)) {
            return false;
        }
        p163t.J j = (p163t.J) obj;
        return j.f27476a.equals(this.f27476a) && kotlin.jvm.internal.m.a(j.f27477b, this.f27477b);
    }

    public final int hashCode() {
        return this.f27477b.hashCode() + p121o0.p.d(0, this.f27476a.hashCode() * 31, 31);
    }
}
