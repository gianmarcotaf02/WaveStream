package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.y0 f27024c = new p153r8.y0(p153r8.z0.f27029a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        long[] collectionSize = ((p070h6.w) obj).f22554h;
        kotlin.jvm.internal.m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.x0 builder = (p153r8.x0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        long jN = aVar.d(this.f26960b, i3).n();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f27020a;
        int i9 = builder.f27021b;
        builder.f27021b = i9 + 1;
        jArr[i9] = jN;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        long[] toBuilder = ((p070h6.w) obj).f22554h;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        p153r8.x0 x0Var = new p153r8.x0();
        x0Var.f27020a = toBuilder;
        x0Var.f27021b = toBuilder.length;
        x0Var.b(10);
        return x0Var;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new p070h6.w(new long[0]);
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        long[] jArr = ((p070h6.w) obj).f22554h;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.u(this.f26960b, i9).C(jArr[i9]);
        }
    }
}
