package N7;

import D1.X;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import p153r8.C2713y;

public final class r implements Iterable, p201y6.a {

    public final int f7464h;

    public final Object f7465i;

    public r(int i3, Object obj) {
        this.f7464h = i3;
        this.f7465i = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7464h) {
            case 0:
                return ((m) this.f7465i).iterator();
            case 1:
                return kotlin.jvm.internal.m.h((Object[]) this.f7465i);
            case 2:
                return new d((Iterator) ((Function0) this.f7465i).invoke());
            default:
                return new X((C2713y) this.f7465i);
        }
    }
}
