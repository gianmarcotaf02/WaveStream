package p078i6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m;

public abstract class I extends AbstractC1909d {
    public static LinkedHashSet m0(Set set, Object obj) {
        m.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(D.I0(set.size()));
        boolean z6 = false;
        for (Object obj2 : set) {
            boolean z9 = true;
            if (!z6 && m.a(obj2, obj)) {
                z6 = true;
                z9 = false;
            }
            if (z9) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set n0(Set set, Iterable elements) {
        m.e(set, "<this>");
        m.e(elements, "elements");
        Collection<?> collectionO0 = u.O0(elements);
        if (collectionO0.isEmpty()) {
            return o.R1(set);
        }
        if (!(collectionO0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionO0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionO0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet o0(Set set, Iterable elements) {
        int size;
        m.e(set, "<this>");
        m.e(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(D.I0(size));
        linkedHashSet.addAll(set);
        u.M0(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static LinkedHashSet p0(Set set, Object obj) {
        m.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(D.I0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set q0(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }
}
