package p060g5;

import D1.X;
import p126o6.b;

public final class d {
    public static e a(String str) {
        Object next;
        b bVar = e.f21884m;
        bVar.getClass();
        X x9 = new X(5, bVar);
        do {
            if (!x9.hasNext()) {
                next = null;
                break;
            }
            next = x9.next();
        } while (!((e) next).f21885h.equals(str));
        e eVar = (e) next;
        return eVar == null ? e.f21882k : eVar;
    }
}
