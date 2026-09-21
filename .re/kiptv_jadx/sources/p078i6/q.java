package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends p078i6.p {
    public static int I0(java.lang.Iterable iterable, int i3) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : i3;
    }

    public static java.util.ArrayList J0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p078i6.u.M0(arrayList, (java.lang.Iterable) it.next());
        }
        return arrayList;
    }
}
