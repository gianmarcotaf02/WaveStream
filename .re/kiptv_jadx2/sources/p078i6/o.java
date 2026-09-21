package p078i6;

import D6.g;
import E8.d;
import N7.r;
import S4.B;
import Y6.f;
import com.google.common.util.concurrent.P;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import com.google.crypto.tink.shaded.protobuf.AbstractC1911f;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.m;
import p070h6.k;
import p077i5.C2237d;
import p121o0.p;
import p194x6.j;

public abstract class o extends u {
    public static ArrayList A1(Collection collection, Iterable elements) {
        m.e(collection, "<this>");
        m.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            u.M0(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List B1(Iterable iterable) {
        m.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return N1(iterable);
        }
        List listP1 = P1(iterable);
        Collections.reverse(listP1);
        return listP1;
    }

    public static Object C1(Iterable iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return D1((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object D1(List list) {
        m.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object E1(Iterable iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object F1(List list) {
        m.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List G1(List list, g indices) {
        m.e(list, "<this>");
        m.e(indices, "indices");
        if (indices.isEmpty()) {
            return w.f23205h;
        }
        return N1(list.subList(indices.f2458h, indices.f2459i + 1));
    }

    public static List H1(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List listP1 = P1(iterable);
            t.K0(listP1);
            return listP1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return N1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        m.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return m.S(array);
    }

    public static List I1(Iterable iterable, Comparator comparator) {
        m.e(iterable, "<this>");
        m.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listP1 = P1(iterable);
            t.L0(comparator, listP1);
            return listP1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return N1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        m.A0(array, comparator);
        return m.S(array);
    }

    public static List J1(Iterable iterable, int i3) {
        m.e(iterable, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return w.f23205h;
        }
        if (iterable instanceof Collection) {
            if (i3 >= ((Collection) iterable).size()) {
                return N1(iterable);
            }
            if (i3 == 1) {
                return P.i0(g1(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i3);
        Iterator it = iterable.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i9++;
            if (i9 == i3) {
                break;
            }
        }
        return p.E0(arrayList);
    }

    public static List K1(int i3, List list) {
        m.e(list, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return w.f23205h;
        }
        int size = list.size();
        if (i3 >= size) {
            return N1(list);
        }
        if (i3 == 1) {
            return P.i0(q1(list));
        }
        ArrayList arrayList = new ArrayList(i3);
        if (list instanceof RandomAccess) {
            for (int i9 = size - i3; i9 < size; i9++) {
                arrayList.add(list.get(i9));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i3);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final void L1(Iterable iterable, AbstractCollection abstractCollection) {
        m.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] M1(List list) {
        m.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((Number) it.next()).intValue();
            i3++;
        }
        return iArr;
    }

    public static List N1(Iterable iterable) {
        m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return p.E0(P1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w.f23205h;
        }
        if (size != 1) {
            return O1(collection);
        }
        return P.i0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList O1(Collection collection) {
        m.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List P1(Iterable iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return O1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        L1(iterable, arrayList);
        return arrayList;
    }

    public static Set Q1(Iterable iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        L1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set R1(Iterable iterable) {
        m.e(iterable, "<this>");
        boolean z6 = iterable instanceof Collection;
        y yVar = y.f23207h;
        if (z6) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return AbstractC1909d.h0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(D.I0(collection.size()));
                L1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            L1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : AbstractC1909d.h0(linkedHashSet2.iterator().next());
            }
        }
        return yVar;
    }

    public static r S1(Iterable iterable) {
        m.e(iterable, "<this>");
        return new r(2, new C2237d(2, iterable));
    }

    public static ArrayList T1(Collection collection, Collection other) {
        m.e(collection, "<this>");
        m.e(other, "other");
        Iterator it = collection.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q.I0(collection, 10), q.I0(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new k(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int V0(int i3, List list) {
        if (i3 >= 0 && i3 <= p.A0(list)) {
            return p.A0(list) - i3;
        }
        StringBuilder sbT = p.t(i3, "Element index ", " must be in range [");
        sbT.append(new g(0, p.A0(list), 1));
        sbT.append("].");
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public static final int W0(int i3, List list) {
        if (i3 >= 0 && i3 <= list.size()) {
            return list.size() - i3;
        }
        StringBuilder sbT = p.t(i3, "Position index ", " must be in range [");
        sbT.append(new g(0, list.size(), 1));
        sbT.append("].");
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public static O7.k X0(List list) {
        m.e(list, "<this>");
        return new O7.k(list);
    }

    public static N7.p Y0(Iterable iterable) {
        m.e(iterable, "<this>");
        return new N7.p(4, iterable);
    }

    public static double Z0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i3 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i3++;
            if (i3 < 0) {
                p.G0();
                throw null;
            }
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i3);
    }

    public static ArrayList a1(Iterable iterable, int i3) {
        AbstractC1911f.k(i3, i3);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            m.e(iterator, "iterator");
            Iterator itT = !iterator.hasNext() ? v.f23204h : d.T(new J(i3, i3, iterator, null));
            while (itT.hasNext()) {
                arrayList.add((List) itT.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i3) + (size % i3 == 0 ? 0 : 1));
        int i9 = 0;
        while (i9 >= 0 && i9 < size) {
            int i10 = size - i9;
            if (i3 <= i10) {
                i10 = i3;
            }
            ArrayList arrayList3 = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList3.add(list.get(i11 + i9));
            }
            arrayList2.add(arrayList3);
            i9 += i3;
        }
        return arrayList2;
    }

    public static boolean b1(Iterable iterable, Object obj) {
        m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return l1(iterable, obj) >= 0;
    }

    public static List c1(Iterable iterable) {
        m.e(iterable, "<this>");
        return N1(Q1(iterable));
    }

    public static List d1(Iterable iterable, int i3) {
        ArrayList arrayList;
        m.e(iterable, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(f.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 == 0) {
            return N1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i3;
            if (size <= 0) {
                return w.f23205h;
            }
            if (size == 1) {
                return P.i0(p1(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i3 < size2) {
                        arrayList.add(list.get(i3));
                        i3++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i3);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i9 = 0;
        for (Object obj : iterable) {
            if (i9 >= i3) {
                arrayList.add(obj);
            } else {
                i9++;
            }
        }
        return p.E0(arrayList);
    }

    public static List e1(List list) {
        m.e(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return J1(list, size);
    }

    public static ArrayList f1(Collection collection) {
        m.e(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object g1(Iterable iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return h1((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object h1(List list) {
        m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object i1(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object j1(List list) {
        m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object k1(int i3, List list) {
        m.e(list, "<this>");
        if (i3 < 0 || i3 >= list.size()) {
            return null;
        }
        return list.get(i3);
    }

    public static int l1(Iterable iterable, Object obj) {
        m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i3 = 0;
        for (Object obj2 : iterable) {
            if (i3 < 0) {
                p.H0();
                throw null;
            }
            if (m.a(obj, obj2)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static final void m1(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, CharSequence charSequence, j jVar) throws IOException {
        m.e(iterable, "<this>");
        m.e(buffer, "buffer");
        m.e(separator, "separator");
        m.e(prefix, "prefix");
        m.e(postfix, "postfix");
        buffer.append(prefix);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            O7.r.m(buffer, obj, jVar);
        }
        buffer.append(postfix);
    }

    public static void n1(Iterable iterable, Appendable appendable, String str, String str2, String str3, j jVar, int i3) throws IOException {
        if ((i3 & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i3 & 4) != 0 ? "" : str2;
        String str6 = (i3 & 8) != 0 ? "" : str3;
        if ((i3 & 64) != 0) {
            jVar = null;
        }
        m1(iterable, appendable, str4, str5, str6, "...", jVar);
    }

    public static String o1(Iterable iterable, CharSequence charSequence, String str, String str2, j jVar, int i3) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i3 & 2) != 0 ? "" : str;
        String str3 = (i3 & 4) != 0 ? "" : str2;
        if ((i3 & 32) != 0) {
            jVar = null;
        }
        m.e(iterable, "<this>");
        m.e(separator, "separator");
        m.e(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        m1(iterable, sb, separator, prefix, str3, "...", jVar);
        return sb.toString();
    }

    public static Object p1(Iterable iterable) {
        m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return q1((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object q1(List list) {
        m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(p.A0(list));
    }

    public static Object r1(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object s1(List list) {
        m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable t1(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable u1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object v1(List list, B b9) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (b9.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static ArrayList w1(Iterable iterable, Object obj) {
        m.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList(q.I0(iterable, 10));
        boolean z6 = false;
        for (Object obj2 : iterable) {
            boolean z9 = true;
            if (!z6 && m.a(obj2, obj)) {
                z6 = true;
                z9 = false;
            }
            if (z9) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList x1(Iterable iterable, Iterable iterable2) {
        m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return A1((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        u.M0(arrayList, iterable);
        u.M0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList y1(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return z1(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        u.M0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList z1(Object obj, Collection collection) {
        m.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }
}
