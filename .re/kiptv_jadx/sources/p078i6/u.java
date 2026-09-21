package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u extends p078i6.t {
    public static void M0(java.util.Collection collection, java.lang.Iterable elements) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        if (elements instanceof java.util.Collection) {
            collection.addAll((java.util.Collection) elements);
            return;
        }
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void N0(java.util.List list, java.lang.Object[] elements) {
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        list.addAll(p078i6.m.S(elements));
    }

    public static final java.util.Collection O0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return iterable instanceof java.util.Collection ? (java.util.Collection) iterable : p078i6.o.N1(iterable);
    }

    public static final boolean P0(java.lang.Iterable iterable, p194x6.j jVar) {
        java.util.Iterator it = iterable.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (((java.lang.Boolean) jVar.invoke(it.next())).booleanValue()) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    public static void Q0(java.util.List list, p194x6.j predicate) {
        int iA0;
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(predicate, "predicate");
        if (!(list instanceof java.util.RandomAccess)) {
            if (!(list instanceof p201y6.a) || (list instanceof p201y6.b)) {
                P0(list, predicate);
                return;
            } else {
                kotlin.jvm.internal.E.e(list, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int iA1 = p078i6.p.A0(list);
        int i3 = 0;
        if (iA1 >= 0) {
            int i9 = 0;
            while (true) {
                java.lang.Object obj = list.get(i3);
                if (!((java.lang.Boolean) predicate.invoke(obj)).booleanValue()) {
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
        if (i3 >= list.size() || i3 > (iA0 = p078i6.p.A0(list))) {
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

    public static java.lang.Object R0(java.util.ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static java.lang.Object S0(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static java.lang.Object T0(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(p078i6.p.A0(list));
    }

    public static java.lang.Object U0(java.util.AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(p078i6.p.A0(abstractList));
    }
}
