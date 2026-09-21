package B;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f505i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f507l;

    public /* synthetic */ Y(int i3, int i9, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f504h = i9;
        this.j = obj;
        this.f506k = obj2;
        this.f507l = obj3;
        this.f505i = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        int iA;
        switch (this.f504h) {
            case 0:
                O0.f0 f0Var = (O0.f0) obj;
                O0.g0[] g0VarArr = (O0.g0[]) this.j;
                int length = g0VarArr.length;
                int i3 = 0;
                int i9 = 0;
                while (i3 < length) {
                    O0.g0 g0Var = g0VarArr[i3];
                    int i10 = i9 + 1;
                    kotlin.jvm.internal.m.b(g0Var);
                    java.lang.Object objE = g0Var.E();
                    B.W w6 = objE instanceof B.W ? (B.W) objE : null;
                    B.Z z6 = (B.Z) this.f506k;
                    z6.getClass();
                    B.C0087z c0087z = w6 != null ? w6.f502c : null;
                    int i11 = this.f505i;
                    if (c0087z != null) {
                        iA = c0087z.f582a.a(g0Var.f7639h, i11, p113n1.n.f25566h);
                    } else {
                        iA = z6.f509b.a(g0Var.f7640i, i11);
                    }
                    f0Var.g(g0Var, ((int[]) this.f507l)[i9], iA, 0.0f);
                    i3++;
                    i9 = i10;
                }
                return p070h6.A.f22523a;
            case 1:
                O0.f0 f0Var2 = (O0.f0) obj;
                J.O o8 = (J.O) this.j;
                J.y0 y0Var = (J.y0) o8.f5662e.invoke();
                p011b1.J j = y0Var != null ? y0Var.f5963a : null;
                boolean z9 = ((O0.U) this.f506k).getLayoutDirection() == p113n1.n.f25567i;
                O0.g0 g0Var2 = (O0.g0) this.f507l;
                p181w0.b bVarI = J.AbstractC0549n.i(f0Var2, o8.f5660c, o8.f5661d, j, z9, g0Var2.f7639h);
                x.EnumC3061p0 enumC3061p0 = x.EnumC3061p0.f30979i;
                int i12 = g0Var2.f7639h;
                J.w0 w0Var = o8.f5659b;
                w0Var.a(enumC3061p0, bVarI, this.f505i, i12);
                O0.f0.j(f0Var2, g0Var2, java.lang.Math.round(-w0Var.f5945a.g()), 0);
                return p070h6.A.f22523a;
            default:
                if (obj == ((p020c0.F) this.j)) {
                    throw new java.lang.IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof p121o0.t) {
                    int i13 = ((p089k0.g) this.f506k).f24414a - this.f505i;
                    p136q.C c9 = (p136q.C) this.f507l;
                    int iD = c9.d(obj);
                    c9.g(java.lang.Math.min(i13, iD >= 0 ? c9.f26299c[iD] : androidx.media3.common.util.Log.LOG_LEVEL_OFF), obj);
                }
                return p070h6.A.f22523a;
        }
    }

    public /* synthetic */ Y(O0.g0[] g0VarArr, B.Z z6, int i3, int[] iArr) {
        this.f504h = 0;
        this.j = g0VarArr;
        this.f506k = z6;
        this.f505i = i3;
        this.f507l = iArr;
    }
}
