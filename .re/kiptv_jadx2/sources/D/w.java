package D;

import F.H;
import p020c0.C1675d0;

public final class w {

    public final int f1778a;

    public final C1675d0 f1779b;

    public final C1675d0 f1780c;

    public boolean f1781d;

    public Object f1782e;

    public final H f1783f;

    public w(int i3, int i9, int i10) {
        this.f1778a = i10;
        switch (i10) {
            case 1:
                this.f1779b = new C1675d0(i3);
                this.f1780c = new C1675d0(i9);
                this.f1783f = new H(i3, 90, 200);
                break;
            default:
                this.f1779b = new C1675d0(i3);
                this.f1780c = new C1675d0(i9);
                this.f1783f = new H(i3, 30, 100);
                break;
        }
    }

    public final void a(int i3, int i9) {
        switch (this.f1778a) {
            case 0:
                if (i3 < 0.0f) {
                    A.b.a("Index should be non-negative (" + i3 + ')');
                }
                this.f1779b.h(i3);
                this.f1783f.c(i3);
                this.f1780c.h(i9);
                break;
            default:
                if (i3 < 0.0f) {
                    A.b.a("Index should be non-negative");
                }
                this.f1779b.h(i3);
                this.f1783f.c(i3);
                this.f1780c.h(i9);
                break;
        }
    }
}
