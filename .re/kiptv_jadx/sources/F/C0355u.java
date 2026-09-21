package F;

/* JADX INFO: renamed from: F.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0355u extends p137q0.o implements Q0.InterfaceC0779m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public F.C0357w f3490v;

    @Override // p137q0.o
    public final void F0() {
        this.f3490v.getClass();
    }

    @Override // p137q0.o
    public final void G0() {
        F.C0357w c0357w = this.f3490v;
        c0357w.d();
        c0357w.f3494b = null;
    }

    @Override // Q0.InterfaceC0779m
    public final void T(Q0.H h9) {
        java.util.ArrayList arrayList = this.f3490v.f3499h;
        if (arrayList.size() <= 0) {
            h9.a();
        } else {
            B2.a.u(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F.C0355u) && kotlin.jvm.internal.m.a(this.f3490v, ((F.C0355u) obj).f3490v);
    }

    public final int hashCode() {
        return this.f3490v.hashCode();
    }

    public final java.lang.String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f3490v + ')';
    }
}
