package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends p063g8.v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p045e8.a0 f21588e;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0() {
        p045e8.a0 a0Var = p045e8.a0.f21531i;
        p063g8.u uVar = p045e8.Z.f21528b;
        p045e8.a0 a0Var2 = p045e8.a0.f21530h;
        super(uVar, 2, null);
        this.f21588e = a0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p045e8.o0) {
            return this.f21588e == ((p045e8.o0) obj).f21588e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21588e.hashCode();
    }
}
