package p035d7;

import java.util.ArrayList;
import java.util.Iterator;
import p078i6.q;

public final class m {

    public final r f21277a;

    public final ArrayList f21278b;

    public final String f21279c;

    public final m f21280d;

    public m(r rVar, ArrayList arrayList, String str) {
        this.f21277a = rVar;
        this.f21278b = arrayList;
        this.f21279c = str;
        m mVar = null;
        if (str != null) {
            r rVarA = rVar != null ? rVar.a() : null;
            ArrayList arrayList2 = new ArrayList(q.I0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r rVar2 = (r) it.next();
                arrayList2.add(rVar2 != null ? rVar2.a() : null);
            }
            mVar = new m(rVarA, arrayList2, null);
        }
        this.f21280d = mVar;
    }
}
