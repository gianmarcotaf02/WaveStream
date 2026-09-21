package p153r8;

/* JADX INFO: renamed from: r8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2698i extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.C2698i f26968c = new p153r8.C2698i(p153r8.C2699j.f26971a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.C2697h builder = (p153r8.C2697h) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        byte bL = aVar.l(this.f26960b, i3);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f26965a;
        int i9 = builder.f26966b;
        builder.f26966b = i9 + 1;
        bArr[i9] = bL;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.m.e(bArr, "<this>");
        p153r8.C2697h c2697h = new p153r8.C2697h();
        c2697h.f26965a = bArr;
        c2697h.f26966b = bArr.length;
        c2697h.b(10);
        return c2697h;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new byte[0];
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        byte[] content = (byte[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.l(this.f26960b, i9, content[i9]);
        }
    }
}
