package E5;

/* JADX INFO: renamed from: E5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0316u implements p194x6.o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t5.C2785b f3154i;
    public final /* synthetic */ boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t5.C2796e1 f3155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f3156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f3157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f3158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3159o;

    public C0316u(java.util.List list, t5.C2785b c2785b, boolean z6, t5.C2796e1 c2796e1, kotlin.jvm.functions.Function0 function0, p194x6.j jVar, p020c0.X x9, int i3) {
        this.f3153h = list;
        this.f3154i = c2785b;
        this.j = z6;
        this.f3155k = c2796e1;
        this.f3156l = function0;
        this.f3157m = jVar;
        this.f3158n = x9;
        this.f3159o = i3;
    }

    @Override // p194x6.o
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i3;
        java.lang.Object c0312s;
        java.lang.String str;
        D.C0196c c0196c = (D.C0196c) obj;
        int iIntValue = ((java.lang.Number) obj2).intValue();
        p020c0.C1700q c1700q = (p020c0.C1700q) obj3;
        int iIntValue2 = ((java.lang.Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i3 = (c1700q.f(c0196c) ? 4 : 2) | iIntValue2;
        } else {
            i3 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i3 |= c1700q.d(iIntValue) ? 32 : 16;
        }
        boolean z6 = true;
        if (c1700q.T(i3 & 1, (i3 & 147) != 146)) {
            java.lang.String str2 = (java.lang.String) this.f3153h.get(iIntValue);
            c1700q.c0(12294325);
            t5.C2785b c2785b = this.f3154i;
            boolean z9 = c2785b.f28131d;
            boolean z10 = this.j;
            boolean z11 = z9 && !z10;
            t5.C2796e1 c2796e1 = this.f3155k;
            p175v0.y yVarB = c2796e1.b(iIntValue);
            c1700q.c0(-1107966477);
            boolean zH = c1700q.h(c2785b) | c1700q.g(z10) | c1700q.f(this.f3156l) | c1700q.f(this.f3157m) | c1700q.f(str2);
            java.lang.Object objQ = c1700q.Q();
            p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
            if (zH || objQ == c1676e) {
                str = str2;
                c0312s = new E5.C0312s(this.f3154i, this.j, this.f3156l, this.f3157m, str);
                c1700q.n0(c0312s);
            } else {
                str = str2;
                c0312s = objQ;
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) c0312s;
            c1700q.p(false);
            c1700q.c0(-1107973988);
            p020c0.X x9 = this.f3158n;
            boolean zF = c1700q.f(x9);
            int i9 = this.f3159o;
            boolean zD = zF | c1700q.d(i9) | c1700q.f(c2796e1);
            if ((((i3 & 112) ^ 48) <= 32 || !c1700q.d(iIntValue)) && (i3 & 48) != 32) {
                z6 = false;
            }
            boolean z12 = zD | z6;
            java.lang.Object objQ2 = c1700q.Q();
            if (z12 || objQ2 == c1676e) {
                objQ2 = new E5.C0314t(i9, c2796e1, iIntValue, x9);
                c1700q.n0(objQ2);
            }
            c1700q.p(false);
            E5.AbstractC0322x.a(str, z11, function0, yVarB, (kotlin.jvm.functions.Function0) objQ2, c1700q, 0);
            c1700q.p(false);
        } else {
            c1700q.W();
        }
        return p070h6.A.f22523a;
    }
}
