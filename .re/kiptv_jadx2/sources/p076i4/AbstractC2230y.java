package p076i4;

import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import p068h4.j;
import p068h4.l;
import p068h4.m;

public abstract class AbstractC2230y {
    public static AbstractList A(List list, j jVar) {
        return list instanceof RandomAccess ? new C2231y0(list, jVar) : new C2233z0(list, jVar);
    }

    public static int a(int i3) {
        if (i3 >= 3) {
            return i3 < 1073741824 ? (int) Math.ceil(((double) i3) / 0.75d) : Log.LOG_LEVEL_OFF;
        }
        d(i3, "expectedSize");
        return i3 + 1;
    }

    public static void b(Object[] objArr, int i3) {
        for (int i9 = 0; i9 < i3; i9++) {
            if (objArr[i9] == null) {
                throw new NullPointerException(M0.l(i9, "at index "));
            }
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void d(int i3, String str) {
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i3);
    }

    public static void e(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean f(g1 g1Var, Object obj) {
        Iterator it = g1Var.f22901h;
        if (obj == null) {
            while (it.hasNext()) {
                if (g1Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(g1Var.next())) {
                return true;
            }
        }
        return false;
    }

    public static Object g(int i3) {
        if (i3 < 2 || i3 > 1073741824 || Integer.highestOneBit(i3) != i3) {
            throw new IllegalArgumentException(M0.l(i3, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i3 <= 256) {
            return new byte[i3];
        }
        return i3 <= 65536 ? new short[i3] : new int[i3];
    }

    public static boolean h(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static c1 j(Set set, l lVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof c1)) {
                set.getClass();
                return new c1(set, lVar);
            }
            c1 c1Var = (c1) set;
            l lVar2 = c1Var.f22879i;
            lVar2.getClass();
            return new c1(c1Var.f22878h, new m(Arrays.asList(lVar2, lVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof c1)) {
            set2.getClass();
            return new d1(set2, lVar);
        }
        c1 c1Var2 = (c1) set2;
        l lVar3 = c1Var2.f22879i;
        lVar3.getClass();
        return new d1((SortedSet) c1Var2.f22878h, new m(Arrays.asList(lVar3, lVar)));
    }

    public static Object k(String str, Collection collection) {
        Iterator it = collection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object m(Iterable iterable) {
        Object next;
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.get(list.size() - 1);
            }
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int n(Set set) {
        Iterator it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 = ~(~(i3 + (next != null ? next.hashCode() : 0)));
        }
        return i3;
    }

    public static b1 o(AbstractC2214p0 abstractC2214p0, AbstractC2214p0 abstractC2214p1) {
        AbstractC1864o0.U(abstractC2214p0, "set1");
        AbstractC1864o0.U(abstractC2214p1, "set2");
        return new b1(abstractC2214p0, abstractC2214p1);
    }

    public static int p(int i3, int i9, int i10) {
        return (i3 & (~i10)) | (i9 & i10);
    }

    public static ArrayList q(Object... objArr) {
        int length = objArr.length;
        d(length, "arraySize");
        ArrayList arrayList = new ArrayList(q0.F(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int r(int i3) {
        return (i3 + 1) * (i3 < 32 ? 4 : 2);
    }

    public static int s(Object obj, Object obj2, int i3, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iW = w(obj);
        int i9 = iW & i3;
        int iX = x(i9, obj3);
        if (iX != 0) {
            int i10 = ~i3;
            int i11 = iW & i10;
            int i12 = -1;
            while (true) {
                int i13 = iX - 1;
                int i14 = iArr[i13];
                if ((i14 & i10) == i11 && AbstractC1853k0.m(obj, objArr[i13]) && (objArr2 == null || AbstractC1853k0.m(obj2, objArr2[i13]))) {
                    int i15 = i14 & i3;
                    if (i12 == -1) {
                        y(i9, i15, obj3);
                        return i13;
                    }
                    iArr[i12] = p(iArr[i12], i15, i3);
                    return i13;
                }
                int i16 = i14 & i3;
                if (i16 == 0) {
                    break;
                }
                i12 = i13;
                iX = i16;
            }
        }
        return -1;
    }

    public static boolean t(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof K0) {
            collection = ((Y0) ((K0) collection)).r();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static void u(List list, l lVar, int i3, int i9) {
        for (int size = list.size() - 1; size > i9; size--) {
            if (lVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i10 = i9 - 1; i10 >= i3; i10--) {
            list.remove(i10);
        }
    }

    public static int v(int i3) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i3) * (-862048943)), 15)) * 461845907);
    }

    public static int w(Object obj) {
        return v(obj == null ? 0 : obj.hashCode());
    }

    public static int x(int i3, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i3] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i3] & 65535 : ((int[]) obj)[i3];
    }

    public static void y(int i3, int i9, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i9;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i9;
        } else {
            ((int[]) obj)[i3] = i9;
        }
    }

    public static String z(Map map) {
        int size = map.size();
        d(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
