package p161s7;

import L7.b;
import N6.InterfaceC0689c;
import Q6.S;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p078i6.q;
import p078i6.w;

public final class a implements b {

    public static final a f27377i = new a(0);

    public final int f27378h;

    public a(int i3) {
        this.f27378h = i3;
    }

    @Override
    public final Iterable a(Object obj) {
        Collection collectionI;
        switch (this.f27378h) {
            case 0:
                int i3 = d.f27382a;
                Collection collectionI2 = ((S) obj).i();
                ArrayList arrayList = new ArrayList(q.I0(collectionI2, 10));
                Iterator it = ((ArrayList) collectionI2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((S) it.next()).a());
                }
                return arrayList;
            default:
                InterfaceC0689c interfaceC0689c = (InterfaceC0689c) obj;
                return (interfaceC0689c == null || (collectionI = interfaceC0689c.i()) == null) ? w.f23205h : collectionI;
        }
    }
}
