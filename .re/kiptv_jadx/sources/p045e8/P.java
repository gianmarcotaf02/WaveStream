package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends p063g8.v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p045e8.a0 f21517e;

    /* JADX WARN: Illegal instructions before constructor call */
    public P() {
        p045e8.a0 a0Var = p045e8.a0.f21531i;
        p063g8.u uVar = p045e8.AbstractC2128k.f21551b;
        p045e8.a0 a0Var2 = p045e8.a0.f21530h;
        super(uVar, 2, null);
        this.f21517e = a0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p045e8.P) {
            return this.f21517e == ((p045e8.P) obj).f21517e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21517e.hashCode();
    }
}
