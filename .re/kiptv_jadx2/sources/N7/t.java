package N7;

import com.google.android.gms.internal.play_billing.M0;
import java.util.Iterator;

public final class t implements m, f {

    public final m f7467a;

    public final int f7468b;

    public final int f7469c;

    public t(m mVar, int i3, int i9) {
        this.f7467a = mVar;
        this.f7468b = i3;
        this.f7469c = i9;
        if (i3 < 0) {
            throw new IllegalArgumentException(M0.l(i3, "startIndex should be non-negative, but is ").toString());
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(M0.l(i9, "endIndex should be non-negative, but is ").toString());
        }
        if (i9 < i3) {
            throw new IllegalArgumentException(M0.k(i9, i3, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override
    public final m a(int i3) {
        int i9 = this.f7469c;
        int i10 = this.f7468b;
        if (i3 >= i9 - i10) {
            return this;
        }
        return new t(this.f7467a, i10, i3 + i10);
    }

    @Override
    public final m b(int i3) {
        int i9 = this.f7469c;
        int i10 = this.f7468b;
        if (i3 >= i9 - i10) {
            return g.f7442a;
        }
        return new t(this.f7467a, i10 + i3, i9);
    }

    @Override
    public final Iterator iterator() {
        return new k(this);
    }
}
