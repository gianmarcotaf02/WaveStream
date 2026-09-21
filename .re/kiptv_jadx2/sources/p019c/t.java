package p019c;

import kotlin.jvm.internal.m;
import p078i6.l;

public final class t implements b {

    public final n f18088h;

    public final u f18089i;

    public t(u uVar, n onBackPressedCallback) {
        m.e(onBackPressedCallback, "onBackPressedCallback");
        this.f18089i = uVar;
        this.f18088h = onBackPressedCallback;
    }

    @Override
    public final void cancel() {
        u uVar = this.f18089i;
        l lVar = uVar.f18091b;
        n nVar = this.f18088h;
        lVar.remove(nVar);
        if (m.a(uVar.f18092c, nVar)) {
            nVar.a();
            uVar.f18092c = null;
        }
        nVar.f18073b.remove(this);
        ?? r9 = nVar.f18074c;
        if (r9 != 0) {
            r9.invoke();
        }
        nVar.f18074c = null;
    }
}
