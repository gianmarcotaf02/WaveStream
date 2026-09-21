package p078i6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;

public abstract class q extends p {
    public static int I0(Iterable iterable, int i3) {
        m.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i3;
    }

    public static ArrayList J0(Iterable iterable) {
        m.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            u.M0(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
