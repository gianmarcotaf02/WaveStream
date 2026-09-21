package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1734d2 extends com.google.android.gms.internal.cast.H {
    @Override // com.google.android.gms.internal.cast.H
    public final com.google.android.gms.internal.cast.C1726b2 d(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2) {
        com.google.android.gms.internal.cast.C1726b2 c1726b2;
        com.google.android.gms.internal.cast.C1726b2 c1726b3 = com.google.android.gms.internal.cast.C1726b2.f18873d;
        synchronized (abstractC1750h2) {
            c1726b2 = abstractC1750h2.f18923l;
            if (c1726b2 != c1726b3) {
                abstractC1750h2.f18923l = c1726b3;
            }
        }
        return c1726b2;
    }

    @Override // com.google.android.gms.internal.cast.H
    public final com.google.android.gms.internal.cast.C1746g2 k(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2) {
        com.google.android.gms.internal.cast.C1746g2 c1746g2;
        com.google.android.gms.internal.cast.C1746g2 c1746g3 = com.google.android.gms.internal.cast.C1746g2.f18913c;
        synchronized (abstractC1750h2) {
            c1746g2 = abstractC1750h2.f18924m;
            if (c1746g2 != c1746g3) {
                abstractC1750h2.f18924m = c1746g3;
            }
        }
        return c1746g2;
    }

    @Override // com.google.android.gms.internal.cast.H
    public final void m(com.google.android.gms.internal.cast.C1746g2 c1746g2, com.google.android.gms.internal.cast.C1746g2 c1746g3) {
        c1746g2.f18915b = c1746g3;
    }

    @Override // com.google.android.gms.internal.cast.H
    public final void o(com.google.android.gms.internal.cast.C1746g2 c1746g2, java.lang.Thread thread) {
        c1746g2.f18914a = thread;
    }

    @Override // com.google.android.gms.internal.cast.H
    public final boolean q(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, com.google.android.gms.internal.cast.C1726b2 c1726b2, com.google.android.gms.internal.cast.C1726b2 c1726b3) {
        synchronized (abstractC1750h2) {
            try {
                if (abstractC1750h2.f18923l != c1726b2) {
                    return false;
                }
                abstractC1750h2.f18923l = c1726b3;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.H
    public final boolean r(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (abstractC1750h2) {
            try {
                if (abstractC1750h2.f18922k != obj) {
                    return false;
                }
                abstractC1750h2.f18922k = obj2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.H
    public final boolean s(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, com.google.android.gms.internal.cast.C1746g2 c1746g2, com.google.android.gms.internal.cast.C1746g2 c1746g3) {
        synchronized (abstractC1750h2) {
            try {
                if (abstractC1750h2.f18924m != c1746g2) {
                    return false;
                }
                abstractC1750h2.f18924m = c1746g3;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
