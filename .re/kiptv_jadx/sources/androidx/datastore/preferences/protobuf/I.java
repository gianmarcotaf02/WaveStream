package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class I extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.I f16139i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16140h = true;

    static {
        androidx.datastore.preferences.protobuf.I i3 = new androidx.datastore.preferences.protobuf.I();
        f16139i = i3;
        i3.f16140h = false;
    }

    public final void a() {
        if (!this.f16140h) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final androidx.datastore.preferences.protobuf.I b() {
        if (isEmpty()) {
            return new androidx.datastore.preferences.protobuf.I();
        }
        androidx.datastore.preferences.protobuf.I i3 = new androidx.datastore.preferences.protobuf.I(this);
        i3.f16140h = true;
        return i3;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
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
        int iHashCode;
        int iHashCode2;
        int i3 = 0;
        for (java.util.Map.Entry entry : entrySet()) {
            java.lang.Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a;
                iHashCode = bArr.length;
                for (byte b9 : bArr) {
                    iHashCode = (iHashCode * 31) + b9;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                iHashCode = key.hashCode();
            }
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                java.nio.charset.Charset charset2 = androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a;
                iHashCode2 = bArr2.length;
                for (byte b10 : bArr2) {
                    iHashCode2 = (iHashCode2 * 31) + b10;
                }
                if (iHashCode2 == 0) {
                    iHashCode2 = 1;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i3 += iHashCode ^ iHashCode2;
        }
        return i3;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        a();
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        a();
        for (java.lang.Object obj : map.keySet()) {
            java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        a();
        return super.remove(obj);
    }
}
