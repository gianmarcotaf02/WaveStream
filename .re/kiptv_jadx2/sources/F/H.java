package F;

import p020c0.C1676e;
import p020c0.C1681g0;
import p020c0.e1;

public final class H implements e1 {

    public final int f3340h;

    public final int f3341i;
    public final C1681g0 j;

    public int f3342k;

    public H(int i3, int i9, int i10) {
        this.f3340h = i9;
        this.f3341i = i10;
        int i11 = (i3 / i9) * i9;
        this.j = new C1681g0(O7.r.W(Math.max(i11 - i10, 0), i11 + i9 + i10), C1676e.f18243n);
        this.f3342k = i3;
    }

    public final void c(int i3) {
        if (i3 != this.f3342k) {
            this.f3342k = i3;
            int i9 = this.f3340h;
            int i10 = (i3 / i9) * i9;
            int i11 = this.f3341i;
            this.j.setValue(O7.r.W(Math.max(i10 - i11, 0), i10 + i9 + i11));
        }
    }

    @Override
    public final Object getValue() {
        return (D6.g) this.j.getValue();
    }
}
