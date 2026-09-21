package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends p078i6.u {
    public static java.util.ArrayList A1(java.util.Collection collection, java.lang.Iterable elements) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        if (!(elements instanceof java.util.Collection)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            p078i6.u.M0(arrayList, elements);
            return arrayList;
        }
        java.util.Collection collection2 = (java.util.Collection) elements;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static java.util.List B1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).size() <= 1) {
            return N1(iterable);
        }
        java.util.List listP1 = P1(iterable);
        java.util.Collections.reverse(listP1);
        return listP1;
    }

    public static java.lang.Object C1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return D1((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            throw new java.lang.IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static java.lang.Object D1(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new java.lang.IllegalArgumentException("List has more than one element.");
    }

    public static java.lang.Object E1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static java.lang.Object F1(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static java.util.List G1(java.util.List list, D6.g indices) {
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(indices, "indices");
        if (indices.isEmpty()) {
            return p078i6.w.f23205h;
        }
        return N1(list.subList(indices.f2458h, indices.f2459i + 1));
    }

    public static java.util.List H1(java.lang.Iterable iterable) {
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List listP1 = P1(iterable);
            p078i6.t.K0(listP1);
            return listP1;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        if (collection.size() <= 1) {
            return N1(iterable);
        }
        java.lang.Object[] array = collection.toArray(new java.lang.Comparable[0]);
        java.lang.Comparable[] comparableArr = (java.lang.Comparable[]) array;
        kotlin.jvm.internal.m.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            java.util.Arrays.sort(comparableArr);
        }
        return p078i6.m.S(array);
    }

    public static java.util.List I1(java.lang.Iterable iterable, java.util.Comparator comparator) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List listP1 = P1(iterable);
            p078i6.t.L0(comparator, listP1);
            return listP1;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        if (collection.size() <= 1) {
            return N1(iterable);
        }
        java.lang.Object[] array = collection.toArray(new java.lang.Object[0]);
        p078i6.m.A0(array, comparator);
        return p078i6.m.S(array);
    }

    public static java.util.List J1(java.lang.Iterable iterable, int i3) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return p078i6.w.f23205h;
        }
        if (iterable instanceof java.util.Collection) {
            if (i3 >= ((java.util.Collection) iterable).size()) {
                return N1(iterable);
            }
            if (i3 == 1) {
                return com.google.common.util.concurrent.P.i0(g1(iterable));
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i3);
        java.util.Iterator it = iterable.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i9++;
            if (i9 == i3) {
                break;
            }
        }
        return p078i6.p.E0(arrayList);
    }

    public static java.util.List K1(int i3, java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return p078i6.w.f23205h;
        }
        int size = list.size();
        if (i3 >= size) {
            return N1(list);
        }
        if (i3 == 1) {
            return com.google.common.util.concurrent.P.i0(q1(list));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i3);
        if (list instanceof java.util.RandomAccess) {
            for (int i9 = size - i3; i9 < size; i9++) {
                arrayList.add(list.get(i9));
            }
        } else {
            java.util.ListIterator listIterator = list.listIterator(size - i3);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final void L1(java.lang.Iterable iterable, java.util.AbstractCollection abstractCollection) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] M1(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        int[] iArr = new int[list.size()];
        java.util.Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((java.lang.Number) it.next()).intValue();
            i3++;
        }
        return iArr;
    }

    public static java.util.List N1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            return p078i6.p.E0(P1(iterable));
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p078i6.w.f23205h;
        }
        if (size != 1) {
            return O1(collection);
        }
        return com.google.common.util.concurrent.P.i0(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
    }

    public static java.util.ArrayList O1(java.util.Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        return new java.util.ArrayList(collection);
    }

    public static final java.util.List P1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return O1((java.util.Collection) iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        L1(iterable, arrayList);
        return arrayList;
    }

    public static java.util.Set Q1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return new java.util.LinkedHashSet((java.util.Collection) iterable);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        L1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static java.util.Set R1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        boolean z6 = iterable instanceof java.util.Collection;
        p078i6.y yVar = p078i6.y.f23207h;
        if (z6) {
            java.util.Collection collection = (java.util.Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
                }
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p078i6.D.I0(collection.size()));
                L1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            L1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(linkedHashSet2.iterator().next());
            }
        }
        return yVar;
    }

    public static N7.r S1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return new N7.r(2, new p077i5.C2237d(2, iterable));
    }

    public static java.util.ArrayList T1(java.util.Collection collection, java.util.Collection other) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        java.util.Iterator it = collection.iterator();
        java.util.Iterator it2 = other.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(p078i6.q.I0(collection, 10), p078i6.q.I0(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new p070h6.k(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int V0(int i3, java.util.List list) {
        if (i3 >= 0 && i3 <= p078i6.p.A0(list)) {
            return p078i6.p.A0(list) - i3;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "Element index ", " must be in range [");
        sbT.append(new D6.g(0, p078i6.p.A0(list), 1));
        sbT.append("].");
        throw new java.lang.IndexOutOfBoundsException(sbT.toString());
    }

    public static final int W0(int i3, java.util.List list) {
        if (i3 >= 0 && i3 <= list.size()) {
            return list.size() - i3;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "Position index ", " must be in range [");
        sbT.append(new D6.g(0, list.size(), 1));
        sbT.append("].");
        throw new java.lang.IndexOutOfBoundsException(sbT.toString());
    }

    public static O7.k X0(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        return new O7.k(list);
    }

    public static N7.p Y0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return new N7.p(4, iterable);
    }

    public static double Z0(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i3 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((java.lang.Number) it.next()).floatValue();
            i3++;
            if (i3 < 0) {
                p078i6.p.G0();
                throw null;
            }
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i3);
    }

    public static java.util.ArrayList a1(java.lang.Iterable iterable, int i3) {
        com.google.crypto.tink.shaded.protobuf.AbstractC1911f.k(i3, i3);
        if (!(iterable instanceof java.util.RandomAccess) || !(iterable instanceof java.util.List)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator iterator = iterable.iterator();
            kotlin.jvm.internal.m.e(iterator, "iterator");
            java.util.Iterator itT = !iterator.hasNext() ? p078i6.v.f23204h : E8.d.T(new p078i6.J(i3, i3, iterator, null));
            while (itT.hasNext()) {
                arrayList.add((java.util.List) itT.next());
            }
            return arrayList;
        }
        java.util.List list = (java.util.List) iterable;
        int size = list.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList((size / i3) + (size % i3 == 0 ? 0 : 1));
        int i9 = 0;
        while (i9 >= 0 && i9 < size) {
            int i10 = size - i9;
            if (i3 <= i10) {
                i10 = i3;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList3.add(list.get(i11 + i9));
            }
            arrayList2.add(arrayList3);
            i9 += i3;
        }
        return arrayList2;
    }

    public static boolean b1(java.lang.Iterable iterable, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).contains(obj);
        }
        return l1(iterable, obj) >= 0;
    }

    public static java.util.List c1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return N1(Q1(iterable));
    }

    public static java.util.List d1(java.lang.Iterable iterable, int i3) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return N1(iterable);
        }
        if (iterable instanceof java.util.Collection) {
            int size = ((java.util.Collection) iterable).size() - i3;
            if (size <= 0) {
                return p078i6.w.f23205h;
            }
            if (size == 1) {
                return com.google.common.util.concurrent.P.i0(p1(iterable));
            }
            arrayList = new java.util.ArrayList(size);
            if (iterable instanceof java.util.List) {
                if (iterable instanceof java.util.RandomAccess) {
                    java.util.List list = (java.util.List) iterable;
                    int size2 = list.size();
                    while (i3 < size2) {
                        arrayList.add(list.get(i3));
                        i3++;
                    }
                } else {
                    java.util.ListIterator listIterator = ((java.util.List) iterable).listIterator(i3);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new java.util.ArrayList();
        }
        int i9 = 0;
        for (java.lang.Object obj : iterable) {
            if (i9 >= i3) {
                arrayList.add(obj);
            } else {
                i9++;
            }
        }
        return p078i6.p.E0(arrayList);
    }

    public static java.util.List e1(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return J1(list, size);
    }

    public static java.util.ArrayList f1(java.util.Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static java.lang.Object g1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return h1((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new java.util.NoSuchElementException("Collection is empty.");
    }

    public static java.lang.Object h1(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static java.lang.Object i1(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static java.lang.Object j1(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static java.lang.Object k1(int i3, java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (i3 < 0 || i3 >= list.size()) {
            return null;
        }
        return list.get(i3);
    }

    public static int l1(java.lang.Iterable iterable, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return ((java.util.List) iterable).indexOf(obj);
        }
        int i3 = 0;
        for (java.lang.Object obj2 : iterable) {
            if (i3 < 0) {
                p078i6.p.H0();
                throw null;
            }
            if (kotlin.jvm.internal.m.a(obj, obj2)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static final void m1(java.lang.Iterable iterable, java.lang.Appendable buffer, java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, java.lang.CharSequence charSequence, p194x6.j jVar) throws java.io.IOException {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        buffer.append(prefix);
        int i3 = 0;
        for (java.lang.Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            O7.r.m(buffer, obj, jVar);
        }
        buffer.append(postfix);
    }

    public static /* synthetic */ void n1(java.lang.Iterable iterable, java.lang.Appendable appendable, java.lang.String str, java.lang.String str2, java.lang.String str3, p194x6.j jVar, int i3) throws java.io.IOException {
        if ((i3 & 2) != 0) {
            str = ", ";
        }
        java.lang.String str4 = str;
        java.lang.String str5 = (i3 & 4) != 0 ? "" : str2;
        java.lang.String str6 = (i3 & 8) != 0 ? "" : str3;
        if ((i3 & 64) != 0) {
            jVar = null;
        }
        m1(iterable, appendable, str4, str5, str6, "...", jVar);
    }

    public static java.lang.String o1(java.lang.Iterable iterable, java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, p194x6.j jVar, int i3) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence separator = charSequence;
        java.lang.String prefix = (i3 & 2) != 0 ? "" : str;
        java.lang.String str3 = (i3 & 4) != 0 ? "" : str2;
        if ((i3 & 32) != 0) {
            jVar = null;
        }
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        m1(iterable, sb, separator, prefix, str3, "...", jVar);
        return sb.toString();
    }

    public static java.lang.Object p1(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return q1((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static java.lang.Object q1(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(p078i6.p.A0(list));
    }

    public static java.lang.Object r1(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static java.lang.Object s1(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static java.lang.Comparable t1(java.util.List list) {
        java.util.Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Comparable u1(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Object v1(java.util.List list, S4.B b9) {
        java.util.Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            java.lang.Object next2 = it.next();
            if (b9.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static java.util.ArrayList w1(java.lang.Iterable iterable, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
        boolean z6 = false;
        for (java.lang.Object obj2 : iterable) {
            boolean z9 = true;
            if (!z6 && kotlin.jvm.internal.m.a(obj2, obj)) {
                z6 = true;
                z9 = false;
            }
            if (z9) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static java.util.ArrayList x1(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return A1((java.util.Collection) iterable, iterable2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p078i6.u.M0(arrayList, iterable);
        p078i6.u.M0(arrayList, iterable2);
        return arrayList;
    }

    public static java.util.ArrayList y1(java.lang.Iterable iterable, java.lang.Object obj) {
        if (iterable instanceof java.util.Collection) {
            return z1(obj, (java.util.Collection) iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p078i6.u.M0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static java.util.ArrayList z1(java.lang.Object obj, java.util.Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }
}
