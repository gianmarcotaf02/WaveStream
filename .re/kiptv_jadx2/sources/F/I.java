package F;

import p020c0.AbstractC1703s;
import p020c0.C1681g0;

public final class I {

    public final Object f3343a;

    public final K f3344b;

    public int f3346d;

    public I f3347e;

    public boolean f3348f;

    public int f3345c = -1;
    public final C1681g0 g = AbstractC1703s.y(null);

    public I(Object obj, K k9) {
        this.f3343a = obj;
        this.f3344b = k9;
    }

    public final I a() {
        if (this.f3348f) {
            A.b.c("Pin should not be called on an already disposed item ");
        }
        if (this.f3346d == 0) {
            this.f3344b.f3354h.add(this);
            I i3 = (I) this.g.getValue();
            if (i3 != null) {
                i3.a();
            } else {
                i3 = null;
            }
            this.f3347e = i3;
        }
        this.f3346d++;
        return this;
    }

    public final void b() {
        if (this.f3348f) {
            return;
        }
        if (this.f3346d <= 0) {
            A.b.c("Release should only be called once");
        }
        int i3 = this.f3346d - 1;
        this.f3346d = i3;
        if (i3 == 0) {
            this.f3344b.f3354h.remove(this);
            I i9 = this.f3347e;
            if (i9 != null) {
                i9.b();
            }
            this.f3347e = null;
        }
    }
}
