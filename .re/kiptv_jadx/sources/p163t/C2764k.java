package p163t;

/* JADX INFO: renamed from: t.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2764k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p163t.E0 f27623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f27624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f27626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p020c0.C1681g0 f27627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p163t.r f27628f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27629h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p020c0.C1681g0 f27630i = p020c0.AbstractC1703s.y(java.lang.Boolean.TRUE);

    public C2764k(java.lang.Object obj, p163t.E0 e6, p163t.r rVar, long j, java.lang.Object obj2, long j9, kotlin.jvm.functions.Function0 function0) {
        this.f27623a = e6;
        this.f27624b = obj2;
        this.f27625c = j9;
        this.f27626d = function0;
        this.f27627e = p020c0.AbstractC1703s.y(obj);
        this.f27628f = p163t.AbstractC2750d.i(rVar);
        this.g = j;
    }

    public final void a() {
        this.f27630i.setValue(java.lang.Boolean.FALSE);
        this.f27626d.invoke();
    }
}
