package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class O {
    public static void a(java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.N n3 = (com.google.crypto.tink.shaded.protobuf.N) obj;
        if (obj2 != null) {
            throw new java.lang.ClassCastException();
        }
        if (n3.isEmpty()) {
            return;
        }
        java.util.Iterator it = n3.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static com.google.crypto.tink.shaded.protobuf.N b(java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.N nC = (com.google.crypto.tink.shaded.protobuf.N) obj;
        com.google.crypto.tink.shaded.protobuf.N n3 = (com.google.crypto.tink.shaded.protobuf.N) obj2;
        if (!n3.isEmpty()) {
            if (!nC.f19488h) {
                nC = nC.c();
            }
            nC.b();
            if (!n3.isEmpty()) {
                nC.putAll(n3);
            }
        }
        return nC;
    }
}
