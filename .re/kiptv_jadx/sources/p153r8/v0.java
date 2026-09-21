package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.v0 f27009c = new p153r8.v0(p153r8.w0.f27015a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        int[] collectionSize = ((p070h6.u) obj).f22552h;
        kotlin.jvm.internal.m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.u0 builder = (p153r8.u0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        int iJ = aVar.d(this.f26960b, i3).j();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f27005a;
        int i9 = builder.f27006b;
        builder.f27006b = i9 + 1;
        iArr[i9] = iJ;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        int[] toBuilder = ((p070h6.u) obj).f22552h;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        p153r8.u0 u0Var = new p153r8.u0();
        u0Var.f27005a = toBuilder;
        u0Var.f27006b = toBuilder.length;
        u0Var.b(10);
        return u0Var;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new p070h6.u(new int[0]);
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        int[] iArr = ((p070h6.u) obj).f22552h;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.u(this.f26960b, i9).x(iArr[i9]);
        }
    }
}
