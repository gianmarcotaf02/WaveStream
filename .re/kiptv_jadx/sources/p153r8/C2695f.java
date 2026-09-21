package p153r8;

/* JADX INFO: renamed from: r8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2695f extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.C2695f f26959c = new p153r8.C2695f(p153r8.C2696g.f26961a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.m.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.C2693e builder = (p153r8.C2693e) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        boolean zO = aVar.o(this.f26960b, i3);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f26956a;
        int i9 = builder.f26957b;
        builder.f26957b = i9 + 1;
        zArr[i9] = zO;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.m.e(zArr, "<this>");
        p153r8.C2693e c2693e = new p153r8.C2693e();
        c2693e.f26956a = zArr;
        c2693e.f26957b = zArr.length;
        c2693e.b(10);
        return c2693e;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new boolean[0];
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        boolean[] content = (boolean[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.q(this.f26960b, i9, content[i9]);
        }
    }
}
