package p089k0;

import java.util.Set;
import p020c0.C0;
import p020c0.D0;
import p038e0.e;

public final class h implements C0 {

    public final Set f24415h;

    public final e f24416i = new e(new D0[16]);

    public h(Set set) {
        this.f24415h = set;
    }

    @Override
    public final void d() {
        e eVar = this.f24416i;
        Object[] objArr = eVar.f21324h;
        int i3 = eVar.j;
        for (int i9 = 0; i9 < i3; i9++) {
            C0 c9 = ((D0) objArr[i9]).f18104a;
            this.f24415h.remove(c9);
            c9.d();
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }
}
