package O6;

import N6.H;
import N7.s;
import java.util.Iterator;
import java.util.List;
import p078i6.o;
import p078i6.v;

public final class i implements h {

    public final int f7988h;

    public final Object f7989i;

    public i(int i3, List list) {
        this.f7988h = i3;
        this.f7989i = list;
    }

    @Override
    public final boolean h(p101l7.c fqName) {
        switch (this.f7988h) {
            case 0:
                return O2.g.P(this, fqName);
            case 1:
                kotlin.jvm.internal.m.e(fqName, "fqName");
                Iterator it = ((Iterable) o.Y0((List) this.f7989i).f7463b).iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).h(fqName)) {
                        return true;
                    }
                }
                return false;
            default:
                return O2.g.P(this, fqName);
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.f7988h) {
            case 0:
                return ((List) this.f7989i).isEmpty();
            case 1:
                List list = (List) this.f7989i;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((h) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7988h) {
            case 0:
                return ((List) this.f7989i).iterator();
            case 1:
                return new N7.h(new N7.j(o.Y0((List) this.f7989i), k.f7994h, s.f7466h));
            default:
                return v.f23204h;
        }
    }

    @Override
    public final b k(p101l7.c fqName) {
        switch (this.f7988h) {
            case 0:
                return O2.g.J(this, fqName);
            case 1:
                kotlin.jvm.internal.m.e(fqName, "fqName");
                N7.h hVar = (N7.h) N7.o.q0(o.Y0((List) this.f7989i), new H(fqName, 1)).iterator();
                return (b) (!hVar.hasNext() ? null : hVar.next());
            default:
                kotlin.jvm.internal.m.e(fqName, "fqName");
                if (fqName.equals((p101l7.c) this.f7989i)) {
                    return p035d7.b.f21253a;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f7988h) {
            case 0:
                return ((List) this.f7989i).toString();
            default:
                return super.toString();
        }
    }

    public i(h[] hVarArr) {
        this.f7988h = 1;
        this.f7989i = p078i6.m.E0(hVarArr);
    }

    public i(p101l7.c fqNameToMatch) {
        this.f7988h = 2;
        kotlin.jvm.internal.m.e(fqNameToMatch, "fqNameToMatch");
        this.f7989i = fqNameToMatch;
    }
}
