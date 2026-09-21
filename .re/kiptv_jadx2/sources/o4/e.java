package o4;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import p121o0.p;

public final class e {

    public static final Logger f26113b = Logger.getLogger(e.class.getName());

    public final ConcurrentHashMap f26114a;

    public e(e eVar) {
        this.f26114a = new ConcurrentHashMap(eVar.f26114a);
    }

    public final synchronized d a(String str) {
        if (!this.f26114a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (d) this.f26114a.get(str);
    }

    public final synchronized void b(p179v4.d dVar) {
        int iB = dVar.b();
        if (!(iB != 1 ? p.b(iB) : p.a(iB))) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new d(dVar));
    }

    public final synchronized void c(d dVar) {
        try {
            p179v4.d dVar2 = dVar.f26112a;
            Class cls = (Class) dVar2.f29162c;
            if (!((Map) dVar2.f29163d).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + dVar2.toString() + " does not support primitive class " + cls.getName());
            }
            String strC = dVar2.c();
            d dVar3 = (d) this.f26114a.get(strC);
            if (dVar3 != null && !dVar3.f26112a.getClass().equals(dVar.f26112a.getClass())) {
                f26113b.warning("Attempted overwrite of a registered key manager for key type ".concat(strC));
                throw new GeneralSecurityException("typeUrl (" + strC + ") is already registered with " + dVar3.f26112a.getClass().getName() + ", cannot be re-registered with " + dVar.f26112a.getClass().getName());
            }
            this.f26114a.putIfAbsent(strC, dVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public e() {
        this.f26114a = new ConcurrentHashMap();
    }
}
