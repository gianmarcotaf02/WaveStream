package com.google.common.util.concurrent;

import java.util.logging.Logger;

public final class I {

    public final Object f19412a = new Object();

    public final String f19413b;

    public volatile Logger f19414c;

    public I(Class cls) {
        this.f19413b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f19414c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f19412a) {
            try {
                Logger logger2 = this.f19414c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f19413b);
                this.f19414c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
