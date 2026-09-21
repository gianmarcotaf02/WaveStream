package p153r8;

/* JADX INFO: renamed from: r8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2704o extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.C2704o f26983c = new p153r8.C2704o(p153r8.C2705p.f26986a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.m.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.C2703n builder = (p153r8.C2703n) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        char C9 = aVar.C(this.f26960b, i3);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f26980a;
        int i9 = builder.f26981b;
        builder.f26981b = i9 + 1;
        cArr[i9] = C9;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.m.e(cArr, "<this>");
        p153r8.C2703n c2703n = new p153r8.C2703n();
        c2703n.f26980a = cArr;
        c2703n.f26981b = cArr.length;
        c2703n.b(10);
        return c2703n;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new char[0];
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        char[] content = (char[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.d(this.f26960b, i9, content[i9]);
        }
    }
}
