package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.J f26914c = new p153r8.J(p153r8.K.f26915a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.I builder = (p153r8.I) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        int iK = aVar.k(this.f26960b, i3);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f26912a;
        int i9 = builder.f26913b;
        builder.f26913b = i9 + 1;
        iArr[i9] = iK;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        p153r8.I i3 = new p153r8.I();
        i3.f26912a = iArr;
        i3.f26913b = iArr.length;
        i3.b(10);
        return i3;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new int[0];
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        int[] content = (int[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.n(i9, content[i9], this.f26960b);
        }
    }
}
