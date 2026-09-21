package J;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.P0 f5710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J.V f5711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p175v0.n f5712c;

    public U(R0.P0 p2) {
        this.f5710a = p2;
    }

    public final J.V a() {
        J.V v6 = this.f5711b;
        if (v6 != null) {
            return v6;
        }
        kotlin.jvm.internal.m.k("keyboardActions");
        throw null;
    }

    public final boolean b(int i3) {
        p194x6.j jVar;
        R0.P0 p2;
        if (i3 == 7) {
            jVar = a().f5714a;
        } else {
            if (i3 == 2 || i3 == 6 || i3 == 5 || i3 == 3 || i3 == 4) {
                a();
            } else if (i3 != 1 && i3 != 0) {
                throw new java.lang.IllegalStateException("invalid ImeAction");
            }
            jVar = null;
        }
        if (jVar != null) {
            jVar.invoke(this);
            return true;
        }
        if (i3 == 6) {
            p175v0.n nVar = this.f5712c;
            if (nVar != null) {
                ((p175v0.p) nVar).g(1, true);
                return true;
            }
            kotlin.jvm.internal.m.k("focusManager");
            throw null;
        }
        if (i3 != 5) {
            if (i3 != 7 || (p2 = this.f5710a) == null) {
                return false;
            }
            ((R0.C0845r0) p2).a();
            return true;
        }
        p175v0.n nVar2 = this.f5712c;
        if (nVar2 != null) {
            ((p175v0.p) nVar2).g(2, true);
            return true;
        }
        kotlin.jvm.internal.m.k("focusManager");
        throw null;
    }
}
