package p205z2;

/* JADX INFO: loaded from: classes.dex */
public final class H extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f32178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f32179i;
    public final /* synthetic */ kotlin.jvm.functions.Function0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(boolean z6, boolean z9, kotlin.jvm.functions.Function0 function0) {
        super(1);
        this.f32178h = z6;
        this.f32179i = z9;
        this.j = function0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        Y0.x xVar = (Y0.x) obj;
        E6.u[] uVarArr = Y0.v.f11144a;
        Y0.w wVar = Y0.t.f11111I;
        E6.u uVar = Y0.v.f11144a[22];
        xVar.d(wVar, java.lang.Boolean.valueOf(this.f32178h));
        xVar.d(Y0.l.f11065b, new Y0.a(null, new Z.Y(1, this.j)));
        xVar.d(Y0.l.f11066c, new Y0.a(null, new p205z2.C3168d(0, 4)));
        boolean z6 = this.f32179i;
        p070h6.A a2 = p070h6.A.f22523a;
        if (!z6) {
            xVar.d(Y0.t.f11126i, a2);
        }
        return a2;
    }
}
