package p077i5;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: i5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2235b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f23084a = new ArrayList();

    public static ArrayList a() {
        ArrayList arrayList;
        ArrayList arrayList2 = f23084a;
        synchronized (arrayList2) {
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                P p2 = (P) ((WeakReference) it.next()).get();
                if (p2 != null) {
                    arrayList.add(p2);
                }
            }
        }
        return arrayList;
    }
}
