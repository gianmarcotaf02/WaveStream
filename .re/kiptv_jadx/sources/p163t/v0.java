package p163t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f27722i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ v0(float f9, kotlin.jvm.functions.Function0 function0) {
        this.f27721h = 2;
        this.f27722i = f9;
        this.j = function0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f27721h) {
            case 0:
                long jLongValue = ((java.lang.Long) obj).longValue();
                p163t.y0 y0Var = (p163t.y0) this.j;
                if (!y0Var.g()) {
                    p020c0.C1677e0 c1677e0 = y0Var.g;
                    if (c1677e0.g() == Long.MIN_VALUE) {
                        c1677e0.h(jLongValue);
                        ((p020c0.C1681g0) y0Var.f27727a.f2006h).setValue(java.lang.Boolean.TRUE);
                    }
                    long jG = jLongValue - c1677e0.g();
                    float f9 = this.f27722i;
                    if (f9 != 0.0f) {
                        jG = O7.r.R(jG / ((double) f9));
                    }
                    y0Var.n(jG);
                    y0Var.h(jG, f9 == 0.0f);
                }
                return p070h6.A.f22523a;
            case 1:
                O0.f0 layout = (O0.f0) obj;
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                layout.g((O0.g0) this.j, -layout.k0(this.f27722i), 0, 0.0f);
                return p070h6.A.f22523a;
            default:
                p113n1.c offset = (p113n1.c) obj;
                kotlin.jvm.internal.m.e(offset, "$this$offset");
                return new p113n1.k((((long) O7.r.Q(this.f27722i - ((java.lang.Number) ((kotlin.jvm.functions.Function0) this.j).invoke()).floatValue())) << 32) | (((long) 0) & 4294967295L));
        }
    }

    public /* synthetic */ v0(java.lang.Object obj, float f9, int i3) {
        this.f27721h = i3;
        this.j = obj;
        this.f27722i = f9;
    }
}
