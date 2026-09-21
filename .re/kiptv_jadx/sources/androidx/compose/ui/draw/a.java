package androidx.compose.ui.draw;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static p137q0.p a(p137q0.p pVar, C0.a aVar, p137q0.d dVar, O0.InterfaceC0719h interfaceC0719h, float f9, p188x0.C3092l c3092l, int i3) {
        if ((i3 & 4) != 0) {
            dVar = p137q0.c.f26452l;
        }
        p137q0.d dVar2 = dVar;
        if ((i3 & 16) != 0) {
            f9 = 1.0f;
        }
        return pVar.d(new androidx.compose.ui.draw.PainterElement(aVar, dVar2, interfaceC0719h, f9, c3092l));
    }
}
