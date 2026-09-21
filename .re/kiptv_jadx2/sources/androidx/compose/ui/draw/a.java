package androidx.compose.ui.draw;

import O0.InterfaceC0719h;
import p137q0.c;
import p137q0.d;
import p137q0.p;
import p188x0.C3092l;

public abstract class a {
    public static p a(p pVar, C0.a aVar, d dVar, InterfaceC0719h interfaceC0719h, float f9, C3092l c3092l, int i3) {
        if ((i3 & 4) != 0) {
            dVar = c.f26452l;
        }
        d dVar2 = dVar;
        if ((i3 & 16) != 0) {
            f9 = 1.0f;
        }
        return pVar.d(new PainterElement(aVar, dVar2, interfaceC0719h, f9, c3092l));
    }
}
