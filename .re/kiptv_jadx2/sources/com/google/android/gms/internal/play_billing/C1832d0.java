package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

public final class C1832d0 {

    public static final C1832d0 f19315b;

    public static final C1832d0 f19316c;

    public final CancellationException f19317a;

    static {
        if (I1.f19227k) {
            f19316c = null;
            f19315b = null;
        } else {
            f19316c = new C1832d0(null);
            f19315b = new C1832d0(null);
        }
    }

    public C1832d0(CancellationException cancellationException) {
        this.f19317a = cancellationException;
    }
}
