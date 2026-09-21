package v;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements x.Q0 {
    public static final p079i7.f j = new p079i7.f(new v.F0(0), new p163t.F0(28), 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p020c0.C1675d0 f28843a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f28848f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p020c0.F f28849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p020c0.F f28850i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p020c0.C1675d0 f28844b = new p020c0.C1675d0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p020c0.C1675d0 f28845c = new p020c0.C1675d0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p202z.k f28846d = new p202z.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p020c0.C1675d0 f28847e = new p020c0.C1675d0(androidx.media3.common.util.Log.LOG_LEVEL_OFF);
    public final x.C3058o g = new x.C3058o(new p078i6.C2255f(27, this));

    public G0(int i3) {
        this.f28843a = new p020c0.C1675d0(i3);
        final int i9 = 0;
        this.f28849h = p020c0.AbstractC1703s.r(new kotlin.jvm.functions.Function0(this) { // from class: v.E0

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ v.G0 f28819i;

            {
                this.f28819i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i9) {
                    case 0:
                        v.G0 g9 = this.f28819i;
                        return java.lang.Boolean.valueOf(g9.f28843a.g() < g9.f28847e.g());
                    default:
                        return java.lang.Boolean.valueOf(this.f28819i.f28843a.g() > 0);
                }
            }
        });
        final int i10 = 1;
        this.f28850i = p020c0.AbstractC1703s.r(new kotlin.jvm.functions.Function0(this) { // from class: v.E0

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ v.G0 f28819i;

            {
                this.f28819i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i10) {
                    case 0:
                        v.G0 g9 = this.f28819i;
                        return java.lang.Boolean.valueOf(g9.f28843a.g() < g9.f28847e.g());
                    default:
                        return java.lang.Boolean.valueOf(this.f28819i.f28843a.g() > 0);
                }
            }
        });
    }

    @Override // x.Q0
    public final boolean a() {
        return this.g.a();
    }

    @Override // x.Q0
    public final boolean b() {
        return ((java.lang.Boolean) this.f28850i.getValue()).booleanValue();
    }

    @Override // x.Q0
    public final java.lang.Object c(v.n0 n0Var, p194x6.m mVar, p100l6.c cVar) {
        java.lang.Object objC = this.g.c(n0Var, mVar, cVar);
        return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
    }

    @Override // x.Q0
    public final boolean d() {
        return ((java.lang.Boolean) this.f28849h.getValue()).booleanValue();
    }

    @Override // x.Q0
    public final float e(float f9) {
        return this.g.e(f9);
    }
}
