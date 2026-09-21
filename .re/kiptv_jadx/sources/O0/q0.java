package O0;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0.t0 f7679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O0.N f7680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O0.p0 f7681c = new O0.p0(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O0.p0 f7682d = new O0.p0(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O0.p0 f7683e = new O0.p0(this, 1);

    public q0(O0.t0 t0Var) {
        this.f7679a = t0Var;
    }

    public final O0.N a() {
        O0.N n3 = this.f7680b;
        if (n3 != null) {
            return n3;
        }
        throw new java.lang.IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
