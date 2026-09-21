package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

public final class T {

    public final C1861n f19288a = new C1861n();

    public final String f19289b;

    public volatile Logger f19290c;

    public T(Class cls) {
        this.f19289b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f19290c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f19288a) {
            try {
                Logger logger2 = this.f19290c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f19289b);
                this.f19290c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
