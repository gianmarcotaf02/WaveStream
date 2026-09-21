package o4;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.logging.Logger f26113b = java.util.logging.Logger.getLogger(o4.e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f26114a;

    public e(o4.e eVar) {
        this.f26114a = new java.util.concurrent.ConcurrentHashMap(eVar.f26114a);
    }

    public final synchronized o4.d a(java.lang.String str) {
        if (!this.f26114a.containsKey(str)) {
            throw new java.security.GeneralSecurityException("No key manager found for key type " + str);
        }
        return (o4.d) this.f26114a.get(str);
    }

    public final synchronized void b(p179v4.d dVar) {
        int iB = dVar.b();
        if (!(iB != 1 ? p121o0.p.b(iB) : p121o0.p.a(iB))) {
            throw new java.security.GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new o4.d(dVar));
    }

    public final synchronized void c(o4.d dVar) {
        try {
            p179v4.d dVar2 = dVar.f26112a;
            java.lang.Class cls = (java.lang.Class) dVar2.f29162c;
            if (!((java.util.Map) dVar2.f29163d).keySet().contains(cls) && !java.lang.Void.class.equals(cls)) {
                throw new java.lang.IllegalArgumentException("Given internalKeyMananger " + dVar2.toString() + " does not support primitive class " + cls.getName());
            }
            java.lang.String strC = dVar2.c();
            o4.d dVar3 = (o4.d) this.f26114a.get(strC);
            if (dVar3 != null && !dVar3.f26112a.getClass().equals(dVar.f26112a.getClass())) {
                f26113b.warning("Attempted overwrite of a registered key manager for key type ".concat(strC));
                throw new java.security.GeneralSecurityException("typeUrl (" + strC + ") is already registered with " + dVar3.f26112a.getClass().getName() + ", cannot be re-registered with " + dVar.f26112a.getClass().getName());
            }
            this.f26114a.putIfAbsent(strC, dVar);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public e() {
        this.f26114a = new java.util.concurrent.ConcurrentHashMap();
    }
}
