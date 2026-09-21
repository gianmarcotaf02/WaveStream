package H5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LH5/K;", "Landroidx/lifecycle/e0;", "Companion", "H5/D", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class K extends androidx.lifecycle.e0 {
    private static final H5.D Companion = new H5.D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1451x5 f4096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.B3 f4097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E2.d f4098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H5.EnumC0398p f4099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f4100f;
    public final V7.n0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.W f4101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4102i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4106n;

    public K(E2.d dVar, p005a5.B3 searchRepository, p005a5.C1451x5 tmdbRepository, androidx.lifecycle.U savedStateHandle, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        kotlin.jvm.internal.m.e(savedStateHandle, "savedStateHandle");
        this.f4096b = tmdbRepository;
        this.f4097c = searchRepository;
        this.f4098d = dVar;
        java.lang.String str = (java.lang.String) savedStateHandle.a("genreKey");
        H5.EnumC0398p enumC0398p = null;
        java.lang.Object obj = null;
        if (str != null) {
            H5.EnumC0398p.Companion.getClass();
            for (java.lang.Object obj2 : H5.EnumC0398p.f4277m) {
                if (((H5.EnumC0398p) obj2).f4278h.equals(str)) {
                    obj = obj2;
                    break;
                }
            }
            enumC0398p = (H5.EnumC0398p) obj;
        }
        this.f4099e = enumC0398p;
        H5.EnumC0399q enumC0399q = H5.EnumC0399q.f4288h;
        p078i6.w wVar = p078i6.w.f23205h;
        V7.n0 n0VarB = V7.r.b(new H5.C(true, false, enumC0399q, wVar, wVar, 0, 0, "https://image.tmdb.org/t/p"));
        this.g = n0VarB;
        this.f4101h = new V7.W(n0VarB);
        this.f4103k = true;
        this.f4104l = true;
        e();
    }

    public final void e() {
        V7.n0 n0Var;
        java.lang.Object value;
        H5.EnumC0398p enumC0398p = this.f4099e;
        if (enumC0398p == null) {
            return;
        }
        do {
            n0Var = this.g;
            value = n0Var.getValue();
        } while (!n0Var.g(value, H5.C.a((H5.C) value, true, false, null, null, null, 0, 0, 252)));
        S7.C.A(androidx.lifecycle.X.h(this), null, new H5.H(this, enumC0398p, null), 3);
    }
}
