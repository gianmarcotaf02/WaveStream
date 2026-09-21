package p078i6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.m;

public abstract class t extends s {
    public static void K0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void L0(Comparator comparator, List list) {
        m.e(list, "<this>");
        m.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
