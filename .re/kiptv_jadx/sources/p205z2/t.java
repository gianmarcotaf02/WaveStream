package p205z2;

/* JADX INFO: loaded from: classes.dex */
public final class t extends p137q0.o implements Q0.InterfaceC0779m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p188x0.O f32309v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p205z2.C3166b f32310w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p205z2.J f32311x;
    public p205z2.C3174j y;

    @Override // Q0.InterfaceC0779m
    public final void T(Q0.H h9) {
        h9.a();
        v.C c9 = this.f32310w.f32218a;
        p188x0.O o8 = p188x0.z.f31141b;
        if (o8.equals(A2.e.f210a)) {
            o8 = this.f32309v;
        } else {
            this.f32310w.getClass();
        }
        p188x0.O o9 = o8;
        p205z2.J j = this.f32311x;
        p203z0.b bVar = h9.f8266h;
        if (j == null) {
            this.f32311x = new p205z2.J(o9, bVar.d(), h9.getLayoutDirection(), h9);
        }
        p205z2.C3174j c3174j = this.y;
        float f9 = c9.f28803a;
        if (c3174j == null) {
            float fY = h9.Y(f9);
            p205z2.C3174j c3174j2 = new p205z2.C3174j();
            c3174j2.f32257a = fY;
            this.y = c3174j2;
        }
        float f10 = -h9.Y(this.f32310w.f32219b);
        ((p191x3.C) bVar.f32128i.f23899i).a(f10, f10, f10, f10);
        p205z2.J j9 = this.f32311x;
        kotlin.jvm.internal.m.b(j9);
        p188x0.z zVarA = j9.a(o9, bVar.d(), h9.getLayoutDirection(), h9);
        p205z2.C3174j c3174j3 = this.y;
        kotlin.jvm.internal.m.b(c3174j3);
        float fY2 = h9.Y(f9);
        if (c3174j3.f32258b == null || c3174j3.f32257a != fY2) {
            c3174j3.f32257a = fY2;
            c3174j3.f32258b = new p203z0.g(fY2, 0.0f, 1, 0, null, 26);
        }
        p203z0.g gVar = c3174j3.f32258b;
        kotlin.jvm.internal.m.b(gVar);
        p188x0.z.m(h9, zVarA, c9.f28804b, 1.0f, gVar, 48);
        float f11 = -f10;
        ((p191x3.C) bVar.f32128i.f23899i).a(f11, f11, f11, f11);
    }
}
