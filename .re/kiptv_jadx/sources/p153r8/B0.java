package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 extends p153r8.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p153r8.B0 f26894c = new p153r8.B0(p153r8.C0.f26897a);

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        short[] collectionSize = ((p070h6.z) obj).f22557h;
        kotlin.jvm.internal.m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p153r8.r, p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        p153r8.A0 builder = (p153r8.A0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        short sA = aVar.d(this.f26960b, i3).A();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f26891a;
        int i9 = builder.f26892b;
        builder.f26892b = i9 + 1;
        sArr[i9] = sA;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        short[] toBuilder = ((p070h6.z) obj).f22557h;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        p153r8.A0 a2 = new p153r8.A0();
        a2.f26891a = toBuilder;
        a2.f26892b = toBuilder.length;
        a2.b(10);
        return a2;
    }

    @Override // p153r8.f0
    public final java.lang.Object j() {
        return new p070h6.z(new short[0]);
    }

    @Override // p153r8.f0
    public final void k(p143q8.b encoder, java.lang.Object obj, int i3) {
        short[] sArr = ((p070h6.z) obj).f22557h;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.u(this.f26960b, i9).g(sArr[i9]);
        }
    }
}
