package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends p078i6.s {
    public static void K0(java.util.List list) {
        if (list.size() > 1) {
            java.util.Collections.sort(list);
        }
    }

    public static void L0(java.util.Comparator comparator, java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        if (list.size() > 1) {
            java.util.Collections.sort(list, comparator);
        }
    }
}
