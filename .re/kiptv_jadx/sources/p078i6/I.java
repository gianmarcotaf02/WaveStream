package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class I extends com.google.crypto.tink.shaded.protobuf.AbstractC1909d {
    public static java.util.LinkedHashSet m0(java.util.Set set, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(set, "<this>");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p078i6.D.I0(set.size()));
        boolean z6 = false;
        for (java.lang.Object obj2 : set) {
            boolean z9 = true;
            if (!z6 && kotlin.jvm.internal.m.a(obj2, obj)) {
                z6 = true;
                z9 = false;
            }
            if (z9) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static java.util.Set n0(java.util.Set set, java.lang.Iterable elements) {
        kotlin.jvm.internal.m.e(set, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        java.util.Collection<?> collectionO0 = p078i6.u.O0(elements);
        if (collectionO0.isEmpty()) {
            return p078i6.o.R1(set);
        }
        if (!(collectionO0 instanceof java.util.Set)) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(set);
            linkedHashSet.removeAll(collectionO0);
            return linkedHashSet;
        }
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        for (java.lang.Object obj : set) {
            if (!((java.util.Set) collectionO0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static java.util.LinkedHashSet o0(java.util.Set set, java.lang.Iterable elements) {
        int size;
        kotlin.jvm.internal.m.e(set, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        java.lang.Integer numValueOf = elements instanceof java.util.Collection ? java.lang.Integer.valueOf(((java.util.Collection) elements).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p078i6.D.I0(size));
        linkedHashSet.addAll(set);
        p078i6.u.M0(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static java.util.LinkedHashSet p0(java.util.Set set, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(set, "<this>");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p078i6.D.I0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static java.util.Set q0(java.lang.Object... objArr) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }
}
