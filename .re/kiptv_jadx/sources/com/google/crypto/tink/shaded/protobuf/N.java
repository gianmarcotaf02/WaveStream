package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class N extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.N f19487i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19488h = true;

    static {
        com.google.crypto.tink.shaded.protobuf.N n3 = new com.google.crypto.tink.shaded.protobuf.N();
        f19487i = n3;
        n3.f19488h = false;
    }

    public static int a(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof com.google.crypto.tink.shaded.protobuf.InterfaceC1930z) {
                throw new java.lang.UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        java.nio.charset.Charset charset = com.google.crypto.tink.shaded.protobuf.B.f19466a;
        int length = bArr.length;
        for (byte b9 : bArr) {
            length = (length * 31) + b9;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public final void b() {
        if (!this.f19488h) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final com.google.crypto.tink.shaded.protobuf.N c() {
        if (isEmpty()) {
            return new com.google.crypto.tink.shaded.protobuf.N();
        }
        com.google.crypto.tink.shaded.protobuf.N n3 = new com.google.crypto.tink.shaded.protobuf.N(this);
        n3.f19488h = true;
        return n3;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        boolean z6;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    java.util.Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                java.lang.Object value = entry.getValue();
                                java.lang.Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z6 = true;
                        }
                    }
                }
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA = 0;
        for (java.util.Map.Entry entry : entrySet()) {
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        b();
        java.nio.charset.Charset charset = com.google.crypto.tink.shaded.protobuf.B.f19466a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        b();
        for (java.lang.Object obj : map.keySet()) {
            java.nio.charset.Charset charset = com.google.crypto.tink.shaded.protobuf.B.f19466a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        return super.remove(obj);
    }
}
