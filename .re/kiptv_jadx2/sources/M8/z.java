package M8;

import java.util.RandomAccess;
import p078i6.AbstractC2254e;

public final class z extends AbstractC2254e implements RandomAccess {

    public final C0685m[] f7291h;

    public final int[] f7292i;

    public z(C0685m[] c0685mArr, int[] iArr) {
        this.f7291h = c0685mArr;
        this.f7292i = iArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof C0685m) {
            return super.contains((C0685m) obj);
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f7291h.length;
    }

    @Override
    public final Object get(int i3) {
        return this.f7291h[i3];
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof C0685m) {
            return super.indexOf((C0685m) obj);
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj instanceof C0685m) {
            return super.lastIndexOf((C0685m) obj);
        }
        return -1;
    }
}
