package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.O f26921c = new p153r8.O(p153r8.P.f26922a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.m.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.N builder = (p153r8.N) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        long jH = aVar.h(this.f26960b, i3);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f26919a;
        int i9 = builder.f26920b;
        builder.f26920b = i9 + 1;
        jArr[i9] = jH;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.m.e(jArr, "<this>");
        p153r8.N n3 = new p153r8.N();
        n3.f26919a = jArr;
        n3.f26920b = jArr.length;
        n3.b(10);
        return n3;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new long[0];
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        long[] content = (long[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.D(this.f26960b, i9, content[i9]);
        }
    }
}
