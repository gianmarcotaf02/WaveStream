package p063g8;

import java.util.ArrayList;
import java.util.Iterator;

public final class g implements q {

    public final ArrayList f22377a;

    public g(ArrayList arrayList) {
        this.f22377a = arrayList;
    }

    @Override
    public final boolean test(Object obj) {
        ArrayList arrayList = this.f22377a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((q) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
