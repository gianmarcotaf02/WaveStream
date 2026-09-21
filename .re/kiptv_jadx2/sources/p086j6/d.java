package p086j6;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.m;
import p201y6.a;

public final class d implements Map.Entry, a {

    public final e f24238h;

    public final int f24239i;
    public final int j;

    public d(e map, int i3) {
        m.e(map, "map");
        this.f24238h = map;
        this.f24239i = i3;
        this.j = map.f24247o;
    }

    public final void a() {
        if (this.f24238h.f24247o != this.j) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m.a(entry.getKey(), getKey()) && m.a(entry.getValue(), getValue());
    }

    @Override
    public final Object getKey() {
        a();
        return this.f24238h.f24241h[this.f24239i];
    }

    @Override
    public final Object getValue() {
        a();
        Object[] objArr = this.f24238h.f24242i;
        m.b(objArr);
        return objArr[this.f24239i];
    }

    @Override
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override
    public final Object setValue(Object obj) {
        a();
        e eVar = this.f24238h;
        eVar.c();
        Object[] objArr = eVar.f24242i;
        if (objArr == null) {
            int length = eVar.f24241h.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.f24242i = objArr;
        }
        int i3 = this.f24239i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
