package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.s0 f26999c = new p153r8.s0(p153r8.t0.f27001a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        byte[] collectionSize = ((p070h6.s) obj).f22550h;
        kotlin.jvm.internal.m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.r0 builder = (p153r8.r0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        byte bZ = aVar.d(this.f26960b, i3).z();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f26995a;
        int i9 = builder.f26996b;
        builder.f26996b = i9 + 1;
        bArr[i9] = bZ;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        byte[] toBuilder = ((p070h6.s) obj).f22550h;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        p153r8.r0 r0Var = new p153r8.r0();
        r0Var.f26995a = toBuilder;
        r0Var.f26996b = toBuilder.length;
        r0Var.b(10);
        return r0Var;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new p070h6.s(new byte[0]);
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        byte[] bArr = ((p070h6.s) obj).f22550h;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.u(this.f26960b, i9).i(bArr[i9]);
        }
    }
}
