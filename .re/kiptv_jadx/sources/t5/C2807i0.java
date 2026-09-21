package t5;

/* JADX INFO: renamed from: t5.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2807i0 implements p194x6.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f28207h;

    public /* synthetic */ C2807i0(float f9) {
        this.f28207h = f9;
    }

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        O0.U layout = (O0.U) obj;
        O0.Q measurable = (O0.Q) obj2;
        p113n1.a aVar = (p113n1.a) obj3;
        kotlin.jvm.internal.m.e(layout, "$this$layout");
        kotlin.jvm.internal.m.e(measurable, "measurable");
        float f9 = this.f28207h;
        int iK0 = layout.k0(f9) * 2;
        long j = aVar.f25547a;
        int iJ = p113n1.a.j(j) + iK0;
        long j9 = aVar.f25547a;
        O0.g0 g0VarC = measurable.C(p113n1.a.a(iJ, j, p113n1.a.h(j9) + iK0, 0, 0, 12));
        return layout.q0(p113n1.a.h(j9), g0VarC.f7640i, p078i6.x.f23206h, new p163t.v0(g0VarC, f9, 1));
    }
}
