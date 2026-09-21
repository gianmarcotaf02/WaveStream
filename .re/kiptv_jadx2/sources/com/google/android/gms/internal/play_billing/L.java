package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class L extends Y implements U {

    public static final Object f19251k = new Object();

    public static final T f19252l = new T(X.class);

    public static final boolean f19253m;

    public static final R8.i f19254n;

    public volatile Object f19255h;

    public volatile F f19256i;
    public volatile K j;

    static {
        boolean z6;
        R8.i i3;
        Throwable th;
        Throwable th2;
        try {
            z6 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z6 = false;
        }
        f19253m = z6;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                i3 = new J();
            } catch (Error | Exception e6) {
                try {
                    i3 = new H();
                } catch (Error | Exception e9) {
                    th3 = e9;
                    i3 = new I();
                }
                th = th3;
                th2 = e6;
            }
        } else {
            try {
                i3 = new H();
            } catch (NoClassDefFoundError unused2) {
                i3 = new I();
            }
        }
        th = null;
        th2 = null;
        f19254n = i3;
        if (th != null) {
            T t9 = f19252l;
            Logger loggerA = t9.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            t9.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(K k9) {
        k9.f19244a = null;
        while (true) {
            K k10 = this.j;
            if (k10 != K.f19243c) {
                K k11 = null;
                while (k10 != null) {
                    K k12 = k10.f19245b;
                    if (k10.f19244a != null) {
                        k11 = k10;
                    } else if (k11 != null) {
                        k11.f19245b = k12;
                        if (k11.f19244a == null) {
                        }
                    } else if (!f19254n.N(this, k10, k12)) {
                    }
                    k10 = k12;
                }
                return;
            }
            return;
        }
    }
}
