package p179v4;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import o4.m;
import p005a5.R2;

public final class h {

    public static final h f29167b = new h();

    public final AtomicReference f29168a = new AtomicReference(new n(new R2(1)));

    public final Class a(Class cls) {
        HashMap map = ((n) this.f29168a.get()).f29178b;
        if (map.containsKey(cls)) {
            return ((m) map.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(l lVar) {
        R2 r9 = new R2((n) this.f29168a.get());
        r9.b(lVar);
        this.f29168a.set(new n(r9));
    }
}
