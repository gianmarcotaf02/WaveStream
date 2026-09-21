package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1921p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile com.google.crypto.tink.shaded.protobuf.C1921p f19565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.C1921p f19566b;

    static {
        com.google.crypto.tink.shaded.protobuf.C1921p c1921p = new com.google.crypto.tink.shaded.protobuf.C1921p();
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        f19566b = c1921p;
    }

    public static com.google.crypto.tink.shaded.protobuf.C1921p a() {
        com.google.crypto.tink.shaded.protobuf.C1921p c1921p;
        com.google.crypto.tink.shaded.protobuf.C1921p c1921p2 = f19565a;
        if (c1921p2 != null) {
            return c1921p2;
        }
        synchronized (com.google.crypto.tink.shaded.protobuf.C1921p.class) {
            try {
                c1921p = f19565a;
                if (c1921p == null) {
                    java.lang.Class cls = com.google.crypto.tink.shaded.protobuf.AbstractC1920o.f19563a;
                    com.google.crypto.tink.shaded.protobuf.C1921p c1921p3 = null;
                    if (cls != null) {
                        try {
                            c1921p3 = (com.google.crypto.tink.shaded.protobuf.C1921p) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    c1921p = c1921p3 != null ? c1921p3 : f19566b;
                    f19565a = c1921p;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c1921p;
    }
}
