package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends p063g8.v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p045e8.a0 f21533e;

    /* JADX WARN: Illegal instructions before constructor call */
    public b0() {
        p045e8.a0 a0Var = p045e8.a0.f21531i;
        p063g8.u uVar = p045e8.j0.f21548c;
        p045e8.a0 a0Var2 = p045e8.a0.f21530h;
        super(uVar, 2, null);
        this.f21533e = a0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p045e8.b0) {
            return this.f21533e == ((p045e8.b0) obj).f21533e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21533e.hashCode();
    }
}
