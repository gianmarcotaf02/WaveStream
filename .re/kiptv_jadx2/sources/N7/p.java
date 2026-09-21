package N7;

import java.util.Iterator;

public final class p implements m {

    public final int f7462a;

    public final Object f7463b;

    public p(int i3, Object obj) {
        this.f7462a = i3;
        this.f7463b = obj;
    }

    private final Iterator c() {
        return this.f7463b;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7462a) {
            case 0:
                return E8.d.T((p117n6.h) this.f7463b);
            case 1:
                return (Iterator) this.f7463b;
            case 2:
                return new O7.h((String) this.f7463b);
            case 3:
                return kotlin.jvm.internal.m.h((Object[]) this.f7463b);
            case 4:
                return ((Iterable) this.f7463b).iterator();
            case 5:
                return new p160s6.l(this);
            default:
                return c();
        }
    }

    public p(p194x6.m mVar) {
        this.f7462a = 0;
        this.f7463b = (p117n6.h) mVar;
    }
}
