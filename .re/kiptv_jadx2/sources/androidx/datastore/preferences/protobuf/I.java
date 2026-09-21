package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class I extends LinkedHashMap {

    public static final I f16139i;

    public boolean f16140h = true;

    static {
        I i3 = new I();
        f16139i = i3;
        i3.f16140h = false;
    }

    public final void a() {
        if (!this.f16140h) {
            throw new UnsupportedOperationException();
        }
    }

    public final I b() {
        if (isEmpty()) {
            return new I();
        }
        I i3 = new I(this);
        i3.f16140h = true;
        return i3;
    }

    @Override
    public final void clear() {
        a();
        super.clear();
    }

    @Override
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override
    public final boolean equals(Object obj) {
        boolean z6;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                Object value = entry.getValue();
                                Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
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

    @Override
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i3 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC1516x.f16267a;
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
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = AbstractC1516x.f16267a;
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

    @Override
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = AbstractC1516x.f16267a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC1516x.f16267a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}
