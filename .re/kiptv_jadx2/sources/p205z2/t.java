package p205z2;

import A2.e;
import Q0.H;
import Q0.InterfaceC0779m;
import kotlin.jvm.internal.m;
import p137q0.o;
import p188x0.O;
import p188x0.z;
import p203z0.b;
import p203z0.g;
import v.C;

public final class t extends o implements InterfaceC0779m {

    public O f32309v;

    public C3166b f32310w;

    public J f32311x;
    public C3174j y;

    @Override
    public final void T(H h9) {
        h9.a();
        C c9 = this.f32310w.f32218a;
        O o8 = z.f31141b;
        if (o8.equals(e.f210a)) {
            o8 = this.f32309v;
        } else {
            this.f32310w.getClass();
        }
        O o9 = o8;
        J j = this.f32311x;
        b bVar = h9.f8266h;
        if (j == null) {
            this.f32311x = new J(o9, bVar.d(), h9.getLayoutDirection(), h9);
        }
        C3174j c3174j = this.y;
        float f9 = c9.f28803a;
        if (c3174j == null) {
            float fY = h9.Y(f9);
            C3174j c3174j2 = new C3174j();
            c3174j2.f32257a = fY;
            this.y = c3174j2;
        }
        float f10 = -h9.Y(this.f32310w.f32219b);
        ((p191x3.C) bVar.f32128i.f23899i).a(f10, f10, f10, f10);
        J j9 = this.f32311x;
        m.b(j9);
        z zVarA = j9.a(o9, bVar.d(), h9.getLayoutDirection(), h9);
        C3174j c3174j3 = this.y;
        m.b(c3174j3);
        float fY2 = h9.Y(f9);
        if (c3174j3.f32258b == null || c3174j3.f32257a != fY2) {
            c3174j3.f32257a = fY2;
            c3174j3.f32258b = new g(fY2, 0.0f, 1, 0, null, 26);
        }
        g gVar = c3174j3.f32258b;
        m.b(gVar);
        z.m(h9, zVarA, c9.f28804b, 1.0f, gVar, 48);
        float f11 = -f10;
        ((p191x3.C) bVar.f32128i.f23899i).a(f11, f11, f11, f11);
    }
}
