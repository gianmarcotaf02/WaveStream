package J;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b1.J f5963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O0.InterfaceC0732v f5964b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O0.InterfaceC0732v f5965c;

    public y0(p011b1.J j, O0.InterfaceC0732v interfaceC0732v) {
        this.f5963a = j;
        this.f5965c = interfaceC0732v;
    }

    public final long a(long j) {
        p181w0.b bVarJ;
        O0.InterfaceC0732v interfaceC0732v = this.f5964b;
        p181w0.b bVar = p181w0.b.f29745e;
        if (interfaceC0732v != null) {
            if (interfaceC0732v.i()) {
                O0.InterfaceC0732v interfaceC0732v2 = this.f5965c;
                bVarJ = interfaceC0732v2 != null ? interfaceC0732v2.J(interfaceC0732v, true) : null;
            } else {
                bVarJ = bVar;
            }
            if (bVarJ != null) {
                bVar = bVarJ;
            }
        }
        int i3 = (int) (j >> 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i3);
        float fIntBitsToFloat2 = bVar.f29746a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i3);
            fIntBitsToFloat2 = bVar.f29748c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i3);
            }
        }
        int i9 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat(i9);
        float fIntBitsToFloat5 = bVar.f29747b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat(i9);
            fIntBitsToFloat5 = bVar.f29749d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = java.lang.Float.intBitsToFloat(i9);
            }
        }
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z6) {
        if (z6) {
            j = a(j);
        }
        return this.f5963a.f17773b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (4294967295L & jD));
        p011b1.J j9 = this.f5963a;
        int iE = j9.f17773b.e(fIntBitsToFloat);
        int i3 = (int) (jD >> 32);
        return java.lang.Float.intBitsToFloat(i3) >= j9.e(iE) && java.lang.Float.intBitsToFloat(i3) <= j9.f(iE);
    }

    public final long d(long j) {
        O0.InterfaceC0732v interfaceC0732v;
        O0.InterfaceC0732v interfaceC0732v2 = this.f5964b;
        if (interfaceC0732v2 == null) {
            return j;
        }
        if (!interfaceC0732v2.i()) {
            interfaceC0732v2 = null;
        }
        if (interfaceC0732v2 == null || (interfaceC0732v = this.f5965c) == null) {
            return j;
        }
        O0.InterfaceC0732v interfaceC0732v3 = interfaceC0732v.i() ? interfaceC0732v : null;
        return interfaceC0732v3 == null ? j : interfaceC0732v2.T(interfaceC0732v3, j);
    }

    public final long e(long j) {
        O0.InterfaceC0732v interfaceC0732v;
        O0.InterfaceC0732v interfaceC0732v2 = this.f5964b;
        if (interfaceC0732v2 == null) {
            return j;
        }
        if (!interfaceC0732v2.i()) {
            interfaceC0732v2 = null;
        }
        if (interfaceC0732v2 == null || (interfaceC0732v = this.f5965c) == null) {
            return j;
        }
        O0.InterfaceC0732v interfaceC0732v3 = interfaceC0732v.i() ? interfaceC0732v : null;
        return interfaceC0732v3 == null ? j : interfaceC0732v3.T(interfaceC0732v2, j);
    }
}
