package p078i6;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.m;
import p194x6.j;
import p201y6.a;
import p201y6.b;

public abstract class u extends t {
    public static void M0(Collection collection, Iterable elements) {
        m.e(collection, "<this>");
        m.e(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void N0(List list, Object[] elements) {
        m.e(list, "<this>");
        m.e(elements, "elements");
        list.addAll(m.S(elements));
    }

    public static final Collection O0(Iterable iterable) {
        m.e(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : o.N1(iterable);
    }

    public static final boolean P0(Iterable iterable, j jVar) {
        Iterator it = iterable.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (((Boolean) jVar.invoke(it.next())).booleanValue()) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    public static void Q0(List list, j predicate) {
        int iA0;
        m.e(list, "<this>");
        m.e(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof a) || (list instanceof b)) {
                P0(list, predicate);
                return;
            } else {
                E.e(list, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int iA1 = p.A0(list);
        int i3 = 0;
        if (iA1 >= 0) {
            int i9 = 0;
            while (true) {
                Object obj = list.get(i3);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i9 != i3) {
                        list.set(i9, obj);
                    }
                    i9++;
                }
                if (i3 == iA1) {
                    break;
                } else {
                    i3++;
                }
            }
            i3 = i9;
        }
        if (i3 >= list.size() || i3 > (iA0 = p.A0(list))) {
            return;
        }
        while (true) {
            list.remove(iA0);
            if (iA0 == i3) {
                return;
            } else {
                iA0--;
            }
        }
    }

    public static Object R0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object S0(List list) {
        m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object T0(List list) {
        m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(p.A0(list));
    }

    public static Object U0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(p.A0(abstractList));
    }
}
