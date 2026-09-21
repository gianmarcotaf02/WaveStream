package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.n0 f26982c = new p153r8.n0(p153r8.o0.f26984a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.m.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.m0 builder = (p153r8.m0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        short sY = aVar.y(this.f26960b, i3);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f26978a;
        int i9 = builder.f26979b;
        builder.f26979b = i9 + 1;
        sArr[i9] = sY;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.m.e(sArr, "<this>");
        p153r8.m0 m0Var = new p153r8.m0();
        m0Var.f26978a = sArr;
        m0Var.f26979b = sArr.length;
        m0Var.b(10);
        return m0Var;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new short[0];
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        short[] content = (short[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.m(this.f26960b, i9, content[i9]);
        }
    }
}
