package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C1504k;
import java.nio.charset.Charset;

public final class G0 implements J0 {

    public static final C1873t0 f19214b = new C1873t0(3);

    public final Object f19215a;

    public G0(J0... j0Arr) {
        this.f19215a = j0Arr;
    }

    @Override
    public S0 a(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            J0 j9 = ((J0[]) this.f19215a)[i3];
            if (j9.b(cls)) {
                return j9.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override
    public boolean b(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((J0[]) this.f19215a)[i3].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i3, Object obj, T0 t9) throws C1504k {
        AbstractC1841g0 abstractC1841g0 = (AbstractC1841g0) obj;
        C1866p0 c1866p0 = (C1866p0) this.f19215a;
        c1866p0.P(i3, 2);
        c1866p0.R(abstractC1841g0.c(t9));
        t9.b(abstractC1841g0, this);
    }

    public G0() {
        int i3 = AbstractC1847i0.f19337a;
        G0 g9 = new G0(C1873t0.f19389b, f19214b);
        Charset charset = B0.f19193a;
        this.f19215a = g9;
    }

    public G0(C1866p0 c1866p0) {
        Charset charset = B0.f19193a;
        this.f19215a = c1866p0;
        c1866p0.f19372l = this;
    }
}
