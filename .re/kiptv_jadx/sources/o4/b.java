package o4;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f26111a = new byte[0];

    public static o4.g a(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Map mapUnmodifiableMap;
        java.util.concurrent.atomic.AtomicReference atomicReference = o4.n.f26131a;
        synchronized (o4.n.class) {
            mapUnmodifiableMap = java.util.Collections.unmodifiableMap(o4.n.f26134d);
        }
        o4.g gVar = (o4.g) mapUnmodifiableMap.get(str);
        if (gVar != null) {
            return gVar;
        }
        throw new java.security.GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
