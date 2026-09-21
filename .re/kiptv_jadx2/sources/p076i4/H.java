package p076i4;

import java.util.Comparator;

public final class H extends J {
    public static J g(int i3) {
        if (i3 < 0) {
            return J.f22803b;
        }
        return i3 > 0 ? J.f22804c : J.f22802a;
    }

    @Override
    public final J a(int i3, int i9) {
        return g(Integer.compare(i3, i9));
    }

    @Override
    public final J b(long j, long j9) {
        return g(Long.compare(j, j9));
    }

    @Override
    public final J c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override
    public final J d(boolean z6, boolean z9) {
        return g(Boolean.compare(z6, z9));
    }

    @Override
    public final J e(boolean z6, boolean z9) {
        return g(Boolean.compare(z9, z6));
    }

    @Override
    public final int f() {
        return 0;
    }
}
