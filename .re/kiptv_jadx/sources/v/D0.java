package v;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends p137q0.o implements Q0.InterfaceC0788w, Q0.x0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v.G0 f28813v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f28814w;

    @Override // Q0.InterfaceC0788w
    public final int A(Q0.N n3, O0.Q q9, int i3) {
        if (!this.f28814w) {
            i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        return q9.Z(i3);
    }

    @Override // Q0.InterfaceC0788w
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        v.AbstractC2901v.j(j, this.f28814w ? x.EnumC3061p0.f30978h : x.EnumC3061p0.f30979i);
        boolean z6 = this.f28814w;
        int iH = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        int iG = z6 ? Integer.MAX_VALUE : p113n1.a.g(j);
        if (this.f28814w) {
            iH = p113n1.a.h(j);
        }
        O0.g0 g0VarC = q9.C(p113n1.a.a(0, j, iH, 0, iG, 5));
        int i3 = g0VarC.f7639h;
        int iH2 = p113n1.a.h(j);
        if (i3 > iH2) {
            i3 = iH2;
        }
        int i9 = g0VarC.f7640i;
        int iG2 = p113n1.a.g(j);
        if (i9 > iG2) {
            i9 = iG2;
        }
        int i10 = g0VarC.f7640i - i9;
        int i11 = g0VarC.f7639h - i3;
        if (!this.f28814w) {
            i10 = i11;
        }
        v.G0 g9 = this.f28813v;
        p020c0.C1675d0 c1675d0 = g9.f28847e;
        p020c0.C1675d0 c1675d1 = g9.f28843a;
        c1675d0.h(i10);
        p121o0.f fVarE = p121o0.o.e();
        p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
        p121o0.f fVarH = p121o0.o.h(fVarE);
        try {
            if (c1675d1.g() > i10) {
                c1675d1.h(i10);
            }
            p121o0.o.k(fVarE, fVarH, jVarE);
            this.f28813v.f28844b.h(this.f28814w ? i9 : i3);
            this.f28813v.f28845c.h(this.f28814w ? g0VarC.f7640i : g0VarC.f7639h);
            return u6.q0(i3, i9, p078i6.x.f23206h, new J.B0(this, i10, g0VarC, 2));
        } catch (java.lang.Throwable th) {
            p121o0.o.k(fVarE, fVarH, jVarE);
            throw th;
        }
    }

    @Override // Q0.InterfaceC0788w
    public final int b0(Q0.N n3, O0.Q q9, int i3) {
        if (this.f28814w) {
            i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        return q9.n(i3);
    }

    @Override // Q0.InterfaceC0788w
    public final int j(Q0.N n3, O0.Q q9, int i3) {
        if (!this.f28814w) {
            i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        return q9.a(i3);
    }

    @Override // Q0.x0
    public final void j0(Y0.x xVar) {
        E6.u[] uVarArr = Y0.v.f11144a;
        Y0.w wVar = Y0.t.f11129m;
        E6.u[] uVarArr2 = Y0.v.f11144a;
        E6.u uVar = uVarArr2[6];
        xVar.d(wVar, java.lang.Boolean.TRUE);
        final int i3 = 0;
        final int i9 = 1;
        Y0.j jVar = new Y0.j(new kotlin.jvm.functions.Function0(this) { // from class: v.C0

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ v.D0 f28806i;

            {
                this.f28806i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i3) {
                    case 0:
                        return java.lang.Float.valueOf(this.f28806i.f28813v.f28843a.g());
                    default:
                        return java.lang.Float.valueOf(this.f28806i.f28813v.f28847e.g());
                }
            }
        }, new kotlin.jvm.functions.Function0(this) { // from class: v.C0

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ v.D0 f28806i;

            {
                this.f28806i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i9) {
                    case 0:
                        return java.lang.Float.valueOf(this.f28806i.f28813v.f28843a.g());
                    default:
                        return java.lang.Float.valueOf(this.f28806i.f28813v.f28847e.g());
                }
            }
        });
        if (this.f28814w) {
            Y0.w wVar2 = Y0.t.f11138v;
            E6.u uVar2 = uVarArr2[13];
            xVar.d(wVar2, jVar);
        } else {
            Y0.w wVar3 = Y0.t.f11137u;
            E6.u uVar3 = uVarArr2[12];
            xVar.d(wVar3, jVar);
        }
    }

    @Override // Q0.InterfaceC0788w
    public final int t0(Q0.N n3, O0.Q q9, int i3) {
        if (this.f28814w) {
            i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        return q9.z(i3);
    }
}
