package p020c0;

import p194x6.j;

public final class G implements C0 {

    public final j f18118h;

    public H f18119i;

    public G(j jVar) {
        this.f18118h = jVar;
    }

    @Override
    public final void c() {
        H h9 = this.f18119i;
        if (h9 != null) {
            h9.dispose();
        }
        this.f18119i = null;
    }

    @Override
    public final void d() {
        this.f18119i = (H) this.f18118h.invoke(AbstractC1703s.f18360c);
    }

    @Override
    public final void a() {
    }
}
