package H5;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p005a5.B3;
import p005a5.C1451x5;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LH5/K;", "Landroidx/lifecycle/e0;", "Companion", "H5/D", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class K extends androidx.lifecycle.e0 {
    private static final D Companion = new D();

    public final C1451x5 f4096b;

    public final B3 f4097c;

    public final E2.d f4098d;

    public final EnumC0398p f4099e;

    public Object f4100f;
    public final V7.n0 g;

    public final V7.W f4101h;

    public int f4102i;
    public int j;

    public boolean f4103k;

    public boolean f4104l;

    public boolean f4105m;

    public boolean f4106n;

    public K(E2.d dVar, B3 searchRepository, C1451x5 tmdbRepository, androidx.lifecycle.U savedStateHandle, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        kotlin.jvm.internal.m.e(savedStateHandle, "savedStateHandle");
        this.f4096b = tmdbRepository;
        this.f4097c = searchRepository;
        this.f4098d = dVar;
        String str = (String) savedStateHandle.a("genreKey");
        EnumC0398p enumC0398p = null;
        Object obj = null;
        if (str != null) {
            EnumC0398p.Companion.getClass();
            for (Object obj2 : EnumC0398p.f4277m) {
                if (((EnumC0398p) obj2).f4278h.equals(str)) {
                    obj = obj2;
                    break;
                }
            }
            enumC0398p = (EnumC0398p) obj;
        }
        this.f4099e = enumC0398p;
        EnumC0399q enumC0399q = EnumC0399q.f4288h;
        p078i6.w wVar = p078i6.w.f23205h;
        V7.n0 n0VarB = V7.r.b(new C(true, false, enumC0399q, wVar, wVar, 0, 0, "https://image.tmdb.org/t/p"));
        this.g = n0VarB;
        this.f4101h = new V7.W(n0VarB);
        this.f4103k = true;
        this.f4104l = true;
        e();
    }

    public final void e() {
        V7.n0 n0Var;
        Object value;
        EnumC0398p enumC0398p = this.f4099e;
        if (enumC0398p == null) {
            return;
        }
        do {
            n0Var = this.g;
            value = n0Var.getValue();
        } while (!n0Var.g(value, C.a((C) value, true, false, null, null, null, 0, 0, 252)));
        S7.C.A(androidx.lifecycle.X.h(this), null, new H(this, enumC0398p, null), 3);
    }
}
