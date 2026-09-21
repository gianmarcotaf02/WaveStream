package p086j6;

import androidx.media3.common.util.Log;
import com.google.common.util.concurrent.P;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.m;
import p064h0.h;
import p201y6.d;

public final class e implements Map, Serializable, d {

    public static final e f24240u;

    public Object[] f24241h;

    public Object[] f24242i;
    public int[] j;

    public int[] f24243k;

    public int f24244l;

    public int f24245m;

    public int f24246n;

    public int f24247o;

    public int f24248p;

    public f f24249q;

    public h f24250r;

    public f f24251s;

    public boolean f24252t;

    static {
        e eVar = new e(0);
        eVar.f24252t = true;
        f24240u = eVar;
    }

    public e() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iM = m(obj);
            int i3 = this.f24244l * 2;
            int length = this.f24243k.length / 2;
            if (i3 > length) {
                i3 = length;
            }
            int i9 = 0;
            while (true) {
                int[] iArr = this.f24243k;
                int i10 = iArr[iM];
                if (i10 <= 0) {
                    int i11 = this.f24245m;
                    Object[] objArr = this.f24241h;
                    if (i11 >= objArr.length) {
                        i(1);
                        break;
                    }
                    int i12 = i11 + 1;
                    this.f24245m = i12;
                    objArr[i11] = obj;
                    this.j[i11] = iM;
                    iArr[iM] = i12;
                    this.f24248p++;
                    this.f24247o++;
                    if (i9 > this.f24244l) {
                        this.f24244l = i9;
                    }
                    return i11;
                }
                if (m.a(this.f24241h[i10 - 1], obj)) {
                    return -i10;
                }
                i9++;
                if (i9 > i3) {
                    n(this.f24243k.length * 2);
                    break;
                }
                iM = iM == 0 ? this.f24243k.length - 1 : iM - 1;
            }
        }
    }

    public final e b() {
        c();
        this.f24252t = true;
        if (this.f24248p > 0) {
            return this;
        }
        e eVar = f24240u;
        m.c(eVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return eVar;
    }

    public final void c() {
        if (this.f24252t) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        c();
        int i3 = this.f24245m - 1;
        if (i3 >= 0) {
            int i9 = 0;
            while (true) {
                int[] iArr = this.j;
                int i10 = iArr[i9];
                if (i10 >= 0) {
                    this.f24243k[i10] = 0;
                    iArr[i9] = -1;
                }
                if (i9 == i3) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        P.q0(this.f24241h, 0, this.f24245m);
        Object[] objArr = this.f24242i;
        if (objArr != null) {
            P.q0(objArr, 0, this.f24245m);
        }
        this.f24248p = 0;
        this.f24245m = 0;
        this.f24247o++;
    }

    @Override
    public final boolean containsKey(Object obj) {
        return j(obj) >= 0;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return l(obj) >= 0;
    }

    public final void d(boolean z6) {
        int i3;
        Object[] objArr = this.f24242i;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i3 = this.f24245m;
            if (i9 >= i3) {
                break;
            }
            int[] iArr = this.j;
            int i11 = iArr[i9];
            if (i11 >= 0) {
                Object[] objArr2 = this.f24241h;
                objArr2[i10] = objArr2[i9];
                if (objArr != null) {
                    objArr[i10] = objArr[i9];
                }
                if (z6) {
                    iArr[i10] = i11;
                    this.f24243k[i11] = i10 + 1;
                }
                i10++;
            }
            i9++;
        }
        P.q0(this.f24241h, i10, i3);
        if (objArr != null) {
            P.q0(objArr, i10, this.f24245m);
        }
        this.f24245m = i10;
    }

    public final boolean e(Collection m8) {
        m.e(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final Set entrySet() {
        f fVar = this.f24251s;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.f24251s = fVar2;
        return fVar2;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f24248p == map.size() && e(map.entrySet());
    }

    public final boolean g(Map.Entry entry) {
        m.e(entry, "entry");
        int iJ = j(entry.getKey());
        if (iJ < 0) {
            return false;
        }
        Object[] objArr = this.f24242i;
        m.b(objArr);
        return m.a(objArr[iJ], entry.getValue());
    }

    @Override
    public final Object get(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f24242i;
        m.b(objArr);
        return objArr[iJ];
    }

    @Override
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i3 = 0;
        while (cVar.hasNext()) {
            int i9 = cVar.f1970h;
            e eVar = (e) cVar.f1972k;
            if (i9 >= eVar.f24245m) {
                throw new NoSuchElementException();
            }
            cVar.f1970h = i9 + 1;
            cVar.f1971i = i9;
            Object obj = eVar.f24241h[i9];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.f24242i;
            m.b(objArr);
            Object obj2 = objArr[cVar.f1971i];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.e();
            i3 += iHashCode ^ iHashCode2;
        }
        return i3;
    }

    public final void i(int i3) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f24241h;
        int length = objArr.length;
        int i9 = this.f24245m;
        int i10 = length - i9;
        int i11 = i9 - this.f24248p;
        if (i10 < i3 && i10 + i11 >= i3 && i11 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i12 = i9 + i3;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        if (i12 > objArr.length) {
            int length2 = objArr.length;
            int i13 = length2 + (length2 >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Log.LOG_LEVEL_OFF : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i13);
            m.d(objArrCopyOf2, "copyOf(...)");
            this.f24241h = objArrCopyOf2;
            Object[] objArr2 = this.f24242i;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i13);
                m.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f24242i = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.j, i13);
            m.d(iArrCopyOf, "copyOf(...)");
            this.j = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i13 >= 1 ? i13 : 1) * 3);
            if (iHighestOneBit > this.f24243k.length) {
                n(iHighestOneBit);
            }
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f24248p == 0;
    }

    public final int j(Object obj) {
        int iM = m(obj);
        int i3 = this.f24244l;
        while (true) {
            int i9 = this.f24243k[iM];
            if (i9 == 0) {
                return -1;
            }
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (m.a(this.f24241h[i10], obj)) {
                    return i10;
                }
            }
            i3--;
            if (i3 < 0) {
                return -1;
            }
            iM = iM == 0 ? this.f24243k.length - 1 : iM - 1;
        }
    }

    @Override
    public final Set keySet() {
        f fVar = this.f24249q;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.f24249q = fVar2;
        return fVar2;
    }

    public final int l(Object obj) {
        int i3 = this.f24245m;
        while (true) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
            if (this.j[i3] >= 0) {
                Object[] objArr = this.f24242i;
                m.b(objArr);
                if (m.a(objArr[i3], obj)) {
                    return i3;
                }
            }
        }
    }

    public final int m(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f24246n;
    }

    public final void n(int i3) {
        int[] iArr;
        this.f24247o++;
        int i9 = 0;
        if (this.f24245m > this.f24248p) {
            d(false);
        }
        this.f24243k = new int[i3];
        this.f24246n = Integer.numberOfLeadingZeros(i3) + 1;
        while (i9 < this.f24245m) {
            int i10 = i9 + 1;
            int iM = m(this.f24241h[i9]);
            int i11 = this.f24244l;
            while (true) {
                iArr = this.f24243k;
                if (iArr[iM] == 0) {
                    break;
                }
                i11--;
                if (i11 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM = iM == 0 ? iArr.length - 1 : iM - 1;
            }
            iArr[iM] = i10;
            this.j[i9] = iM;
            i9 = i10;
        }
    }

    public final void o(int i3) {
        Object[] objArr = this.f24241h;
        m.e(objArr, "<this>");
        objArr[i3] = null;
        Object[] objArr2 = this.f24242i;
        if (objArr2 != null) {
            objArr2[i3] = null;
        }
        int length = this.j[i3];
        int i9 = this.f24244l * 2;
        int length2 = this.f24243k.length / 2;
        if (i9 > length2) {
            i9 = length2;
        }
        int i10 = i9;
        int i11 = 0;
        int i12 = length;
        do {
            length = length == 0 ? this.f24243k.length - 1 : length - 1;
            i11++;
            if (i11 > this.f24244l) {
                this.f24243k[i12] = 0;
            } else {
                int[] iArr = this.f24243k;
                int i13 = iArr[length];
                if (i13 == 0) {
                    iArr[i12] = 0;
                } else {
                    if (i13 < 0) {
                        iArr[i12] = -1;
                    } else {
                        int i14 = i13 - 1;
                        int iM = m(this.f24241h[i14]) - length;
                        int[] iArr2 = this.f24243k;
                        if ((iM & (iArr2.length - 1)) >= i11) {
                            iArr2[i12] = i13;
                            this.j[i14] = i12;
                        }
                        i10--;
                    }
                    i12 = length;
                    i11 = 0;
                    i10--;
                }
            }
            this.j[i3] = -1;
            this.f24248p--;
            this.f24247o++;
        } while (i10 >= 0);
        this.f24243k[i12] = -1;
        this.j[i3] = -1;
        this.f24248p--;
        this.f24247o++;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f24242i;
        if (objArr == null) {
            int length = this.f24241h.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f24242i = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i3 = (-iA) - 1;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    @Override
    public final void putAll(Map from) {
        m.e(from, "from");
        c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        i(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f24242i;
            if (objArr == null) {
                int length = this.f24241h.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f24242i = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i3 = (-iA) - 1;
                if (!m.a(entry.getValue(), objArr[i3])) {
                    objArr[i3] = entry.getValue();
                }
            }
        }
    }

    @Override
    public final Object remove(Object obj) {
        c();
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f24242i;
        m.b(objArr);
        Object obj2 = objArr[iJ];
        o(iJ);
        return obj2;
    }

    @Override
    public final int size() {
        return this.f24248p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f24248p * 3) + 2);
        sb.append("{");
        c cVar = new c(this, 0);
        int i3 = 0;
        while (cVar.hasNext()) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i9 = cVar.f1970h;
            e eVar = (e) cVar.f1972k;
            if (i9 >= eVar.f24245m) {
                throw new NoSuchElementException();
            }
            cVar.f1970h = i9 + 1;
            cVar.f1971i = i9;
            Object obj = eVar.f24241h[i9];
            if (obj == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.f24242i;
            m.b(objArr);
            Object obj2 = objArr[cVar.f1971i];
            if (obj2 == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.e();
            i3++;
        }
        sb.append("}");
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    @Override
    public final Collection values() {
        h hVar = this.f24250r;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(1, this);
        this.f24250r = hVar2;
        return hVar2;
    }

    public e(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i3];
        int[] iArr = new int[i3];
        int iHighestOneBit = Integer.highestOneBit((i3 < 1 ? 1 : i3) * 3);
        this.f24241h = objArr;
        this.f24242i = null;
        this.j = iArr;
        this.f24243k = new int[iHighestOneBit];
        this.f24244l = 2;
        this.f24245m = 0;
        this.f24246n = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
