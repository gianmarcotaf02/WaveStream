package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.cast.Z1;

public final class J1 {

    public Object f19239a;

    public L1 f19240b;

    public M1 f19241c;

    public boolean f19242d;

    public final void a(Object obj) {
        this.f19242d = true;
        L1 l2 = this.f19240b;
        if (l2 != null) {
            K1 k1 = l2.f19259i;
            k1.getClass();
            if (obj == null) {
                obj = I1.f19230n;
            }
            if (I1.f19229m.J(k1, null, obj)) {
                I1.c(k1);
                this.f19239a = null;
                this.f19240b = null;
                this.f19241c = null;
            }
        }
    }

    public final void finalize() {
        M1 m8;
        L1 l2 = this.f19240b;
        if (l2 != null) {
            K1 k1 = l2.f19259i;
            if (!k1.isDone()) {
                if (I1.f19229m.J(k1, null, new A0(new Z1("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f19239a)), 2)))) {
                    I1.c(k1);
                }
            }
        }
        if (this.f19242d || (m8 = this.f19241c) == null) {
            return;
        }
        m8.h(null);
    }
}
