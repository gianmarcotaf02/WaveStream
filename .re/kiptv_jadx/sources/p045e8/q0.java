package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends p063g8.v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p045e8.a0 f21595e;

    /* JADX WARN: Illegal instructions before constructor call */
    public q0() {
        p045e8.a0 a0Var = p045e8.a0.f21531i;
        p063g8.u uVar = p045e8.Z.f21527a;
        p045e8.a0 a0Var2 = p045e8.a0.f21530h;
        super(uVar, 2, null);
        this.f21595e = a0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p045e8.q0) {
            return this.f21595e == ((p045e8.q0) obj).f21595e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21595e.hashCode();
    }
}
