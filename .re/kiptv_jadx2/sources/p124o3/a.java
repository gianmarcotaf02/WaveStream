package p124o3;

import android.util.SparseArray;
import com.google.android.gms.internal.play_billing.M0;
import java.util.HashMap;
import p013b3.c;

public abstract class a {

    public static final SparseArray f26109a = new SparseArray();

    public static final HashMap f26110b;

    static {
        HashMap map = new HashMap();
        f26110b = map;
        map.put(c.f17869h, 0);
        map.put(c.f17870i, 1);
        map.put(c.j, 2);
        for (c cVar : map.keySet()) {
            f26109a.append(((Integer) f26110b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f26110b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i3) {
        c cVar = (c) f26109a.get(i3);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(M0.l(i3, "Unknown Priority for value "));
    }
}
