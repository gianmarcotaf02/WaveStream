package p153r8;

/* JADX INFO: renamed from: r8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2708t extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.C2708t f27000c = new p153r8.C2708t(p153r8.C2709u.f27003a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.m.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.C2707s builder = (p153r8.C2707s) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        double dW = aVar.w(this.f26960b, i3);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f26997a;
        int i9 = builder.f26998b;
        builder.f26998b = i9 + 1;
        dArr[i9] = dW;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.m.e(dArr, "<this>");
        p153r8.C2707s c2707s = new p153r8.C2707s();
        c2707s.f26997a = dArr;
        c2707s.f26998b = dArr.length;
        c2707s.b(10);
        return c2707s;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new double[0];
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        double[] content = (double[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.B(this.f26960b, i9, content[i9]);
        }
    }
}
