package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.B f26893c = new p153r8.B(p153r8.C.f26895a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.m.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.A builder = (p153r8.A) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        float fD = aVar.D(this.f26960b, i3);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f26889a;
        int i9 = builder.f26890b;
        builder.f26890b = i9 + 1;
        fArr[i9] = fD;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.m.e(fArr, "<this>");
        p153r8.A a2 = new p153r8.A();
        a2.f26889a = fArr;
        a2.f26890b = fArr.length;
        a2.b(10);
        return a2;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new float[0];
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        float[] content = (float[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.k(this.f26960b, i9, content[i9]);
        }
    }
}
