package N7;

import java.util.Iterator;

public final class e implements m, f {

    public final int f7439a;

    public final m f7440b;

    public final int f7441c;

    public e(m mVar, int i3, int i9) {
        this.f7439a = i9;
        switch (i9) {
            case 1:
                this.f7440b = mVar;
                this.f7441c = i3;
                if (i3 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i3 + '.').toString());
            default:
                this.f7440b = mVar;
                this.f7441c = i3;
                if (i3 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i3 + '.').toString());
        }
    }

    @Override
    public final m a(int i3) {
        switch (this.f7439a) {
            case 0:
                int i9 = this.f7441c;
                int i10 = i9 + i3;
                return i10 < 0 ? new e(this, i3, 1) : new t(this.f7440b, i9, i10);
            default:
                return i3 >= this.f7441c ? this : new e(this.f7440b, i3, 1);
        }
    }

    @Override
    public final m b(int i3) {
        switch (this.f7439a) {
            case 0:
                int i9 = this.f7441c + i3;
                return i9 < 0 ? new e(this, i3, 0) : new e(this.f7440b, i9, 0);
            default:
                int i10 = this.f7441c;
                return i3 >= i10 ? g.f7442a : new t(this.f7440b, i3, i10);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7439a) {
            case 0:
                return new d(this);
            default:
                return new d(this, (byte) 0);
        }
    }
}
