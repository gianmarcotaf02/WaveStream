package K0;

/* JADX INFO: renamed from: K0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0670s extends K0.AbstractC0660h {
    @Override // K0.AbstractC0660h
    public final void O0(K0.InterfaceC0672u interfaceC0672u) {
        K0.v vVar = (K0.v) Q0.AbstractC0777k.h(this, R0.AbstractC0844q0.f8978u);
        if (vVar != null) {
            R0.C0848t c0848t = (R0.C0848t) vVar;
            if (interfaceC0672u == null) {
                K0.InterfaceC0672u.f6734a.getClass();
                interfaceC0672u = K0.w.f6735a;
            }
            R0.J.f8790a.a(c0848t.f8991b, interfaceC0672u);
        }
    }

    @Override // K0.AbstractC0660h
    public final boolean Q0(int i3) {
        return (i3 == 3 || i3 == 4) ? false : true;
    }

    @Override // Q0.C0
    public final /* bridge */ /* synthetic */ java.lang.Object g() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
