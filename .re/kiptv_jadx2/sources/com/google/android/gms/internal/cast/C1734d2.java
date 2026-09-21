package com.google.android.gms.internal.cast;

public final class C1734d2 extends H {
    @Override
    public final C1726b2 d(AbstractC1750h2 abstractC1750h2) {
        C1726b2 c1726b2;
        C1726b2 c1726b3 = C1726b2.f18873d;
        synchronized (abstractC1750h2) {
            c1726b2 = abstractC1750h2.f18923l;
            if (c1726b2 != c1726b3) {
                abstractC1750h2.f18923l = c1726b3;
            }
        }
        return c1726b2;
    }

    @Override
    public final C1746g2 k(AbstractC1750h2 abstractC1750h2) {
        C1746g2 c1746g2;
        C1746g2 c1746g3 = C1746g2.f18913c;
        synchronized (abstractC1750h2) {
            c1746g2 = abstractC1750h2.f18924m;
            if (c1746g2 != c1746g3) {
                abstractC1750h2.f18924m = c1746g3;
            }
        }
        return c1746g2;
    }

    @Override
    public final void m(C1746g2 c1746g2, C1746g2 c1746g3) {
        c1746g2.f18915b = c1746g3;
    }

    @Override
    public final void o(C1746g2 c1746g2, Thread thread) {
        c1746g2.f18914a = thread;
    }

    @Override
    public final boolean q(AbstractC1750h2 abstractC1750h2, C1726b2 c1726b2, C1726b2 c1726b3) {
        synchronized (abstractC1750h2) {
            try {
                if (abstractC1750h2.f18923l != c1726b2) {
                    return false;
                }
                abstractC1750h2.f18923l = c1726b3;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean r(AbstractC1750h2 abstractC1750h2, Object obj, Object obj2) {
        synchronized (abstractC1750h2) {
            try {
                if (abstractC1750h2.f18922k != obj) {
                    return false;
                }
                abstractC1750h2.f18922k = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean s(AbstractC1750h2 abstractC1750h2, C1746g2 c1746g2, C1746g2 c1746g3) {
        synchronized (abstractC1750h2) {
            try {
                if (abstractC1750h2.f18924m != c1746g2) {
                    return false;
                }
                abstractC1750h2.f18924m = c1746g3;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
