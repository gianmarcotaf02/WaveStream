package S1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f9200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q1.a f9201b;

    public b(java.util.LinkedHashMap linkedHashMap, boolean z6) {
        this.f9200a = linkedHashMap;
        this.f9201b = new Q1.a(z6);
    }

    public final java.util.Map a() {
        p070h6.k kVar;
        java.util.Set<java.util.Map.Entry> setEntrySet = this.f9200a.entrySet();
        int iI0 = p078i6.D.I0(p078i6.q.I0(setEntrySet, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
        for (java.util.Map.Entry entry : setEntrySet) {
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                java.lang.Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(this, size)");
                kVar = new p070h6.k(key, bArrCopyOf);
            } else {
                kVar = new p070h6.k(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(kVar.f22539h, kVar.f22540i);
        }
        java.util.Map mapUnmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.m.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (this.f9201b.f8491a.get()) {
            throw new java.lang.IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final java.lang.Object c(S1.e key) {
        kotlin.jvm.internal.m.e(key, "key");
        java.lang.Object obj = this.f9200a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(S1.e key, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(key, "key");
        e(key, obj);
    }

    public final void e(S1.e key, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(key, "key");
        b();
        java.util.LinkedHashMap linkedHashMap = this.f9200a;
        if (obj == null) {
            b();
            linkedHashMap.remove(key);
            return;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set setUnmodifiableSet = java.util.Collections.unmodifiableSet(p078i6.o.R1((java.util.Set) obj));
            kotlin.jvm.internal.m.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    public final boolean equals(java.lang.Object obj) {
        boolean zA;
        if (obj instanceof S1.b) {
            S1.b bVar = (S1.b) obj;
            java.util.LinkedHashMap linkedHashMap = bVar.f9200a;
            java.util.LinkedHashMap linkedHashMap2 = this.f9200a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    java.util.LinkedHashMap linkedHashMap3 = bVar.f9200a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (java.util.Map.Entry entry : linkedHashMap3.entrySet()) {
                            java.lang.Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                java.lang.Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = kotlin.jvm.internal.m.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && java.util.Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        java.util.Iterator it = this.f9200a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? java.util.Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final java.lang.String toString() {
        return p078i6.o.o1(this.f9200a.entrySet(), ",\n", "{\n", "\n}", S1.a.f9199h, 24);
    }

    public /* synthetic */ b(boolean z6) {
        this(new java.util.LinkedHashMap(), z6);
    }
}
