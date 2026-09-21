package N7;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public final class l implements m {

    public final int f7456a;

    public final Object f7457b;

    public final Object f7458c;

    public l(Object obj, Object obj2, int i3) {
        this.f7456a = i3;
        this.f7457b = obj;
        this.f7458c = obj2;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7456a) {
            case 0:
                return new k(this);
            case 1:
                m mVar = (m) this.f7457b;
                ArrayList arrayList = new ArrayList();
                Iterator it = mVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                p078i6.t.L0((Comparator) this.f7458c, arrayList);
                return arrayList.iterator();
            default:
                return new p160s6.h(this);
        }
    }

    public l(File start) {
        this.f7456a = 2;
        p160s6.j jVar = p160s6.j.f27373h;
        kotlin.jvm.internal.m.e(start, "start");
        this.f7457b = start;
        this.f7458c = jVar;
    }
}
