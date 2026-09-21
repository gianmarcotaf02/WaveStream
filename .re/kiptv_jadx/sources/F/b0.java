package F;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends p137q0.o implements Q0.x0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final F.Y f3413A = new F.Y(this, 0);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public F.Y f3414B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public E6.r f3415v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public F.W f3416w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public x.EnumC3061p0 f3417x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Y0.j f3418z;

    public b0(E6.r rVar, F.W w6, x.EnumC3061p0 enumC3061p0, boolean z6) {
        this.f3415v = rVar;
        this.f3416w = w6;
        this.f3417x = enumC3061p0;
        this.y = z6;
        N0();
    }

    @Override // p137q0.o
    public final boolean C0() {
        return false;
    }

    public final void N0() {
        this.f3418z = new Y0.j(new F.Z(this, 0), new F.Z(this, 1));
        this.f3414B = this.y ? new F.Y(this, 1) : null;
    }

    @Override // Q0.x0
    public final void j0(Y0.x xVar) {
        E6.u[] uVarArr = Y0.v.f11144a;
        Y0.w wVar = Y0.t.f11129m;
        E6.u[] uVarArr2 = Y0.v.f11144a;
        E6.u uVar = uVarArr2[6];
        xVar.d(wVar, java.lang.Boolean.TRUE);
        xVar.d(Y0.t.f11115M, this.f3413A);
        if (this.f3417x == x.EnumC3061p0.f30978h) {
            Y0.j jVar = this.f3418z;
            if (jVar == null) {
                kotlin.jvm.internal.m.k("scrollAxisRange");
                throw null;
            }
            Y0.w wVar2 = Y0.t.f11138v;
            E6.u uVar2 = uVarArr2[13];
            xVar.d(wVar2, jVar);
        } else {
            Y0.j jVar2 = this.f3418z;
            if (jVar2 == null) {
                kotlin.jvm.internal.m.k("scrollAxisRange");
                throw null;
            }
            Y0.w wVar3 = Y0.t.f11137u;
            E6.u uVar3 = uVarArr2[12];
            xVar.d(wVar3, jVar2);
        }
        F.Y y = this.f3414B;
        if (y != null) {
            xVar.d(Y0.l.f11069f, new Y0.a(null, y));
        }
        xVar.d(Y0.l.f11063C, new Y0.a(null, new A0.b(16, new F.Z(this, 2))));
        Y0.c cVarE = this.f3416w.e();
        Y0.w wVar4 = Y0.t.f11124f;
        E6.u uVar4 = uVarArr2[23];
        xVar.d(wVar4, cVarE);
    }
}
