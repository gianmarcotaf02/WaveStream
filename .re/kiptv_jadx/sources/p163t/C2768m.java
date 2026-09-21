package p163t;

/* JADX INFO: renamed from: t.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2768m implements p020c0.e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p163t.E0 f27639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p020c0.C1681g0 f27640i;
    public p163t.r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f27641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f27642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27643m;

    public /* synthetic */ C2768m(p163t.E0 e6, java.lang.Object obj, p163t.r rVar, int i3) {
        this(e6, obj, (i3 & 4) != 0 ? null : rVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // p020c0.e1
    public final java.lang.Object getValue() {
        return this.f27640i.getValue();
    }

    public final java.lang.String toString() {
        return "AnimationState(value=" + this.f27640i.getValue() + ", velocity=" + this.f27639h.f27454b.invoke(this.j) + ", isRunning=" + this.f27643m + ", lastFrameTimeNanos=" + this.f27641k + ", finishedTimeNanos=" + this.f27642l + ')';
    }

    public C2768m(p163t.E0 e6, java.lang.Object obj, p163t.r rVar, long j, long j9, boolean z6) {
        p163t.r rVarI;
        this.f27639h = e6;
        this.f27640i = p020c0.AbstractC1703s.y(obj);
        if (rVar != null) {
            rVarI = p163t.AbstractC2750d.i(rVar);
        } else {
            rVarI = (p163t.r) e6.f27453a.invoke(obj);
            rVarI.d();
        }
        this.j = rVarI;
        this.f27641k = j;
        this.f27642l = j9;
        this.f27643m = z6;
    }
}
