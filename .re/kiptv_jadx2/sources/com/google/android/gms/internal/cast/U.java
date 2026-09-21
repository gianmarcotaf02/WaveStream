package com.google.android.gms.internal.cast;

import java.util.logging.Logger;

public final class U implements T {

    public static final C1799u0 f18822l = new C1799u0(10);

    public final int f18823h;

    public final V f18824i;
    public Object j;

    public volatile Object f18825k;

    public U() {
        this.f18823h = 1;
        this.f18824i = new V();
        this.j = AbstractC1750h2.class.getName();
    }

    public Logger a() {
        Logger logger = (Logger) this.f18825k;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f18824i) {
            try {
                Logger logger2 = (Logger) this.f18825k;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.j);
                this.f18825k = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public Object c() {
        T t9 = (T) this.f18825k;
        C1799u0 c1799u0 = f18822l;
        if (t9 != c1799u0) {
            synchronized (this.f18824i) {
                try {
                    if (((T) this.f18825k) != c1799u0) {
                        Object objC = ((T) this.f18825k).c();
                        this.j = objC;
                        this.f18825k = c1799u0;
                        return objC;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.j;
    }

    public String toString() {
        switch (this.f18823h) {
            case 0:
                Object objH = (T) this.f18825k;
                if (objH == f18822l) {
                    objH = Y6.f.h("<supplier that returned ", String.valueOf(this.j), ">");
                }
                return Y6.f.h("Suppliers.memoize(", String.valueOf(objH), ")");
            default:
                return super.toString();
        }
    }

    public U(C1799u0 c1799u0) {
        this.f18823h = 0;
        this.f18824i = new V();
        this.f18825k = c1799u0;
    }
}
