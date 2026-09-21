package Z;

/* JADX INFO: renamed from: Z.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1151i0 extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z.C1165p0 f12428i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1151i0(Z.C1165p0 c1165p0, int i3) {
        super(1);
        this.f12427h = i3;
        this.f12428i = c1165p0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        Z.C1165p0 c1165p0 = this.f12428i;
        switch (this.f12427h) {
            case 0:
                Y0.x xVar = (Y0.x) obj;
                E6.u[] uVarArr = Y0.v.f11144a;
                Y0.w wVar = Y0.t.j;
                E6.u uVar = Y0.v.f11144a[3];
                xVar.d(wVar, new Y0.f());
                xVar.d(Y0.l.f11083v, new Y0.a(null, new A8.m(14, c1165p0)));
                return p070h6.A.f22523a;
            default:
                return java.lang.Boolean.valueOf(kotlin.jvm.internal.m.a(((Z.C) obj).f12189a, c1165p0));
        }
    }
}
