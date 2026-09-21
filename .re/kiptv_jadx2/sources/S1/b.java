package S1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p070h6.k;
import p078i6.D;
import p078i6.o;
import p078i6.q;

public final class b {

    public final LinkedHashMap f9200a;

    public final Q1.a f9201b;

    public b(LinkedHashMap linkedHashMap, boolean z6) {
        this.f9200a = linkedHashMap;
        this.f9201b = new Q1.a(z6);
    }

    public final Map a() {
        k kVar;
        Set<Map.Entry> setEntrySet = this.f9200a.entrySet();
        int iI0 = D.I0(q.I0(setEntrySet, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iI0);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                m.d(bArrCopyOf, "copyOf(this, size)");
                kVar = new k(key, bArrCopyOf);
            } else {
                kVar = new k(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(kVar.f22539h, kVar.f22540i);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        m.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (this.f9201b.f8491a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e key) {
        m.e(key, "key");
        Object obj = this.f9200a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        m.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(e key, Object obj) {
        m.e(key, "key");
        e(key, obj);
    }

    public final void e(e key, Object obj) {
        m.e(key, "key");
        b();
        LinkedHashMap linkedHashMap = this.f9200a;
        if (obj == null) {
            b();
            linkedHashMap.remove(key);
            return;
        }
        if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(o.R1((Set) obj));
            m.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            m.d(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (obj instanceof b) {
            b bVar = (b) obj;
            LinkedHashMap linkedHashMap = bVar.f9200a;
            LinkedHashMap linkedHashMap2 = this.f9200a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = bVar.f9200a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = m.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
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
        Iterator it = this.f9200a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return o.o1(this.f9200a.entrySet(), ",\n", "{\n", "\n}", a.f9199h, 24);
    }

    public b(boolean z6) {
        this(new LinkedHashMap(), z6);
    }
}
