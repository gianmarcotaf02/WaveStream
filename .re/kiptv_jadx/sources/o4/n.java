package o4;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f26131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f26132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f26133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f26134d;

    static {
        java.util.logging.Logger.getLogger(o4.n.class.getName());
        f26131a = new java.util.concurrent.atomic.AtomicReference(new o4.e());
        f26132b = new java.util.concurrent.ConcurrentHashMap();
        f26133c = new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.ConcurrentHashMap();
        f26134d = new java.util.concurrent.ConcurrentHashMap();
    }

    public static synchronized void a(java.lang.String str, java.util.Map map, boolean z6) {
        if (z6) {
            try {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f26133c;
                if (concurrentHashMap.containsKey(str) && !((java.lang.Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new java.security.GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z6) {
            if (((o4.e) f26131a.get()).f26114a.containsKey(str)) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (!f26134d.containsKey(entry.getKey())) {
                        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (java.util.Map.Entry entry2 : map.entrySet()) {
                    if (f26134d.containsKey(entry2.getKey())) {
                        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static java.lang.Object b(o4.b bVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        p192x4.a aVar;
        p179v4.n nVar = (p179v4.n) p179v4.h.f29167b.f29168a.get();
        nVar.getClass();
        p179v4.m mVar = new p179v4.m(bVar.getClass(), cls);
        java.util.HashMap map = nVar.f29177a;
        if (!map.containsKey(mVar)) {
            throw new java.security.GeneralSecurityException("No PrimitiveConstructor for " + mVar + " available");
        }
        switch (((p179v4.l) map.get(mVar)).f29174b.f23530h) {
            case 13:
                aVar = new p192x4.a();
                if (!p121o0.p.a(1)) {
                    throw new java.security.GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return aVar;
            default:
                aVar = new p192x4.a();
                if (!p121o0.p.b(2)) {
                    throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return aVar;
        }
    }

    public static java.lang.Object c(java.lang.String str, com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j, java.lang.Class cls) throws java.security.GeneralSecurityException {
        o4.e eVar = (o4.e) f26131a.get();
        eVar.getClass();
        o4.d dVarA = eVar.a(str);
        boolean zContains = ((java.util.Map) dVarA.f26112a.f29163d).keySet().contains(cls);
        p179v4.d dVar = dVarA.f26112a;
        if (!zContains) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(dVar.getClass());
            sb.append(", supported primitives: ");
            java.util.Set<java.lang.Class> setKeySet = ((java.util.Map) dVar.f29163d).keySet();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            boolean z6 = true;
            for (java.lang.Class cls2 : setKeySet) {
                if (!z6) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z6 = false;
            }
            sb.append(sb2.toString());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        try {
            if (!((java.util.Map) dVar.f29163d).keySet().contains(cls) && !java.lang.Void.class.equals(cls)) {
                throw new java.lang.IllegalArgumentException("Given internalKeyMananger " + dVar.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906aG = dVar.g(abstractC1915j);
                if (java.lang.Void.class.equals(cls)) {
                    throw new java.security.GeneralSecurityException("Cannot create a primitive for Void");
                }
                dVar.h(abstractC1906aG);
                return dVar.d(abstractC1906aG, cls);
            } catch (com.google.crypto.tink.shaded.protobuf.D e6) {
                throw new java.security.GeneralSecurityException("Failures parsing proto of type ".concat(((java.lang.Class) dVar.f29161b).getName()), e6);
            }
        } catch (java.lang.IllegalArgumentException e9) {
            throw new java.security.GeneralSecurityException("Primitive type not supported", e9);
        }
    }

    public static java.lang.Object d(java.lang.String str, byte[] bArr) {
        com.google.crypto.tink.shaded.protobuf.C1914i c1914i = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;
        return c(str, com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f(bArr, 0, bArr.length), o4.a.class);
    }

    public static synchronized A4.Y e(A4.b0 b0Var) {
        o4.f fVar;
        p179v4.d dVar = ((o4.e) f26131a.get()).a(b0Var.B()).f26112a;
        fVar = new o4.f(dVar, (java.lang.Class) dVar.f29162c);
        if (!((java.lang.Boolean) f26133c.get(b0Var.B())).booleanValue()) {
            throw new java.security.GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.B());
        }
        return fVar.e(b0Var.C());
    }

    public static synchronized void f(p179v4.d dVar, boolean z6) {
        try {
            java.util.concurrent.atomic.AtomicReference atomicReference = f26131a;
            o4.e eVar = new o4.e((o4.e) atomicReference.get());
            eVar.b(dVar);
            java.lang.String strC = dVar.c();
            a(strC, z6 ? dVar.e().u0() : java.util.Collections.EMPTY_MAP, z6);
            if (!((o4.e) atomicReference.get()).f26114a.containsKey(strC)) {
                f26132b.put(strC, new V1.b(26));
                if (z6) {
                    g(strC, dVar.e().u0());
                }
            }
            f26133c.put(strC, java.lang.Boolean.valueOf(z6));
            atomicReference.set(eVar);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public static void g(java.lang.String str, java.util.Map map) {
        A4.r0 r0Var;
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f26134d;
            java.lang.String str2 = (java.lang.String) entry.getKey();
            byte[] bArrE = ((p179v4.c) entry.getValue()).f29158a.e();
            int i3 = ((p179v4.c) entry.getValue()).f29159b;
            A4.a0 a0VarD = A4.b0.D();
            a0VarD.e();
            A4.b0.w((A4.b0) a0VarD.f19594i, str);
            com.google.crypto.tink.shaded.protobuf.C1914i c1914iF = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f(bArrE, 0, bArrE.length);
            a0VarD.e();
            A4.b0.x((A4.b0) a0VarD.f19594i, c1914iF);
            int iC = Z.AbstractC1149h0.c(i3);
            if (iC == 0) {
                r0Var = A4.r0.TINK;
            } else if (iC == 1) {
                r0Var = A4.r0.LEGACY;
            } else if (iC == 2) {
                r0Var = A4.r0.RAW;
            } else {
                if (iC != 3) {
                    throw new java.lang.IllegalArgumentException("Unknown output prefix type");
                }
                r0Var = A4.r0.CRUNCHY;
            }
            a0VarD.e();
            A4.b0.y((A4.b0) a0VarD.f19594i, r0Var);
            concurrentHashMap.put(str2, new o4.g((A4.b0) a0VarD.b()));
        }
    }

    public static synchronized void h(o4.m mVar) {
        p179v4.h hVar = p179v4.h.f29167b;
        synchronized (hVar) {
            p005a5.R2 r9 = new p005a5.R2((p179v4.n) hVar.f29168a.get());
            r9.c(mVar);
            hVar.f29168a.set(new p179v4.n(r9));
        }
    }
}
