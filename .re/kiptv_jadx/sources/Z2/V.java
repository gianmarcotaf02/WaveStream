package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class V implements java.lang.Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public java.lang.Boolean f12811A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public java.lang.Boolean f12812B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Z2.AbstractC1187e0 f12813C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public java.lang.Float f12814D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public java.lang.String f12815E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public java.lang.String f12816F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Z2.AbstractC1187e0 f12817G;
    public java.lang.Float H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Z2.AbstractC1187e0 f12818I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public java.lang.Float f12819J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f12820K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f12821L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12822M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f12823N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f12824O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f12825P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f12826Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f12827R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f12828S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f12829T;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12830h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Z2.AbstractC1187e0 f12831i;
    public java.lang.Float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Z2.AbstractC1187e0 f12832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Float f12833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Z2.F f12834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.Float f12835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Z2.F[] f12836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Z2.F f12837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.lang.Float f12838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Z2.C1212w f12839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f12840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Z2.F f12841t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.lang.Integer f12842u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public java.lang.Boolean f12843v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public A7.m f12844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public java.lang.String f12845x;
    public java.lang.String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.lang.String f12846z;

    public static Z2.V a() {
        Z2.V v6 = new Z2.V();
        v6.f12830h = -1L;
        Z2.C1212w c1212w = Z2.C1212w.f12961i;
        v6.f12831i = c1212w;
        v6.f12820K = 1;
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        v6.j = fValueOf;
        v6.f12832k = null;
        v6.f12833l = fValueOf;
        v6.f12834m = new Z2.F(1.0f);
        v6.f12821L = 1;
        v6.f12822M = 1;
        v6.f12835n = java.lang.Float.valueOf(4.0f);
        v6.f12836o = null;
        v6.f12837p = new Z2.F(0.0f);
        v6.f12838q = fValueOf;
        v6.f12839r = c1212w;
        v6.f12840s = null;
        v6.f12841t = new Z2.F(12.0f, 7);
        v6.f12842u = java.lang.Integer.valueOf(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST);
        v6.f12823N = 1;
        v6.f12824O = 1;
        v6.f12825P = 1;
        v6.f12826Q = 1;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        v6.f12843v = bool;
        v6.f12844w = null;
        v6.f12845x = null;
        v6.y = null;
        v6.f12846z = null;
        v6.f12811A = bool;
        v6.f12812B = bool;
        v6.f12813C = c1212w;
        v6.f12814D = fValueOf;
        v6.f12815E = null;
        v6.f12827R = 1;
        v6.f12816F = null;
        v6.f12817G = null;
        v6.H = fValueOf;
        v6.f12818I = null;
        v6.f12819J = fValueOf;
        v6.f12828S = 1;
        v6.f12829T = 1;
        return v6;
    }

    public final java.lang.Object clone() {
        Z2.V v6 = (Z2.V) super.clone();
        Z2.F[] fArr = this.f12836o;
        if (fArr != null) {
            v6.f12836o = (Z2.F[]) fArr.clone();
        }
        return v6;
    }
}
