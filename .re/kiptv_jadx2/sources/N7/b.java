package N7;

import java.util.HashSet;
import java.util.Iterator;
import p078i6.AbstractC2251b;

public final class b extends AbstractC2251b {
    public final Iterator j;

    public final p194x6.j f7432k;

    public final HashSet f7433l;

    public b(Iterator source, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(source, "source");
        this.j = source;
        this.f7432k = jVar;
        this.f7433l = new HashSet();
    }

    @Override
    public final void a() {
        Object next;
        do {
            Iterator it = this.j;
            if (!it.hasNext()) {
                this.f23191h = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f7433l.add(this.f7432k.invoke(next)));
        this.f23192i = next;
        this.f23191h = 1;
    }
}
