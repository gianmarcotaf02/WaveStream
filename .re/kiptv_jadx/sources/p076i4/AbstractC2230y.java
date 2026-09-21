package p076i4;

/* JADX INFO: renamed from: i4.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2230y {
    public static java.util.AbstractList A(java.util.List list, p068h4.j jVar) {
        return list instanceof java.util.RandomAccess ? new p076i4.C2231y0(list, jVar) : new p076i4.C2233z0(list, jVar);
    }

    public static int a(int i3) {
        if (i3 >= 3) {
            return i3 < 1073741824 ? (int) java.lang.Math.ceil(((double) i3) / 0.75d) : androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        d(i3, "expectedSize");
        return i3 + 1;
    }

    public static void b(java.lang.Object[] objArr, int i3) {
        for (int i9 = 0; i9 < i3; i9++) {
            if (objArr[i9] == null) {
                throw new java.lang.NullPointerException(com.google.android.gms.internal.play_billing.M0.l(i9, "at index "));
            }
        }
    }

    public static void c(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new java.lang.NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void d(int i3, java.lang.String str) {
        if (i3 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + " cannot be negative but was: " + i3);
    }

    public static void e(java.util.Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean f(p076i4.g1 g1Var, java.lang.Object obj) {
        java.util.Iterator it = g1Var.f22901h;
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

    public static java.lang.Object g(int i3) {
        if (i3 < 2 || i3 > 1073741824 || java.lang.Integer.highestOneBit(i3) != i3) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i3 <= 256) {
            return new byte[i3];
        }
        return i3 <= 65536 ? new short[i3] : new int[i3];
    }

    public static boolean h(java.lang.Object obj, java.util.Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set2 = (java.util.Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    public static p076i4.c1 j(java.util.Set set, p068h4.l lVar) {
        if (!(set instanceof java.util.SortedSet)) {
            if (!(set instanceof p076i4.c1)) {
                set.getClass();
                return new p076i4.c1(set, lVar);
            }
            p076i4.c1 c1Var = (p076i4.c1) set;
            p068h4.l lVar2 = c1Var.f22879i;
            lVar2.getClass();
            return new p076i4.c1(c1Var.f22878h, new p068h4.m(java.util.Arrays.asList(lVar2, lVar)));
        }
        java.util.Set set2 = (java.util.SortedSet) set;
        if (!(set2 instanceof p076i4.c1)) {
            set2.getClass();
            return new p076i4.d1(set2, lVar);
        }
        p076i4.c1 c1Var2 = (p076i4.c1) set2;
        p068h4.l lVar3 = c1Var2.f22879i;
        lVar3.getClass();
        return new p076i4.d1((java.util.SortedSet) c1Var2.f22878h, new p068h4.m(java.util.Arrays.asList(lVar3, lVar)));
    }

    public static java.lang.Object k(java.lang.String str, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static java.lang.Object l(java.lang.Iterable iterable) {
        java.lang.Object next;
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                throw new java.util.NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        java.util.Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static java.lang.Object m(java.lang.Iterable iterable) {
        java.lang.Object next;
        if (iterable instanceof java.util.Collection) {
            if (((java.util.Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof java.util.List) {
                java.util.List list = (java.util.List) iterable;
                return list.get(list.size() - 1);
            }
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int n(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i3 = ~(~(i3 + (next != null ? next.hashCode() : 0)));
        }
        return i3;
    }

    public static p076i4.b1 o(p076i4.AbstractC2214p0 abstractC2214p0, p076i4.AbstractC2214p0 abstractC2214p1) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(abstractC2214p0, "set1");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(abstractC2214p1, "set2");
        return new p076i4.b1(abstractC2214p0, abstractC2214p1);
    }

    public static int p(int i3, int i9, int i10) {
        return (i3 & (~i10)) | (i9 & i10);
    }

    public static java.util.ArrayList q(java.lang.Object... objArr) {
        int length = objArr.length;
        d(length, "arraySize");
        java.util.ArrayList arrayList = new java.util.ArrayList(com.google.crypto.tink.shaded.protobuf.q0.F(((long) length) + 5 + ((long) (length / 10))));
        java.util.Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int r(int i3) {
        return (i3 + 1) * (i3 < 32 ? 4 : 2);
    }

    public static int s(java.lang.Object obj, java.lang.Object obj2, int i3, java.lang.Object obj3, int[] iArr, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
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
                if ((i14 & i10) == i11 && com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj, objArr[i13]) && (objArr2 == null || com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj2, objArr2[i13]))) {
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

    public static boolean t(java.util.Set set, java.util.Collection collection) {
        collection.getClass();
        if (collection instanceof p076i4.K0) {
            collection = ((p076i4.Y0) ((p076i4.K0) collection)).r();
        }
        boolean zRemove = false;
        if (!(collection instanceof java.util.Set) || collection.size() <= set.size()) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        java.util.Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static void u(java.util.List list, p068h4.l lVar, int i3, int i9) {
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
        return (int) (((long) java.lang.Integer.rotateLeft((int) (((long) i3) * (-862048943)), 15)) * 461845907);
    }

    public static int w(java.lang.Object obj) {
        return v(obj == null ? 0 : obj.hashCode());
    }

    public static int x(int i3, java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i3] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i3] & 65535 : ((int[]) obj)[i3];
    }

    public static void y(int i3, int i9, java.lang.Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i9;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i9;
        } else {
            ((int[]) obj)[i3] = i9;
        }
    }

    public static java.lang.String z(java.util.Map map) {
        int size = map.size();
        d(size, "size");
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (java.util.Map.Entry entry : map.entrySet()) {
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
