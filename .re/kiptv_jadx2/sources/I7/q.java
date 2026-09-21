package I7;

import C7.C0176h;
import java.util.Iterator;

public final class q extends a {

    public final C0176h f5581h;

    public final int f5582i;

    public q(int i3, C0176h c0176h) {
        this.f5581h = c0176h;
        this.f5582i = i3;
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final void e(int i3, C0176h c0176h) {
        throw new IllegalStateException();
    }

    @Override
    public final Object get(int i3) {
        if (i3 == this.f5582i) {
            return this.f5581h;
        }
        return null;
    }

    @Override
    public final Iterator iterator() {
        return new p(0, this);
    }
}
